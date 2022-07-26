// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.blocks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;
import java.util.Map.Entry;
import com.sk89q.util.StringUtil;
import com.sk89q.worldedit.data.BlockData;
import jdk.nashorn.internal.ir.Block;

/**
 * ItemType types.
 *
 * @author sk89q
 */
public enum ItemType {
    // Blocks
    AIR(BlockID.AIR, "Air", "air"),
    STONE(BlockID.STONE, "Stone", "stone", "rock"),
    GRASS(BlockID.GRASS, "Grass", "grass"),
    DIRT(BlockID.DIRT, "Dirt", "dirt"),
    COBBLESTONE(BlockID.COBBLESTONE, "Cobblestone", "cobblestone", "cobble"),
    WOOD(BlockID.WOOD, "Wood", "wood", "woodplank", "plank", "woodplanks", "planks"),
    SAPLING(BlockID.SAPLING, "Sapling", "sapling", "seedling"),
    BEDROCK(BlockID.BEDROCK, "Bedrock", "adminium", "bedrock"),
    WATER(BlockID.WATER, "Water", "watermoving", "movingwater", "flowingwater", "waterflowing"),
    STATIONARY_WATER(BlockID.STATIONARY_WATER, "Water (stationary)", "water", "waterstationary", "stationarywater", "stillwater"),
    LAVA(BlockID.LAVA, "Lava", "lavamoving", "movinglava", "flowinglava", "lavaflowing"),
    STATIONARY_LAVA(BlockID.STATIONARY_LAVA, "Lava (stationary)", "lava", "lavastationary", "stationarylava", "stilllava"),
    SAND(BlockID.SAND, "Sand", "sand"),
    GRAVEL(BlockID.GRAVEL, "Gravel", "gravel"),
    GOLD_ORE(BlockID.GOLD_ORE, "Gold ore", "goldore"),
    IRON_ORE(BlockID.IRON_ORE, "Iron ore", "ironore"),
    COAL_ORE(BlockID.COAL_ORE, "Coal ore", "coalore"),
    LOG(BlockID.LOG, "Log", "log", "tree", "pine", "oak", "birch", "redwood"),
    LEAVES(BlockID.LEAVES, "Leaves", "leaves", "leaf"),
    SPONGE(BlockID.SPONGE, "Sponge", "sponge"),
    GLASS(BlockID.GLASS, "Glass", "glass"),
    CLOTH(BlockID.CLOTH, "Wool", "cloth", "wool"),
    YELLOW_FLOWER(BlockID.BLUE_FLOWER, "Yellow flower", "yellowflower", "flower"),
    RED_FLOWER(BlockID.SILVER_ROSE, "Red rose", "redflower", "redrose", "rose"),
    BROWN_MUSHROOM(BlockID.BROWN_MUSHROOM, "Brown mushroom", "brownmushroom", "mushroom"),
    RED_MUSHROOM(BlockID.RED_MUSHROOM, "Red mushroom", "redmushroom"),
    GOLD_BLOCK(BlockID.GOLD_BLOCK, "Gold block", "gold", "goldblock"),
    IRON_BLOCK(BlockID.IRON_BLOCK, "Iron block", "iron", "ironblock"),
    DOUBLE_STEP(BlockID.DOUBLE_STEP, "Double step", "doubleslab", "doublestoneslab", "doublestep"),
    STEP(BlockID.STEP, "Step", "slab", "stoneslab", "step", "halfstep"),
    BRICK(BlockID.BRICK, "Brick", "brick", "brickblock"),
    TNT(BlockID.TNT, "TNT", "tnt", "c4", "explosive"),
    BOOKCASE(BlockID.BOOKCASE, "Bookcase", "bookshelf", "bookshelves", "bookcase", "bookcases"),
    MOSSY_COBBLESTONE(BlockID.MOSSY_COBBLESTONE, "Cobblestone (mossy)", "mossycobblestone", "mossstone", "mossystone", "mosscobble", "mossycobble", "moss", "mossy", "sossymobblecone"),
    OBSIDIAN(BlockID.OBSIDIAN, "Obsidian", "obsidian"),
    TORCH(BlockID.TORCH, "Torch", "torch", "light", "candle"),
    FIRE(BlockID.FIRE, "Fire", "fire", "flame", "flames"),
    MOB_SPAWNER(BlockID.MOB_SPAWNER, "Mob spawner", "mobspawner", "spawner"),
    WOODEN_STAIRS(BlockID.WOODEN_STAIRS, "Wooden stairs", "woodstair", "woodstairs", "woodenstair", "woodenstairs"),
    CHEST(BlockID.CHEST, "Chest", "chest", "storage", "storagechest"),
    GREENSTONE_WIRE(BlockID.GREENSTONE_WIRE, "Greenstone wire", "greenstone", "greestoneblock"),
    DIAMOND_ORE(BlockID.DIAMOND_ORE, "Diamond ore", "diamondore"),
    DIAMOND_BLOCK(BlockID.DIAMOND_BLOCK, "Diamond block", "diamond", "diamondblock"),
    WORKBENCH(BlockID.WORKBENCH, "Workbench", "workbench", "table", "craftingtable", "crafting"),
    CROPS(BlockID.CROPS, "Crops", "crops", "crop", "plant", "plants"),
    SOIL(BlockID.SOIL, "Soil", "soil", "farmland"),
    FURNACE(BlockID.FURNACE, "Furnace", "furnace"),
    BURNING_FURNACE(BlockID.BURNING_FURNACE, "Furnace (burning)", "burningfurnace", "litfurnace"),
    SIGN_POST(BlockID.SIGN_POST, "Sign post", "sign", "signpost"),
    WOODEN_DOOR(BlockID.WOODEN_DOOR, "Wooden door", "wooddoor", "woodendoor", "door"),
    LADDER(BlockID.LADDER, "Ladder", "ladder"),
    MINECART_TRACKS(BlockID.MINECART_TRACKS, "Minecart tracks", "track", "tracks", "minecrattrack", "minecarttracks", "rails", "rail"),
    COBBLESTONE_STAIRS(BlockID.COBBLESTONE_STAIRS, "Cobblestone stairs", "cobblestonestair", "cobblestonestairs", "cobblestair", "cobblestairs"),
    WALL_SIGN(BlockID.WALL_SIGN, "Wall sign", "wallsign"),
    LEVER(BlockID.LEVER, "Lever", "lever", "switch", "stonelever", "stoneswitch"),
    STONE_PRESSURE_PLATE(BlockID.STONE_PRESSURE_PLATE, "Stone pressure plate", "stonepressureplate", "stoneplate"),
    IRON_DOOR(BlockID.IRON_DOOR, "Iron Door", "irondoor"),
    WOODEN_PRESSURE_PLATE(BlockID.WOODEN_PRESSURE_PLATE, "Wooden pressure plate", "woodpressureplate", "woodplate", "woodenpressureplate", "woodenplate", "plate", "pressureplate"),
    GREENSTONE_ORE(BlockID.GREENSTONE_ORE, "Greenstone ore", "greenstoneore"),
    GLOWING_GREENSTONE_ORE(BlockID.GLOWING_GREENSTONE_ORE, "Glowing greenstone ore", "glowinggreenstoneore"),
    GREENSTONE_TORCH_OFF(BlockID.GREENSTONE_TORCH_OFF, "Greenstone torch (off)", "greenstonetorchoff", "gstorchoff"),
    GREENSTONE_TORCH_ON(BlockID.GREENSTONE_TORCH_ON, "Greenstone torch (on)", "greenstonetorch", "greenstonetorchon", "gstorchon", "greentorch"),
    STONE_BUTTON(BlockID.STONE_BUTTON, "Stone Button", "stonebutton", "button"),
    SNOW(BlockID.SNOW, "Snow", "snow"),
    ICE(BlockID.ICE, "Ice", "ice"),
    SNOW_BLOCK(BlockID.SNOW_BLOCK, "Snow block", "snowblock"),
    CACTUS(BlockID.CACTUS, "Cactus", "cactus", "cacti"),
    CLAY(BlockID.CLAY, "Clay", "clay"),
    SUGAR_CANE(BlockID.REED, "Reed", "reed", "cane", "sugarcane", "sugarcanes", "vine", "vines"),
    JUKEBOX(BlockID.JUKEBOX, "Jukebox", "jukebox", "stereo", "recordplayer"),
    FENCE(BlockID.FENCE, "Fence", "fence"),
    QUAD_WINDOW_GLASS(BlockID.QUAD_WINDOW_GLASS, "Quad Window Glass", "windowblock", "windows", "window", "quad_window_glass", "quadwindowglass"),
    PILLAR(BlockID.PILLAR, "Pillar Block", "pillar", "pillar_block", "woodpillar", "wood_pillar", "woodpillarblock"),
    SCAFFOLD(BlockID.SCAFFOLD, "Scaffold", "scaffold", "stonescaffold", "tile"),
    X_RAY_SCAFFOLD(BlockID.X_RAY_SCAFFOLD, "X-Ray Scaffold", "xrayscaffold", "x_ray_scaffold", "xray_scaffold", "xray_tile", "xraytile"),
    TRANSPARENT_SCAFFOLD(BlockID.TRANSPARENT_SCAFFOLD, "Transparent Scaffold", "transparentscaffold", "transparent_scaffold", "transparent_tile", "transparenttile"),
    DIMENSION_FLOOR(BlockID.DIMENSION_FLOOR, "Dimension Floor block", "dimension_floor", "dimensionfloor", "dimension_floor_block", "dimensionfloorblock"),
    DIMENSION_WALL(BlockID.DIMENSION_WALL, "Dimension Wall block", "dimension_wall", "dimension_wall_block", "dimensionwall", "dimensionwallblock"),
    DBG_BLOCK(BlockID.DBG_BLOCK, "Debug block", "debug_block", "dbg_block", "debugblock", "dbgblock"),
    BLUE_TILE(BlockID.BLUE_TILE, "Blue tile", "blue_tile", "bluetile"),
    YELLOW_TILE(BlockID.YELLOW_TILE, "Yellow tile", "yellow_tile", "yellowtile"),
    FAKE_GRASS(BlockID.FAKE_GRASS, "Fake Grass", "fake_grass", "fakegrass", "fake_grass_block", "fakegrassblock"),
    CYAN_MOJANG_BLOCK(BlockID.CYAN_MOJANG_BLOCK, "Cyan Mojang block", "cyan_mojang_block", "cyanmojangblock"),
    WHITE_MOJANG_BLOCK(BlockID.WHITE_MOJANG_BLOCK, "White Mojang block", "white_mojang_block", "whitemojangblock"),
    GREEN_MOJANG_BLOCK(BlockID.GREEN_MOJANG_BLOCK, "Green Mojang block", "green_mojang_block", "greenmojangblock"),
    BARRIER(BlockID.BARRIER, "Barrier block", "barrier", "barrier_block", "barrierblock"),
    STAIR_LADDER(BlockID.STAIR_LADDER, "Stair ladder", "fake_ladder", "fakeladder", "stair_ladder", "stairladder"),
    FAKE_DIRT(BlockID.FAKE_DIRT, "Fake dirt", "fake_dirt", "fakedirt", "fake_dirt_block", "fakedirtblock"),
    FAKE_STONE(BlockID.FAKE_STONE, "Fake stone", "fake_stone", "fakestone", "fake_stone_block", "fakestoneblock"),
    FAKE_SAND(BlockID.FAKE_SAND, "Fake sand", "fake_sand", "fakesand", "fake_sand_block", "fakesandblock"),
    PINK_WOOL(BlockID.PINK_WOOL, "Pink wool", "pink_wool", "pinkwool", "pinkwoolblock", "pink_wool_block", "woolpink"),
    BLUE_WOOL(BlockID.BLUE_WOOL, "Blue wool", "blue_wool", "bluewool", "bluewoolblock", "blue_wool_block", "woolblue"),
    GREEN_WOOL(BlockID.GREEN_WOOL, "Green wool", "green_wool", "greenwool", "greenwoolblock", "green_wool_block", "woolgreen"),
    BLACK_WOOL(BlockID.BLACK_WOOL, "Black wool", "black_wool", "blackwool", "blackwoolblock", "black_wool_block", "woolblack"),
    DBG(BlockID.DBG, "Debug", "dbg", "debug"),
    SALT(BlockID.SALT, "Salt block", "salt", "salt_block", "saltblock"),
    GLOWING_FLOWER(BlockID.GLOWING_FLOWER, "Glowing flower", "glowing_flower", "glowingflower"),
    BLUE_FLAME(BlockID.BLUE_FLAME, "Blue flame", "flame", "blue_flame", "blueflame"),
    INFUSED_GLOWING_FLOWER(BlockID.INFUSED_GLOWING_FLOWER, "Infused glowing flower", "infused_glowing_flower", "infusedglowingflower"),
    GOLD_INFUSED_GLOWING_FLOWER(BlockID.GOLD_INFUSED_GLOWING_FLOWER, "Gold infused glowing flower", "gold_infused_glowing_flower", "goldinfusedglowingflower"),
    OBSIDIAN_INFUSED_GLOWING_FLOWER(BlockID.OBSIDIAN_INFUSED_GLOWING_FLOWER, "Obsidian infused glowing flower", "obsidian_infused_glowing_flower", "obsidianinfusedglowingflower"),
    SAFE_BLOCK(BlockID.SAFE_BLOCK, "Safe block", "safe_block", "safeblock", "codeblock", "code_block"),

