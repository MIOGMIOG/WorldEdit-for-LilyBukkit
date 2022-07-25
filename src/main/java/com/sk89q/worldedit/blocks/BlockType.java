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

import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;
import java.util.Map.Entry;
import com.sk89q.util.StringUtil;

/**
 * Block types.
 *
 * @author sk89q
 */
public enum BlockType {
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
    BLUE_FLOWER(BlockID.BLUE_FLOWER, "Blue flower", "blueflower", "flower"),
    SILVER_ROSE(BlockID.SILVER_ROSE, "Silver rose", "silverflower", "silverrose", "rose"),
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
    GREENSTONE_WIRE(BlockID.GREENSTONE_WIRE, "Greenstone wire", "greenstone", "greenstoneblock"),
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
    SAFE_BLOCK(BlockID.SAFE_BLOCK, "Safe block", "safe_block", "safeblock", "codeblock", "code_block");

    /**
     * Stores a list of dropped blocks for blocks.
     */
    private static final Map<Integer,Integer> blockDrops = new HashMap<Integer,Integer>();

    /**
     * Static constructor.
     */
    static {
        blockDrops.put(1, 4);
        blockDrops.put(2, 3);
        blockDrops.put(3, 3);
        blockDrops.put(4, 4);
        blockDrops.put(5, 5);
        blockDrops.put(6, 6);
        blockDrops.put(7, -1);
        blockDrops.put(12, 12);
        blockDrops.put(13, 13);
        blockDrops.put(14, 14);
        blockDrops.put(15, 15);
        blockDrops.put(16, 16);
        blockDrops.put(17, 17);
        blockDrops.put(18, 18);
        blockDrops.put(19, 19);
        blockDrops.put(20, 20); // Have to drop glass for //undo
        blockDrops.put(21, 21); // Block damage drops not implemented
        blockDrops.put(22, 22);
        blockDrops.put(23, 23);
        blockDrops.put(24, 24);
        blockDrops.put(25, 25);
        blockDrops.put(26, 355);
        blockDrops.put(27, 27);
        blockDrops.put(28, 28);
        blockDrops.put(30, 30);
        blockDrops.put(34, -1);
        blockDrops.put(35, 35);
        blockDrops.put(36, -1);
        blockDrops.put(37, 37);
        blockDrops.put(38, 38);
        blockDrops.put(39, 39);
        blockDrops.put(40, 40);
        blockDrops.put(41, 41);
        blockDrops.put(42, 42);
        blockDrops.put(43, 43);
        blockDrops.put(44, 44);
        blockDrops.put(45, 45);
        blockDrops.put(47, 47);
        blockDrops.put(48, 48);
        blockDrops.put(49, 49);
        blockDrops.put(50, 50);
        blockDrops.put(53, 53);
        blockDrops.put(54, 54);
        blockDrops.put(55, 331);
        blockDrops.put(56, 264);
        blockDrops.put(57, 57);
        blockDrops.put(58, 58);
        blockDrops.put(59, 295);
        blockDrops.put(60, 60);
        blockDrops.put(61, 61);
        blockDrops.put(62, 61);
        blockDrops.put(63, 323);
        blockDrops.put(64, 324);
        blockDrops.put(65, 65);
        blockDrops.put(66, 66);
        blockDrops.put(67, 67);
        blockDrops.put(68, 323);
        blockDrops.put(69, 69);
        blockDrops.put(70, 70);
        blockDrops.put(71, 330);
        blockDrops.put(72, 72);
        blockDrops.put(73, 331);
        blockDrops.put(74, 331);
        blockDrops.put(75, 76);
        blockDrops.put(76, 76);
        blockDrops.put(77, 77);
        blockDrops.put(78, 332);
        blockDrops.put(80, 80);
        blockDrops.put(81, 81);
        blockDrops.put(82, 82);
        blockDrops.put(83, 338);
        blockDrops.put(84, 84);
        blockDrops.put(85, 85);
        blockDrops.put(86, 86);
        blockDrops.put(87, 87);
        blockDrops.put(88, 88);
        blockDrops.put(89, 348);
        blockDrops.put(91, 91);
        blockDrops.put(92, 354);
        blockDrops.put(93, 356);
        blockDrops.put(94, 356);
        blockDrops.put(95, 95);
        blockDrops.put(96, 96);
    }

    /**
     * Stores a map of the IDs for fast access.
     */
    private static final Map<Integer,BlockType> ids = new HashMap<Integer,BlockType>();
    /**
     * Stores a map of the names for fast access.
     */
    private static final Map<String,BlockType> lookup = new HashMap<String,BlockType>();

