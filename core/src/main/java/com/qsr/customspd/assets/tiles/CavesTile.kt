package com.qsr.customspd.assets.tiles

enum class CavesTile(override val path: String, override val pos: Int) : TileAsset {
    FLOOR("environment/caves/floor.png", 0),
    FLOOR_DECO("environment/caves/floor_deco.png", 1),
    GRASS("environment/caves/grass.png", 2),
    EMBERS("environment/caves/embers.png", 3),
    FLOOR_SP("environment/caves/floor_sp.png", 4),
    FLOOR_ALT_1("environment/caves/floor_alt_1.png", 6),
    FLOOR_DECO_ALT("environment/caves/floor_deco_alt.png", 7),
    GRASS_ALT("environment/caves/grass_alt.png", 8),
    EMBERS_ALT("environment/caves/embers_alt.png", 9),
    FLOOR_SP_ALT("environment/caves/floor_sp_alt.png", 10),
    FLOOR_ALT_2("environment/caves/floor_alt_2.png", 12),
    ENTRANCE("environment/caves/entrance.png", 16),
    EXIT("environment/caves/exit.png", 17),
    WELL("environment/caves/well.png", 18),
    EMPTY_WELL("environment/caves/empty_well.png", 19),
    PEDESTAL("environment/caves/pedestal.png", 20),
    WATER_0("environment/caves/water_0.png", 32),
    WATER_1("environment/caves/water_1.png", 33),
    WATER_2("environment/caves/water_2.png", 34),
    WATER_3("environment/caves/water_3.png", 35),
    WATER_4("environment/caves/water_4.png", 36),
    WATER_5("environment/caves/water_5.png", 37),
    WATER_6("environment/caves/water_6.png", 38),
    WATER_7("environment/caves/water_7.png", 39),
    WATER_8("environment/caves/water_8.png", 40),
    WATER_9("environment/caves/water_9.png", 41),
    WATER_10("environment/caves/water_10.png", 42),
    WATER_11("environment/caves/water_11.png", 43),
    WATER_12("environment/caves/water_12.png", 44),
    WATER_13("environment/caves/water_13.png", 45),
    WATER_14("environment/caves/water_14.png", 46),
    WATER_15("environment/caves/water_15.png", 47),
    CHASM("environment/caves/chasm.png", 48),
    CHASM_FLOOR("environment/caves/chasm_floor.png", 49),
    CHASM_FLOOR_SP("environment/caves/chasm_floor_sp.png", 50),
    CHASM_WALL("environment/caves/chasm_wall.png", 51),
    CHASM_WATER("environment/caves/chasm_water.png", 52),
    FLAT_WALL("environment/caves/flat_wall.png", 64),
    FLAT_WALL_DECO("environment/caves/flat_wall_deco.png", 65),
    FLAT_BOOKSHELF("environment/caves/flat_bookshelf.png", 66),
    FLAT_WALL_ALT("environment/caves/flat_wall_alt.png", 68),
    FLAT_WALL_DECO_ALT("environment/caves/flat_wall_deco_alt.png", 69),
    FLAT_BOOKSHELF_ALT("environment/caves/flat_bookshelf_alt.png", 70),
    FLAT_DOOR("environment/caves/flat_door.png", 80),
    FLAT_DOOR_OPEN("environment/caves/flat_door_open.png", 81),
    FLAT_DOOR_LOCKED("environment/caves/flat_door_locked.png", 82),
    FLAT_DOOR_CRYSTAL("environment/caves/flat_door_crystal.png", 83),
    UNLOCKED_EXIT("environment/caves/unlocked_exit.png", 84),
    LOCKED_EXIT("environment/caves/locked_exit.png", 85),
    FLAT_SIGN("environment/caves/flat_sign.png", 96),
    FLAT_STATUE("environment/caves/flat_statue.png", 97),
    FLAT_STATUE_SP("environment/caves/flat_statue_sp.png", 98),
    FLAT_ALCHEMY_POT("environment/caves/flat_alchemy_pot.png", 99),
    FLAT_BARRICADE("environment/caves/flat_barricade.png", 100),
    FLAT_HIGH_GRASS("environment/caves/flat_high_grass.png", 101),
    FLAT_FURROWED_GRASS("environment/caves/flat_furrowed_grass.png", 102),
    FLAT_HIGH_GRASS_ALT("environment/caves/flat_high_grass_alt.png", 104),
    FLAT_FURROWED_ALT("environment/caves/flat_furrowed_alt.png", 105),
    RAISED_WALL("environment/caves/raised_wall.png", 112),
    RAISED_WALL_OPEN_RIGHT("environment/caves/raised_wall_open_right.png", 113),
    RAISED_WALL_OPEN_LEFT("environment/caves/raised_wall_open_left.png", 114),
    RAISED_WALL_OPEN_BOTH("environment/caves/raised_wall_open_both.png", 115),
    RAISED_WALL_DECO("environment/caves/raised_wall_deco.png", 116),
    RAISED_WALL_DECO_OPEN_RIGHT("environment/caves/raised_wall_deco_open_right.png", 117),
    RAISED_WALL_DECO_OPEN_LEFT("environment/caves/raised_wall_deco_open_left.png", 118),
    RAISED_WALL_DECO_OPEN_BOTH("environment/caves/raised_wall_deco_open_both.png", 119),
    RAISED_WALL_DOOR("environment/caves/raised_wall_door.png", 120),
    RAISED_WALL_DOOR_OPEN_RIGHT("environment/caves/raised_wall_door_open_right.png", 121),
    RAISED_WALL_DOOR_OPEN_LEFT("environment/caves/raised_wall_door_open_left.png", 122),
    RAISED_WALL_DOOR_OPEN_BOTH("environment/caves/raised_wall_door_open_both.png", 123),
    RAISED_WALL_BOOKSHELF("environment/caves/raised_wall_bookshelf.png", 124),
    RAISED_WALL_BOOKSHELF_OPEN_RIGHT("environment/caves/raised_wall_bookshelf_open_right.png", 125),
    RAISED_WALL_BOOKSHELF_OPEN_LEFT("environment/caves/raised_wall_bookshelf_open_left.png", 126),
    RAISED_WALL_BOOKSHELF_OPEN_BOTH("environment/caves/raised_wall_bookshelf_open_both.png", 127),
    RAISED_WALL_ALT("environment/caves/raised_wall_alt.png", 128),
    RAISED_WALL_ALT_OPEN_RIGHT("environment/caves/raised_wall_alt_open_right.png", 129),
    RAISED_WALL_ALT_OPEN_LEFT("environment/caves/raised_wall_alt_open_left.png", 130),
    RAISED_WALL_ALT_OPEN_BOTH("environment/caves/raised_wall_alt_open_both.png", 131),
    RAISED_WALL_DECO_ALT("environment/caves/raised_wall_deco_alt.png", 132),
    RAISED_WALL_DECO_ALT_OPEN_RIGHT("environment/caves/raised_wall_deco_alt_open_right.png", 133),
    RAISED_WALL_DECO_ALT_OPEN_LEFT("environment/caves/raised_wall_deco_alt_open_left.png", 134),
    RAISED_WALL_DECO_ALT_OPEN_BOTH("environment/caves/raised_wall_deco_alt_open_both.png", 135),
    RAISED_WALL_BOOKSHELF_ALT("environment/caves/raised_wall_bookshelf_alt.png", 140),
    RAISED_WALL_BOOKSHELF_ALT_OPEN_RIGHT("environment/caves/raised_wall_bookshelf_alt_open_right.png", 141),
    RAISED_WALL_BOOKSHELF_ALT_OPEN_LEFT("environment/caves/raised_wall_bookshelf_alt_open_left.png", 142),
    RAISED_WALL_BOOKSHELF_ALT_OPEN_BOTH("environment/caves/raised_wall_bookshelf_alt_open_both.png", 143),
    RAISED_DOOR("environment/caves/raised_door.png", 144),
    RAISED_DOOR_OPEN("environment/caves/raised_door_open.png", 145),
    RAISED_DOOR_LOCKED("environment/caves/raised_door_locked.png", 146),
    RAISED_DOOR_CRYSTAL("environment/caves/raised_door_crystal.png", 147),
    RAISED_DOOR_SIDEWAYS("environment/caves/raised_door_sideways.png", 148),
    RAISED_SIGN("environment/caves/raised_sign.png", 160),
    RAISED_STATUE("environment/caves/raised_statue.png", 161),
    RAISED_STATUE_SP("environment/caves/raised_statue_sp.png", 162),
    RAISED_ALCHEMY_POT("environment/caves/raised_alchemy_pot.png", 163),
    RAISED_BARRICADE("environment/caves/raised_barricade.png", 164),
    RAISED_HIGH_GRASS("environment/caves/raised_high_grass.png", 165),
    RAISED_FURROWED_GRASS("environment/caves/raised_furrowed_grass.png", 166),
    RAISED_HIGH_GRASS_ALT("environment/caves/raised_high_grass_alt.png", 169),
    RAISED_FURROWED_ALT("environment/caves/raised_furrowed_alt.png", 170),
    WALL_INTERNAL_0("environment/caves/wall_internal_0.png", 176),
    WALL_INTERNAL_1("environment/caves/wall_internal_1.png", 177),
    WALL_INTERNAL_2("environment/caves/wall_internal_2.png", 178),
    WALL_INTERNAL_3("environment/caves/wall_internal_3.png", 179),
    WALL_INTERNAL_4("environment/caves/wall_internal_4.png", 180),
    WALL_INTERNAL_5("environment/caves/wall_internal_5.png", 181),
    WALL_INTERNAL_6("environment/caves/wall_internal_6.png", 182),
    WALL_INTERNAL_7("environment/caves/wall_internal_7.png", 183),
    WALL_INTERNAL_8("environment/caves/wall_internal_8.png", 184),
    WALL_INTERNAL_9("environment/caves/wall_internal_9.png", 185),
    WALL_INTERNAL_10("environment/caves/wall_internal_10.png", 186),
    WALL_INTERNAL_11("environment/caves/wall_internal_11.png", 187),
    WALL_INTERNAL_12("environment/caves/wall_internal_12.png", 188),
    WALL_INTERNAL_13("environment/caves/wall_internal_13.png", 189),
    WALL_INTERNAL_14("environment/caves/wall_internal_14.png", 190),
    WALL_INTERNAL_15("environment/caves/wall_internal_15.png", 191),
    WALL_INTERNAL_WOODEN_0("environment/caves/wall_internal_wooden_0.png", 192),
    WALL_INTERNAL_WOODEN_1("environment/caves/wall_internal_wooden_1.png", 193),
    WALL_INTERNAL_WOODEN_2("environment/caves/wall_internal_wooden_2.png", 194),
    WALL_INTERNAL_WOODEN_3("environment/caves/wall_internal_wooden_3.png", 195),
    WALL_INTERNAL_WOODEN_4("environment/caves/wall_internal_wooden_4.png", 196),
    WALL_INTERNAL_WOODEN_5("environment/caves/wall_internal_wooden_5.png", 197),
    WALL_INTERNAL_WOODEN_6("environment/caves/wall_internal_wooden_6.png", 198),
    WALL_INTERNAL_WOODEN_7("environment/caves/wall_internal_wooden_7.png", 199),
    WALL_INTERNAL_WOODEN_8("environment/caves/wall_internal_wooden_8.png", 200),
    WALL_INTERNAL_WOODEN_9("environment/caves/wall_internal_wooden_9.png", 201),
    WALL_INTERNAL_WOODEN_10("environment/caves/wall_internal_wooden_10.png", 202),
    WALL_INTERNAL_WOODEN_11("environment/caves/wall_internal_wooden_11.png", 203),
    WALL_INTERNAL_WOODEN_12("environment/caves/wall_internal_wooden_12.png", 204),
    WALL_INTERNAL_WOODEN_13("environment/caves/wall_internal_wooden_13.png", 205),
    WALL_INTERNAL_WOODEN_14("environment/caves/wall_internal_wooden_14.png", 206),
    WALL_INTERNAL_WOODEN_15("environment/caves/wall_internal_wooden_15.png", 207),
    WALL_OVERHANG_0("environment/caves/wall_overhang_0.png", 208),
    WALL_OVERHANG_1("environment/caves/wall_overhang_1.png", 209),
    WALL_OVERHANG_2("environment/caves/wall_overhang_2.png", 210),
    WALL_OVERHANG_3("environment/caves/wall_overhang_3.png", 211),
    DOOR_SIDEWAYS_OVERHANG_0("environment/caves/door_sideways_overhang_0.png", 212),
    DOOR_SIDEWAYS_OVERHANG_1("environment/caves/door_sideways_overhang_1.png", 213),
    DOOR_SIDEWAYS_OVERHANG_2("environment/caves/door_sideways_overhang_2.png", 214),
    DOOR_SIDEWAYS_OVERHANG_3("environment/caves/door_sideways_overhang_3.png", 215),
    DOOR_SIDEWAYS_OVERHANG_OPEN_0("environment/caves/door_sideways_overhang_open_0.png", 216),
    DOOR_SIDEWAYS_OVERHANG_OPEN_1("environment/caves/door_sideways_overhang_open_1.png", 217),
    DOOR_SIDEWAYS_OVERHANG_OPEN_2("environment/caves/door_sideways_overhang_open_2.png", 218),
    DOOR_SIDEWAYS_OVERHANG_OPEN_3("environment/caves/door_sideways_overhang_open_3.png", 219),
    DOOR_SIDEWAYS_OVERHANG_LOCKED_0("environment/caves/door_sideways_overhang_locked_0.png", 220),
    DOOR_SIDEWAYS_OVERHANG_LOCKED_1("environment/caves/door_sideways_overhang_locked_1.png", 221),
    DOOR_SIDEWAYS_OVERHANG_LOCKED_2("environment/caves/door_sideways_overhang_locked_2.png", 222),
    DOOR_SIDEWAYS_OVERHANG_LOCKED_3("environment/caves/door_sideways_overhang_locked_3.png", 223),
    DOOR_SIDEWAYS_OVERHANG_CRYSTAL_0("environment/caves/door_sideways_overhang_crystal_0.png", 224),
    DOOR_SIDEWAYS_OVERHANG_CRYSTAL_1("environment/caves/door_sideways_overhang_crystal_1.png", 225),
    DOOR_SIDEWAYS_OVERHANG_CRYSTAL_2("environment/caves/door_sideways_overhang_crystal_2.png", 226),
    DOOR_SIDEWAYS_OVERHANG_CRYSTAL_3("environment/caves/door_sideways_overhang_crystal_3.png", 227),
    WALL_OVERHANG_WOODEN_0("environment/caves/wall_overhang_wooden_0.png", 228),
    WALL_OVERHANG_WOODEN_1("environment/caves/wall_overhang_wooden_1.png", 229),
    WALL_OVERHANG_WOODEN_2("environment/caves/wall_overhang_wooden_2.png", 230),
    WALL_OVERHANG_WOODEN_3("environment/caves/wall_overhang_wooden_3.png", 231),
    DOOR_OVERHANG("environment/caves/door_overhang.png", 233),
    DOOR_OVERHANG_OPEN("environment/caves/door_overhang_open.png", 234),
    DOOR_OVERHANG_CRYSTAL("environment/caves/door_overhang_crystal.png", 235),
    DOOR_SIDEWAYS("environment/caves/door_sideways.png", 236),
    DOOR_SIDEWAYS_LOCKED("environment/caves/door_sideways_locked.png", 237),
    DOOR_SIDEWAYS_CRYSTAL("environment/caves/door_sideways_crystal.png", 238),
    STATUE_OVERHANG("environment/caves/statue_overhang.png", 240),
    ALCHEMY_POT_OVERHANG("environment/caves/alchemy_pot_overhang.png", 241),
    BARRICADE_OVERHANG("environment/caves/barricade_overhang.png", 242),
    HIGH_GRASS_OVERHANG("environment/caves/high_grass_overhang.png", 243),
    FURROWED_OVERHANG("environment/caves/furrowed_overhang.png", 244),
    HIGH_GRASS_OVERHANG_ALT("environment/caves/high_grass_overhang_alt.png", 246),
    FURROWED_OVERHANG_ALT("environment/caves/furrowed_overhang_alt.png", 247),
    EXIT_UNDERHANG("environment/caves/exit_underhang.png", 249),
}