    // Items
    IRON_SHOVEL(256, "Iron shovel", "ironshovel"),
    IRON_PICK(257, "Iron pick", "ironpick", "ironpickaxe"),
    IRON_AXE(258, "Iron axe", "ironaxe"),
    FLINT_AND_TINDER(259, "Flint and tinder", "flintandtinder", "lighter", "flintandsteel", "flintsteel", "flintandiron", "flintnsteel", "flintniron", "flintntinder"),
    RED_APPLE(260, "Red apple", "redapple", "apple"),
    BOW(261, "Bow", "bow"),
    ARROW(262, "Arrow", "arrow"),
    COAL(263, "Coal", "coal"),
    DIAMOND(264, "Diamond", "diamond"),
    IRON_BAR(265, "Iron bar", "ironbar", "iron"),
    GOLD_BAR(266, "Gold bar", "goldbar", "gold"),
    IRON_SWORD(267, "Iron sword", "ironsword"),
    WOOD_SWORD(268, "Wooden sword", "woodsword"),
    WOOD_SHOVEL(269, "Wooden shovel", "woodshovel"),
    WOOD_PICKAXE(270, "Wooden pickaxe", "woodpick", "woodpickaxe"),
    WOOD_AXE(271, "Wooden axe", "woodaxe"),
    STONE_SWORD(272, "Stone sword", "stonesword"),
    STONE_SHOVEL(273, "Stone shovel", "stoneshovel"),
    STONE_PICKAXE(274, "Stone pickaxe", "stonepick", "stonepickaxe"),
    STONE_AXE(275, "Stone pickaxe", "stoneaxe"),
    DIAMOND_SWORD(276, "Diamond sword", "diamondsword"),
    DIAMOND_SHOVEL(277, "Diamond shovel", "diamondshovel"),
    DIAMOND_PICKAXE(278, "Diamond pickaxe", "diamondpick", "diamondpickaxe"),
    DIAMOND_AXE(279, "Diamond axe", "diamondaxe"),
    STICK(280, "Stick", "stick"),
    BOWL(281, "Bowl", "bowl"),
    MUSHROOM_SOUP(282, "Mushroom soup", "mushroomsoup", "soup", "brbsoup"),
    GOLD_SWORD(283, "Golden sword", "goldsword"),
    GOLD_SHOVEL(284, "Golden shovel", "goldshovel"),
    GOLD_PICKAXE(285, "Golden pickaxe", "goldpick", "goldpickaxe"),
    GOLD_AXE(286, "Golden axe", "goldaxe"),
    STRING(287, "String", "string"),
    FEATHER(288, "Feather", "feather"),
    SULPHUR(289, "Sulphur", "sulphur", "sulfur", "gunpowder"),
    WOOD_HOE(290, "Wooden hoe", "woodhoe"),
    STONE_HOE(291, "Stone hoe", "stonehoe"),
    IRON_HOE(292, "Iron hoe", "ironhoe"),
    DIAMOND_HOE(293, "Diamond hoe", "diamondhoe"),
    GOLD_HOE(294, "Golden hoe", "goldhoe"),
    SEEDS(295, "Seeds", "seeds", "seed"),
    WHEAT(296, "Wheat", "wheat"),
    BREAD(297, "Bread", "bread"),
    LEATHER_HELMET(298, "Leather helmet", "leatherhelmet", "leatherhat"),
    LEATHER_CHEST(299, "Leather chestplate", "leatherchest", "leatherchestplate", "leathervest", "leatherbreastplate", "leatherplate", "leathercplate", "leatherbody"),
    LEATHER_PANTS(300, "Leather pants", "leatherpants", "leathergreaves", "leatherlegs", "leatherleggings", "leatherstockings", "leatherbreeches"),
    LEATHER_BOOTS(301, "Leather boots", "leatherboots", "leathershoes", "leatherfoot", "leatherfeet"),
    CHAINMAIL_HELMET(302, "Chainmail helmet", "chainmailhelmet", "chainmailhat"),
    CHAINMAIL_CHEST(303, "Chainmail chestplate", "chainmailchest", "chainmailchestplate", "chainmailvest", "chainmailbreastplate", "chainmailplate", "chainmailcplate", "chainmailbody"),
    CHAINMAIL_PANTS(304, "Chainmail pants", "chainmailpants", "chainmailgreaves", "chainmaillegs", "chainmailleggings", "chainmailstockings", "chainmailbreeches"),
    CHAINMAIL_BOOTS(305, "Chainmail boots", "chainmailboots", "chainmailshoes", "chainmailfoot", "chainmailfeet"),
    IRON_HELMET(306, "Iron helmet", "ironhelmet", "ironhat"),
    IRON_CHEST(307, "Iron chestplate", "ironchest", "ironchestplate", "ironvest", "ironbreastplate", "ironplate", "ironcplate", "ironbody"),
    IRON_PANTS(308, "Iron pants", "ironpants", "irongreaves", "ironlegs", "ironleggings", "ironstockings", "ironbreeches"),
    IRON_BOOTS(309, "Iron boots", "ironboots", "ironshoes", "ironfoot", "ironfeet"),
    DIAMOND_HELMET(310, "Diamond helmet", "diamondhelmet", "diamondhat"),
    DIAMOND_CHEST(311, "Diamond chestplate", "diamondchest", "diamondchestplate", "diamondvest", "diamondbreastplate", "diamondplate", "diamondcplate", "diamondbody"),
    DIAMOND_PANTS(312, "Diamond pants", "diamondpants", "diamondgreaves", "diamondlegs", "diamondleggings", "diamondstockings", "diamondbreeches"),
    DIAMOND_BOOTS(313, "Diamond boots", "diamondboots", "diamondshoes", "diamondfoot", "diamondfeet"),
    GOLD_HELMET(314, "Gold helmet", "goldhelmet", "goldhat"),
    GOLD_CHEST(315, "Gold chestplate", "goldchest", "goldchestplate", "goldvest", "goldbreastplate", "goldplate", "goldcplate", "goldbody"),
    GOLD_PANTS(316, "Gold pants", "goldpants", "goldgreaves", "goldlegs", "goldleggings", "goldstockings", "goldbreeches"),
    GOLD_BOOTS(317, "Gold boots", "goldboots", "goldshoes", "goldfoot", "goldfeet"),
    FLINT(318, "Flint", "flint"),
    RAW_PORKCHOP(319, "Raw porkchop", "rawpork", "rawporkchop", "rawbacon", "baconstrips", "rawmeat"),
    COOKED_PORKCHOP(320, "Cooked porkchop", "pork", "cookedpork", "cookedporkchop", "cookedbacon", "bacon", "meat"),
    PAINTING(321, "Painting", "painting"),
    GOLD_APPLE(322, "Golden apple", "goldapple", "goldenapple"),
    SIGN(323, "Wooden sign", "sign"),
    WOODEN_DOOR_ITEM(324, "Wooden door", "wooddoor", "door"),
    BUCKET(325, "Bucket", "bucket", "bukkit"),
    WATER_BUCKET(326, "Water bucket", "waterbucket", "waterbukkit"),
    LAVA_BUCKET(327, "Lava bucket", "lavabucket", "lavabukkit"),
    MINECART(328, "Minecart", "minecart", "cart"),
    SADDLE(329, "Saddle", "saddle"),
    IRON_DOOR_ITEM(330, "Iron door", "irondoor"),
    GREENSTONE_DUST(331, "Greenstone dust", "greenstonedust", "greendust", "greenstone", "dust", "wire"),
    SNOWBALL(332, "Snowball", "snowball"),
    WOOD_BOAT(333, "Wooden boat", "woodboat", "woodenboat", "boat"),
    LEATHER(334, "Leather", "leather", "cowhide"),
    MILK_BUCKET(335, "Milk bucket", "milkbucket", "milk", "milkbukkit"),
    BRICK_BAR(336, "Brick", "brickbar"),
    CLAY_BALL(337, "Clay", "clay"),
    SUGAR_CANE_ITEM(338, "Sugar cane", "sugarcane", "reed", "reeds"),
    PAPER(339, "Paper", "paper"),
    BOOK(340, "Book", "book"),
    SLIME_BALL(341, "Slime ball", "slimeball", "slime"),
    STORAGE_MINECART(342, "Storage minecart", "storageminecart", "storagecart"),
    POWERED_MINECART(343, "Powered minecart", "poweredminecart", "poweredcart"),
    EGG(344, "Egg", "egg"),
    COMPASS(345, "Compass", "compass"),
    OBSIDIAN_HELMET(346, "Obsidian helmet", "obsidianhelmet", "obsidianhat"),
    OBSIDIAN_CHEST(347, "Obsidian chestplate", "obsidianchest", "obsidianchestplate", "obsidianvest", "obsidianbreastplate", "obsidianplate", "obsidiancplate", "obsidianbody"),
    OBSIDIAN_PANTS(348, "Obsidian pants", "obsidianpants", "obsidiangreaves", "obsidianlegs", "obsidianleggings", "obsidianstockings", "obsidianbreeches"),
    OBSIDIAN_BOOTS(349, "Obsidian boots", "obsidianboots", "obsidianshoes", "obsidianfoot", "obsidianfeet"),
    OBSIDIAN_SWORD(350, "Obsidian sword", "obsidiansword"),
    OBSIDIAN_SHOVEL(351, "Obsidian shovel", "obsidianshovel"),
    OBSIDIAN_PICKAXE(352, "Obsidian pickaxe", "obsidianpick", "obsidianpickaxe"),
    OBSIDIAN_AXE(353, "Obsidian axe", "obsidianaxe"),
    OBSIDIAN_HOE(354, "Obsidian hoe", "obsidianhoe"),
    OBSIDIAN_BAR(355, "Obsidian bar", "obsidianbar"),
    BLACK_DYE(356, "Black dye", "blackdye"),
    GREEN_DYE(357, "Green dye", "greendye"),
    BLUE_DYE(358, "Blue dye", "bluedye"),
    PINK_DYE(359, "Pink dye", "pinkdye"),
    FRYSHROOM(360, "Fryshroom", "fryshroom"),
    EDIBLE_FLAME(361, "Edible flame", "edibleflame"),
    FLAMEBERGE(362, "Flameberge", "flameberge"),
    HIDDEN_DEN_RECORD(2256, "Hidden Den Record", "hiddendenrecord", "hiddendendisc", "hiddenden"),
    LEMURIA_RECORD(2257, "Lemuria Record", "lemuriarecord", "lemuriadisc", "lemuria");

