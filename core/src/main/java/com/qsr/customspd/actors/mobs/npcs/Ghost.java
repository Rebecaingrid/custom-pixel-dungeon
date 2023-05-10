/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2023 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.qsr.customspd.actors.mobs.npcs;

import com.qsr.customspd.Assets;
import com.qsr.customspd.Dungeon;
import com.qsr.customspd.Statistics;
import com.qsr.customspd.actors.Char;
import com.qsr.customspd.actors.buffs.AscensionChallenge;
import com.qsr.customspd.actors.buffs.Buff;
import com.qsr.customspd.actors.mobs.FetidRat;
import com.qsr.customspd.actors.mobs.GnollTrickster;
import com.qsr.customspd.actors.mobs.GreatCrab;
import com.qsr.customspd.actors.mobs.Mob;
import com.qsr.customspd.effects.CellEmitter;
import com.qsr.customspd.effects.Speck;
import com.qsr.customspd.items.Generator;
import com.qsr.customspd.items.armor.Armor;
import com.qsr.customspd.items.armor.LeatherArmor;
import com.qsr.customspd.items.armor.MailArmor;
import com.qsr.customspd.items.armor.PlateArmor;
import com.qsr.customspd.items.armor.ScaleArmor;
import com.qsr.customspd.items.weapon.Weapon;
import com.qsr.customspd.items.weapon.melee.MeleeWeapon;
import com.qsr.customspd.journal.Notes;
import com.qsr.customspd.levels.Level;
import com.qsr.customspd.levels.SewerLevel;
import com.qsr.customspd.messages.Messages;
import com.qsr.customspd.scenes.GameScene;
import com.qsr.customspd.sprites.GhostSprite;
import com.qsr.customspd.utils.GLog;
import com.qsr.customspd.windows.WndQuest;
import com.qsr.customspd.windows.WndSadGhost;
import com.watabou.noosa.Game;
import com.watabou.noosa.audio.Sample;
import com.watabou.utils.Bundle;
import com.watabou.utils.Callback;
import com.watabou.utils.Random;
import com.watabou.utils.Reflection;

public class Ghost extends NPC {

	{
		spriteClass = GhostSprite.class;
		
		flying = true;
		
		state = WANDERING;
	}

	@Override
	protected boolean act() {
		if (Dungeon.hero.buff(AscensionChallenge.class) != null){
			die(null);
			return true;
		}
		if (Quest.processed()) {
			target = Dungeon.hero.pos;
		}
		if (Dungeon.level.heroFOV[pos] && !Quest.completed()){
			Notes.add( Notes.Landmark.GHOST );
		}
		return super.act();
	}

	@Override
	public int defenseSkill( Char enemy ) {
		return INFINITE_EVASION;
	}
	
	@Override
	public float speed() {
		return Quest.processed() ? 2f : 0.5f;
	}
	
	@Override
	protected Char chooseEnemy() {
		return null;
	}

	@Override
	public void damage( int dmg, Object src ) {
		//do nothing
	}

	@Override
	public boolean add( Buff buff ) {
		return false;
	}
	
	@Override
	public boolean reset() {
		return true;
	}
	
	@Override
	public boolean interact(Char c) {
		sprite.turnTo( pos, c.pos );
		
		Sample.INSTANCE.play( Assets.Sounds.GHOST );

		if (c != Dungeon.hero){
			return super.interact(c);
		}
		
		if (Quest.given) {
			if (Quest.weapon != null) {
				if (Quest.processed) {
					Game.runOnRenderThread(new Callback() {
						@Override
						public void call() {
							GameScene.show(new WndSadGhost(Ghost.this, Quest.type));
						}
					});
				} else {
					Game.runOnRenderThread(new Callback() {
						@Override
						public void call() {
							switch (Quest.type) {
								case 0:
								default:
									GameScene.show(new WndQuest(Ghost.this, Messages.get(Ghost.this, "rat_2")));
									break;
								case 1:
									GameScene.show(new WndQuest(Ghost.this, Messages.get(Ghost.this, "gnoll_2")));
									break;
								case 2:
									GameScene.show(new WndQuest(Ghost.this, Messages.get(Ghost.this, "crab_2")));
									break;
							}
						}
					});

					int newPos = -1;
					for (int i = 0; i < 10; i++) {
						newPos = Dungeon.level.randomRespawnCell( this );
						if (newPos != -1) {
							break;
						}
					}
					if (newPos != -1) {

						CellEmitter.get(pos).start(Speck.factory(Speck.LIGHT), 0.2f, 3);
						pos = newPos;
						sprite.place(pos);
						sprite.visible = Dungeon.level.heroFOV[pos];
					}
				}
			}
		} else {
			Mob questBoss;
			String txt_quest;

			switch (Quest.type){
				case 0: default:
					questBoss = new FetidRat();
					txt_quest = Messages.get(this, "rat_1", Messages.titleCase(Dungeon.hero.name())); break;
				case 1:
					questBoss = new GnollTrickster();
					txt_quest = Messages.get(this, "gnoll_1", Messages.titleCase(Dungeon.hero.name())); break;
				case 2:
					questBoss = new GreatCrab();
					txt_quest = Messages.get(this, "crab_1", Messages.titleCase(Dungeon.hero.name())); break;
			}

			questBoss.pos = Dungeon.level.randomRespawnCell( this );

			if (questBoss.pos != -1) {
				GameScene.add(questBoss);
				Quest.given = true;
				Notes.add( Notes.Landmark.GHOST );
				Game.runOnRenderThread(new Callback() {
					@Override
					public void call() {
						GameScene.show( new WndQuest( Ghost.this, txt_quest ) );
					}
				});
			}

		}

		return true;
	}