    private final int id;
    private final String name;
    private final String[] lookupKeys;

    static {
        for(BlockType type : EnumSet.allOf(BlockType.class)) {
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
    BlockType(int id, String name, String lookupKey) {
        this.id = id;
        this.name = name;
        this.lookupKeys = new String[]{lookupKey};
    }

    /**
     * Construct the type.
     *
     * @param id
     * @param name
     */
    BlockType(int id, String name, String ... lookupKeys) {
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
    public static BlockType fromID(int id) {
        return ids.get(id);
    }

    /**
     * Return type from name. May return null.
     *
     * @param name
     * @return
     */
    public static BlockType lookup(String name) {
        return lookup(name, true);
    }

    /**
     * Return type from name. May return null.
     *
     * @param name
     * @param fuzzy
     * @return
     */
    public static BlockType lookup(String name, boolean fuzzy) {
        String testName = name.replace(" ", "").toLowerCase();
        
        BlockType type = lookup.get(testName);
        
        if (type != null) {
            return type;
        }
        
        if (!fuzzy) {
            return null;
        }
        
        int minDist = -1;
        
        for (Entry<String, BlockType> entry : lookup.entrySet()) {
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
     * Get block numeric ID.
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     * Get user-friendly block name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Checks to see whether a block should be placed last.
     *
     * @return
     */
    public boolean shouldPlaceLast() {
        return shouldPlaceLast(id);
    }

    /**
     * Checks to see whether a block should be placed last.
     * 
     * @param id
     * @return
     */
    public static boolean shouldPlaceLast(int id) {
        return id == BlockID.SAPLING
                || id == BlockID.BLUE_FLOWER
                || id == BlockID.SILVER_ROSE
                || id == BlockID.BROWN_MUSHROOM
                || id == BlockID.RED_MUSHROOM
                || id == BlockID.TORCH
                || id == BlockID.FIRE
                || id == BlockID.GREENSTONE_WIRE
                || id == BlockID.CROPS
                || id == BlockID.SIGN_POST
                || id == BlockID.WOODEN_DOOR
                || id == BlockID.LADDER
                || id == BlockID.MINECART_TRACKS
                || id == BlockID.WALL_SIGN
                || id == BlockID.LEVER
                || id == BlockID.STONE_PRESSURE_PLATE
                || id == BlockID.IRON_DOOR
                || id == BlockID.WOODEN_PRESSURE_PLATE
                || id == BlockID.GREENSTONE_TORCH_OFF
                || id == BlockID.GREENSTONE_TORCH_ON
                || id == BlockID.STONE_BUTTON
                || id == BlockID.SNOW
                || id == BlockID.CACTUS
                || id == BlockID.REED;
    }

    /**
     * Checks whether a block can be passed through.
     *
     * @param id
     * @return
     */
    public static boolean canPassThrough(int id) {
        return id == BlockID.AIR
                || id == BlockID.WATER
                || id == BlockID.STATIONARY_WATER
                || id == BlockID.SAPLING
                || id == BlockID.BLUE_FLOWER
                || id == BlockID.SILVER_ROSE
                || id == BlockID.BROWN_MUSHROOM
                || id == BlockID.RED_MUSHROOM
                || id == BlockID.TORCH
                || id == BlockID.FIRE
                || id == BlockID.GREENSTONE_WIRE
                || id == BlockID.CROPS
                || id == BlockID.SIGN_POST
                || id == BlockID.LADDER
                || id == BlockID.MINECART_TRACKS
                || id == BlockID.WALL_SIGN
                || id == BlockID.LEVER
                || id == BlockID.STONE_PRESSURE_PLATE
                || id == BlockID.WOODEN_PRESSURE_PLATE
                || id == BlockID.GREENSTONE_TORCH_OFF
                || id == BlockID.GREENSTONE_TORCH_ON
                || id == BlockID.STONE_BUTTON
                || id == BlockID.SNOW
                || id == BlockID.REED;
    }

    /**
     * Returns true if the block uses its data value.
     * 
     * @param id
     * @return
     */
    public static boolean usesData(int id) {
        return id == BlockID.SAPLING
                || id == BlockID.WATER
                || id == BlockID.STATIONARY_WATER
                || id == BlockID.LAVA
                || id == BlockID.STATIONARY_LAVA
                || id == BlockID.LOG
                || id == BlockID.LEAVES
                || id == BlockID.CLOTH
                || id == BlockID.DOUBLE_STEP
                || id == BlockID.STEP
                || id == BlockID.TORCH
                || id == BlockID.WOODEN_STAIRS
                || id == BlockID.GREENSTONE_WIRE
                || id == BlockID.CROPS
                || id == BlockID.SOIL
                || id == BlockID.FURNACE
                || id == BlockID.BURNING_FURNACE
                || id == BlockID.SIGN_POST
                || id == BlockID.WOODEN_DOOR
                || id == BlockID.LADDER
                || id == BlockID.MINECART_TRACKS
                || id == BlockID.COBBLESTONE_STAIRS
                || id == BlockID.WALL_SIGN
                || id == BlockID.LEVER
                || id == BlockID.STONE_PRESSURE_PLATE
                || id == BlockID.IRON_DOOR
                || id == BlockID.WOODEN_PRESSURE_PLATE
                || id == BlockID.GREENSTONE_TORCH_OFF
                || id == BlockID.GREENSTONE_TORCH_ON
                || id == BlockID.STONE_BUTTON
                || id == BlockID.SNOW
                || id == BlockID.CACTUS;
    }
    
    /**
     * Returns true if the block is a container block.
     * 
     * @param id
     * @return
     */
    public static boolean isContainerBlock(int id) {
        return id == BlockID.FURNACE
                || id == BlockID.BURNING_FURNACE
                || id == BlockID.CHEST;
    }

    /**
     * Returns true if a block uses redstone in some way.
     *
     * @param id
     * @return
     */
    public static boolean isRedstoneBlock(int id) {
        return id == BlockID.LEVER
                || id == BlockID.STONE_PRESSURE_PLATE
                || id == BlockID.WOODEN_PRESSURE_PLATE
                || id == BlockID.GREENSTONE_TORCH_OFF
                || id == BlockID.GREENSTONE_TORCH_ON
                || id == BlockID.STONE_BUTTON
                || id == BlockID.GREENSTONE_WIRE
                || id == BlockID.WOODEN_DOOR
                || id == BlockID.IRON_DOOR
                || id == BlockID.TNT;
    }

   /**
     * Returns true if a block can transfer redstone.
     * Made this since isRedstoneBlock was getting big.
     *
     * @param id
     * @return
     */
    public static boolean canTransferRedstone(int id) {
        return id == BlockID.GREENSTONE_TORCH_OFF
                || id == BlockID.GREENSTONE_TORCH_ON
                || id == BlockID.GREENSTONE_WIRE;
    }

    /**
     * Yay for convenience methods.
     *
     * @param id
     * @return
     */
    public static boolean isRedstoneSource(int id) {
        return id == BlockID.GREENSTONE_TORCH_OFF
                || id == BlockID.GREENSTONE_TORCH_ON
                || id == BlockID.LEVER
                || id == BlockID.STONE_PRESSURE_PLATE
                || id == BlockID.WOODEN_PRESSURE_PLATE
                || id == BlockID.STONE_BUTTON;
    }

    /**
     * Checks if the id is that of one of the rail types
     *
     * @param id
     * @return
     */
    public static boolean isRailBlock(int id) {
       return id == BlockID.MINECART_TRACKS;
    }

    /**
     * Checks if the block type is naturally occuring
     *
     * @param id
     * @return
     */
    public static boolean isNaturalBlock(int id) {
        return id == BlockID.STONE
                || id == BlockID.GRASS
                || id == BlockID.DIRT
                // || id == BlockID.COBBLESTONE // technically can occur next to water and lava
                || id == BlockID.BEDROCK
                || id == BlockID.SAND
                || id == BlockID.GRAVEL
                || id == BlockID.CLAY
                // ores
                || id == BlockID.COAL_ORE
                || id == BlockID.IRON_ORE
                || id == BlockID.GOLD_ORE
                || id == BlockID.DIAMOND_ORE
                || id == BlockID.GREENSTONE_ORE
                || id == BlockID.GLOWING_GREENSTONE_ORE;
    }

    /**
     * Get the block or item that would have been dropped. If nothing is
     * dropped, 0 will be returned. If the block should not be destroyed
     * (i.e. bedrock), -1 will be returned.
     * 
     * @param id
     * @return
     */
    public static int getDroppedBlock(int id) {
        Integer dropped = blockDrops.get(id);
        if (dropped == null) {
            return BlockID.AIR;
        }
        return dropped;
    }

}