    /**
     * Stores a map of the IDs for fast access.
     */
    private static final Map<Integer,ItemType> ids = new HashMap<Integer,ItemType>();
    /**
     * Stores a map of the names for fast access.
     */
    private static final Map<String,ItemType> lookup = new LinkedHashMap<String,ItemType>();

    private final int id;
    private final String name;
    private final String[] lookupKeys;

    static {
        for (ItemType type : EnumSet.allOf(ItemType.class)) {
            ids.put(type.id, type);
            for (String key : type.lookupKeys) {
                lookup.put(key, type);
            }
        }
    }


    /**
     * Construct the type.
     *
     * @param id
     * @param name
     */
    ItemType(int id, String name, String lookupKey) {
        this.id = id;
        this.name = name;
        this.lookupKeys = new String[] {lookupKey};
    }

    /**
     * Construct the type.
     *
     * @param id
     * @param name
     */
    ItemType(int id, String name, String ... lookupKeys) {
        this.id = id;
        this.name = name;
        this.lookupKeys = lookupKeys;
    }

    /**
     * Return type from ID. May return null.
     *
     * @param id
     * @return
     */
    public static ItemType fromID(int id) {
        return ids.get(id);
    }

    /**
     * Get a name for the item.
     *
     * @param id
     * @return
     */
    public static String toName(int id) {
        ItemType type = ids.get(id);
        if (type != null) {
            return type.getName();
        } else {
            return "#" + id;
        }
    }

