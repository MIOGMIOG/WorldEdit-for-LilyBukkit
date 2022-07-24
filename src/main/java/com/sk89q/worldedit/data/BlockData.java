// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010, 2011 sk89q <http://www.sk89q.com>
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

package com.sk89q.worldedit.data;

import com.sk89q.worldedit.CuboidClipboard.FlipDirection;
import com.sk89q.worldedit.blocks.BlockID;

/**
 * Block data related classes.
 *
 * @author sk89q
 */
public final class BlockData {
    /**
     * Rotate a block's data value 90 degrees (north->east->south->west->north);
     * 
     * @param type
     * @param data
     * @return
     */
    public static int rotate90(int type, int data) {
        switch (type) {
        case BlockID.TORCH:
        case BlockID.GREENSTONE_TORCH_OFF:
        case BlockID.GREENSTONE_TORCH_ON:
            switch (data) {
            case 1: return 3;
            case 2: return 4;
            case 3: return 2;
            case 4: return 1;
            }
            break;

        case BlockID.MINECART_TRACKS:
            switch (data) {
            case 6: return 7;
            case 7: return 8;
            case 8: return 9;
            case 9: return 6;
            }
            /* FALL-THROUGH */

        case BlockID.WOODEN_STAIRS:
        case BlockID.COBBLESTONE_STAIRS:
            switch (data) {
            case 0: return 2;
            case 1: return 3;
            case 2: return 1;
            case 3: return 0;
            }
            break;

        case BlockID.LEVER:
        case BlockID.STONE_BUTTON:
            int thrown = data & 0x8;
            int withoutThrown = data & ~0x8;
            switch (withoutThrown) {
            case 1: return 3 | thrown;
            case 2: return 4 | thrown;
            case 3: return 2 | thrown;
            case 4: return 1 | thrown;
            }
            break;

        case BlockID.WOODEN_DOOR:
        case BlockID.IRON_DOOR:
            int topHalf = data & 0x8;
            int swung = data & 0x4;
            int withoutFlags = data & ~(0x8 | 0x4);
            switch (withoutFlags) {
            case 0: return 1 | topHalf | swung;
            case 1: return 2 | topHalf | swung;
            case 2: return 3 | topHalf | swung;
            case 3: return 0 | topHalf | swung;
            }
            break;

        case BlockID.SIGN_POST:
            return (data + 4) % 16;

        case BlockID.LADDER:
        case BlockID.WALL_SIGN:
        case BlockID.FURNACE:
        case BlockID.BURNING_FURNACE:
            switch (data) {
            case 2: return 5;
            case 3: return 4;
            case 4: return 2;
            case 5: return 3;
            }
            break;

        }

        return data;
    }

    /**
     * Rotate a block's data value -90 degrees (north<-east<-south<-west<-north);
     * 
     * @param type
     * @param data
     * @return
     */
    public static int rotate90Reverse(int type, int data) {
        // case ([0-9]+): return ([0-9]+) -> case \2: return \1

        switch (type) {
        case BlockID.TORCH:
        case BlockID.GREENSTONE_TORCH_OFF:
        case BlockID.GREENSTONE_TORCH_ON:
            switch (data) {
            case 3: return 1;
            case 4: return 2;
            case 2: return 3;
            case 1: return 4;
            }
            break;

        case BlockID.MINECART_TRACKS:
            switch (data) {
            case 7: return 6;
            case 8: return 7;
            case 9: return 8;
            case 6: return 9;
            }
            /* FALL-THROUGH */


        case BlockID.WOODEN_STAIRS:
        case BlockID.COBBLESTONE_STAIRS:
            switch (data) {
            case 2: return 0;
            case 3: return 1;
            case 1: return 2;
            case 0: return 3;
            }
            break;

        case BlockID.LEVER:
        case BlockID.STONE_BUTTON:
            int thrown = data & 0x8;
            int withoutThrown = data & ~0x8;
            switch (withoutThrown) {
            case 3: return 1 | thrown;
            case 4: return 2 | thrown;
            case 2: return 3 | thrown;
            case 1: return 4 | thrown;
            }
            break;

        case BlockID.WOODEN_DOOR:
        case BlockID.IRON_DOOR:
            int topHalf = data & 0x8;
            int swung = data & 0x4;
            int withoutFlags = data & ~(0x8 | 0x4);
            switch (withoutFlags) {
            case 1: return 0 | topHalf | swung;
            case 2: return 1 | topHalf | swung;
            case 3: return 2 | topHalf | swung;
            case 0: return 3 | topHalf | swung;
            }
            break;

        case BlockID.SIGN_POST:
            return (data + 12) % 16;

        case BlockID.LADDER:
        case BlockID.WALL_SIGN:
        case BlockID.FURNACE:
        case BlockID.BURNING_FURNACE:
            switch (data) {
            case 5: return 2;
            case 4: return 3;
            case 2: return 4;
            case 3: return 5;
            }
            break;
        }

        return data;
    }

    /**
     * Flip a block's data value.
     * 
     * @param type
     * @param data
     * @return
     */
    public static int flip(int type, int data) {
        return rotate90(type, rotate90(type, data));
    }

    /**
     * Flip a block's data value.
     * 
     * @param type
     * @param data
     * @param direction
     * @return
     */
    public static int flip(int type, int data, FlipDirection direction) {
        int flipX = 0;
        int flipY = 0;
        int flipZ = 0;

        switch (direction) {
        case NORTH_SOUTH:
            flipX = 1;
            break;

        case WEST_EAST:
            flipY = 1;
            break;

        case UP_DOWN:
            flipZ = 1;
            break;
        }

        switch (type) {
        case BlockID.TORCH:
        case BlockID.GREENSTONE_TORCH_OFF:
        case BlockID.GREENSTONE_TORCH_ON:
        case BlockID.LEVER:
        case BlockID.STONE_BUTTON:
            switch (data & ~0x8) {
            case 1: return data + flipX;
            case 2: return data - flipX;
            case 3: return data + flipY;
            case 4: return data - flipY;
            }
            break;

        case BlockID.MINECART_TRACKS:
            switch (data) {
            case 6: return data + flipX + 3*flipY;
            case 7: return data - flipX +   flipY;
            case 8: return data + flipX -   flipY;
            case 9: return data - flipX - 3*flipY;
            }
            /* FALL-THROUGH */

        case BlockID.WOODEN_STAIRS:
        case BlockID.COBBLESTONE_STAIRS:
            switch (data) {
            case 0:
            case 1:
                return data ^ flipX;

            case 2:
            case 3:
                return data ^ flipY;
            }
            break;

        case BlockID.WOODEN_DOOR:
        case BlockID.IRON_DOOR:
            data ^= flipZ << 3;
            switch (data & 0x3) {
            case 0: return data + flipX + 3*flipY;
            case 1: return data - flipX +   flipY;
            case 2: return data + flipX -   flipY;
            case 3: return data - flipX - 3*flipY;
            }
            break;

        case BlockID.SIGN_POST:
            switch (direction) {
            case NORTH_SOUTH:
                return (16-data) & 0xf;
            case WEST_EAST:
                return (8-data) & 0xf;
            }
            break;

        case BlockID.LADDER:
        case BlockID.WALL_SIGN:
        case BlockID.FURNACE:
        case BlockID.BURNING_FURNACE:
            switch (data) {
            case 2:
            case 3:
                return data ^ flipY;
            case 4:
            case 5:
                return data ^ flipX;
            }
            break;

        }

        return data;
    }
}