	public static class Quest {
		
		private static boolean spawned;

		private static int type;

		private static boolean given;
		private static boolean processed;
		
		private static String level;
		
		public static Weapon weapon;
		public static Armor armor;
		public static Weapon.Enchantment enchant;
		public static Armor.Glyph glyph;
		
		public static void reset() {
			spawned = false;
			
			weapon = null;
			armor = null;
			enchant = null;
			glyph = null;
		}
		
		private static final String NODE		= "sadGhost";
		
		private static final String SPAWNED		= "spawned";
		private static final String TYPE        = "type";
		private static final String GIVEN		= "given";
		private static final String PROCESSED	= "processed";
		private static final String LEVEL		= "level";
		private static final String WEAPON		= "weapon";
		private static final String ARMOR		= "armor";
		private static final String ENCHANT		= "enchant";
		private static final String GLYPH		= "glyph";
		
		public static void storeInBundle( Bundle bundle ) {
			
			Bundle node = new Bundle();
			
			node.put( SPAWNED, spawned );
			
			if (spawned) {
				
				node.put( TYPE, type );
				
				node.put( GIVEN, given );
				node.put( LEVEL, level );
				node.put( PROCESSED, processed );
				
				node.put( WEAPON, weapon );
				node.put( ARMOR, armor );

				if (enchant != null) {
					node.put(ENCHANT, enchant);
					node.put(GLYPH, glyph);
				}
			}
			
			bundle.put( NODE, node );
		}
		
		public static void restoreFromBundle( Bundle bundle ) {
			
			Bundle node = bundle.getBundle( NODE );

			if (!node.isNull() && (spawned = node.getBoolean( SPAWNED ))) {

				type = node.getInt(TYPE);
				given	= node.getBoolean( GIVEN );
				processed = node.getBoolean( PROCESSED );

				level	= node.getString( LEVEL );
				
				weapon	= (Weapon)node.get( WEAPON );
				armor	= (Armor)node.get( ARMOR );

				if (node.contains(ENCHANT)) {
					enchant = (Weapon.Enchantment) node.get(ENCHANT);
					glyph   = (Armor.Glyph) node.get(GLYPH);
				}
			} else {
				reset();
			}
		}
		
		public static void spawn( Level lvl ) {
			Ghost ghost = new Ghost();
			do {
				ghost.pos = lvl.randomRespawnCell( ghost );
			} while (ghost.pos == -1);
			lvl.mobs.add( ghost );

			spawned = true;
			//dungeon depth determines type of quest.
			//depth2=fetid rat, 3=gnoll trickster, 4=great crab
			type = (Dungeon.depth + 1) % 3;

			given = false;
			processed = false;
			level = Dungeon.levelName;

			//50%:tier2, 30%:tier3, 15%:tier4, 5%:tier5
			switch (Random.chances(new float[]{0, 0, 10, 6, 3, 1})){
				default:
				case 2: armor = new LeatherArmor(); break;
				case 3: armor = new MailArmor();    break;
				case 4: armor = new ScaleArmor();   break;
				case 5: armor = new PlateArmor();   break;
			}
			//50%:tier2, 30%:tier3, 15%:tier4, 5%:tier5
			int wepTier = Random.chances(new float[]{0, 0, 10, 6, 3, 1});
			Generator.Category c = Generator.wepTiers[wepTier - 1];
			weapon = (MeleeWeapon) Reflection.newInstance(c.classes[Random.chances(c.probs)]);

			//50%:+0, 30%:+1, 15%:+2, 5%:+3
			float itemLevelRoll = Random.Float();
			int itemLevel;
			if (itemLevelRoll < 0.5f){
				itemLevel = 0;
			} else if (itemLevelRoll < 0.8f){
				itemLevel = 1;
			} else if (itemLevelRoll < 0.95f){
				itemLevel = 2;
			} else {
				itemLevel = 3;
			}
			weapon.upgrade(itemLevel);
			armor.upgrade(itemLevel);

			//10% to be enchanted. We store it separately so enchant status isn't revealed early
			if (Random.Int(10) == 0){
				enchant = Weapon.Enchantment.random();
				glyph = Armor.Glyph.random();
			}
		}
		
		public static void process() {
			if (spawned && given && !processed && (level.equals(Dungeon.levelName))) {
				GLog.n( Messages.get(Ghost.class, "find_me") );
				Sample.INSTANCE.play( Assets.Sounds.GHOST );
				processed = true;
				Statistics.questScores[0] = 1000;
			}
		}
		
		public static void complete() {
			weapon = null;
			armor = null;
			
			Notes.remove( Notes.Landmark.GHOST );
		}

		public static boolean processed(){
			return spawned && processed;
		}
		
		public static boolean completed(){
			return processed() && weapon == null && armor == null;
		}
	}
}