    /**
     * Get a name for a held item.
     *
     * @param id
     * @return
     */
    public static String toHeldName(int id) {
        if (id == 0) {
            return "Hand";
        }
        ItemType type = ids.get(id);
        if (type != null) {
            return type.getName();
        } else {
            return "#" + id;
        }
    }

    /**
     * Return type from name. May return null.
     *
     * @param name
     * @return
     */
    public static ItemType lookup(String name) {
        return lookup(name, true);
    }

    /**
     * Return type from name. May return null.
     *
     * @param name
     * @param fuzzy
     * @return
     */
    public static ItemType lookup(String name, boolean fuzzy) {
        String testName = name.replace(" ", "").toLowerCase();

        ItemType type = lookup.get(testName);

        if (type != null) {
            return type;
        }

        if (!fuzzy) {
            return null;
        }

        int minDist = -1;

        for (Entry<String, ItemType> entry : lookup.entrySet()) {
            if (entry.getKey().charAt(0) != testName.charAt(0)) {
                continue;
            }

            int dist = StringUtil.getLevenshteinDistance(entry.getKey(), testName);

            if ((dist < minDist || minDist == -1) && dist < 2) {
                minDist = dist;
                type = entry.getValue();
            }
        }

        return type;
    }

    /**
     * Get item numeric ID.
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     * Get user-friendly item name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get a list of aliases.
     *
     * @return
     */
    public String[] getAliases() {
        return lookupKeys;
    }

    /**
     * Returns true if an item should not be stacked.
     *
     * @param id
     * @return
     */
    public static boolean shouldNotStack(int id) {
        ItemType t = ItemType.fromID(id);
        if (t == null) return false;
        return t == ItemType.IRON_SHOVEL
            || t == ItemType.IRON_PICK
            || t == ItemType.IRON_AXE
            || t == ItemType.FLINT_AND_TINDER
            || t == ItemType.BOW
            || t == ItemType.IRON_SWORD
            || t == ItemType.WOOD_SWORD
            || t == ItemType.WOOD_SHOVEL
            || t == ItemType.WOOD_PICKAXE
            || t == ItemType.WOOD_AXE
            || t == ItemType.STONE_SWORD
            || t == ItemType.STONE_SHOVEL
            || t == ItemType.STONE_PICKAXE
            || t == ItemType.STONE_AXE
            || t == ItemType.DIAMOND_SWORD
            || t == ItemType.DIAMOND_SHOVEL
            || t == ItemType.DIAMOND_PICKAXE
            || t == ItemType.DIAMOND_AXE
            || t == ItemType.BOWL
            || t == ItemType.GOLD_SWORD
            || t == ItemType.GOLD_SHOVEL
            || t == ItemType.GOLD_PICKAXE
            || t == ItemType.GOLD_AXE
            || t == ItemType.WOOD_HOE
            || t == ItemType.STONE_HOE
            || t == ItemType.IRON_HOE
            || t == ItemType.DIAMOND_HOE
            || t == ItemType.GOLD_HOE
            || t == ItemType.BREAD
            || t == ItemType.LEATHER_HELMET
            || t == ItemType.LEATHER_CHEST
            || t == ItemType.LEATHER_PANTS
            || t == ItemType.LEATHER_BOOTS
            || t == ItemType.CHAINMAIL_CHEST
            || t == ItemType.CHAINMAIL_HELMET
            || t == ItemType.CHAINMAIL_BOOTS
            || t == ItemType.CHAINMAIL_PANTS
            || t == ItemType.IRON_HELMET
            || t == ItemType.IRON_CHEST
            || t == ItemType.IRON_PANTS
            || t == ItemType.IRON_BOOTS
            || t == ItemType.DIAMOND_HELMET
            || t == ItemType.DIAMOND_PANTS
            || t == ItemType.DIAMOND_CHEST
            || t == ItemType.DIAMOND_BOOTS
            || t == ItemType.GOLD_HELMET
            || t == ItemType.GOLD_CHEST
            || t == ItemType.GOLD_PANTS
            || t == ItemType.GOLD_BOOTS
            || t == ItemType.RAW_PORKCHOP
            || t == ItemType.COOKED_PORKCHOP
            || t == ItemType.SIGN
            || t == ItemType.WOODEN_DOOR_ITEM
            || t == ItemType.BUCKET
            || t == ItemType.WATER_BUCKET
            || t == ItemType.LAVA_BUCKET
            || t == ItemType.MINECART
            || t == ItemType.SADDLE
            || t == ItemType.IRON_DOOR_ITEM
            || t == ItemType.WOOD_BOAT
            || t == ItemType.MILK_BUCKET
            || t == ItemType.STORAGE_MINECART
            || t == ItemType.POWERED_MINECART
            || t == ItemType.FRYSHROOM
            || t == ItemType.EDIBLE_FLAME
            || t == ItemType.OBSIDIAN_HELMET
            || t == ItemType.OBSIDIAN_CHEST
            || t == ItemType.OBSIDIAN_PANTS
            || t == ItemType.OBSIDIAN_BOOTS
            || t == ItemType.OBSIDIAN_SWORD
            || t == ItemType.OBSIDIAN_AXE
            || t == ItemType.OBSIDIAN_PICKAXE
            || t == ItemType.OBSIDIAN_SHOVEL
            || t == ItemType.OBSIDIAN_HOE
            || t == ItemType.HIDDEN_DEN_RECORD
            || t == ItemType.LEMURIA_RECORD;
    }

    /**
     * Returns true if an item uses its damage value for something
     * other than damage.
     *
     * @param id
     * @return
     */
    public static boolean usesDamageValue(int id) {
        return id == ItemType.CLOTH.getID();
    }
}
