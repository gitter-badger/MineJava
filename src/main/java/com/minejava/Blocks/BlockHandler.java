/*
 *This project and data files were written for MineJava and MineJava plugin usage.
 *By use of this code, you hereby notice this has been developed by the MineJava team.
 *This code is applicable for use in the MineJava mod, MineJava plugins, and ported Servers.
 *You may modify [Add/Remove] this code to better serve your code, as long as it is for usage with MineCraft Pocket Edition.
 *By use of this code, you hereby agree to the above terms.
 */

package com.minejava.Blocks;
import com.minejava.Blocks.BlockType.*;

/**
 * Lead Developers:
 * CFerg | Elite
 *
 */
public class BlockHandler {
    public static Block GetBlockById(byte blockId){
        Block block;
        switch (blockId)
        {
        case 0:
                block = new Air();
                break;
        case 1: 
                block = new Stone();
                break;
        case 2:
                block = new Grass();
                break;
        case 3:
                block = new Dirt();
                break;
        case 4:
                block = new Cobblestone();
                break;
        case 5:
                block = new Wooden_Planks();
                break;
        case 6:
                block = new Sapling();
                break;
        case 7:
                block = new Bedrock();
                break;
        case 8:
                block = new Water();
                break;
        case 9:
                block = new Stationary_Water();
                break;
        case 10:
                block = new Lava();
                break;
        case 11:
                block = new Stationary_Lava();
                break;
        case 12:
                block = new Sand();
                break;
        case 13:
                block = new Gravel();
                break;
        case 14:
                block = new Gold_Ore();
                break;
        case 15:
                block = new Iron_Ore();
                break;
        case 16:
                block = new Coal_Ore();
                break;
        case 17:
                block = new Wood();
                break;
        case 20:
                block = new Glass();
                break;
        case 21:
                block = new Lapis_Lazuli_Ore();
                break;
        case 22:
                block = new Lapis_Lazuli_Block();
                break;
        case 24:
                block = new Sandstone();
                break;
        case 26:
                block = new Bed();
                break;
        case 31:
                block = new Tall_Grass();
                break;
        case 41:
                block = new Block_of_Gold();
                break;
        case 43:
                block = new Double_Stone_Slab();
                break;
        case 44:
                block = new Stone_Slab();
                break;
        case 46:
                block = new TNT();
                break;
        case 47:
                block = new Bookshelf();
                break;
        case 49:
                block = new Obsidian();
                break;
        case 50:
                block = new Torch();
                break;
        case 51:
                block = new Fire();
                break;
        case 53:
                block = new Oak_Wood_Stairs();
                break;
        case 54:
                block = new Chest();
                break;
        case 56:
                block = new Diamond_Ore();
                break;
        case 58:
                block = new Crafting_Table();
                break;
        case 60:
                block = new Farmland();
                break;
        case 61:
                block = new Furnace();
                break;
        case 62:
                block = new Burning_Furnace();
                break;
        case 63:
                block = new Sign();
                break;
        case 64:
                block = new Wooden_Door();
                break;
        case 67:
                block = new Cobblestone_Stairs();
                break;
        case 68:
                block = new Wall_Sign();
                break;
        case 79:
                block = new Ice();
                break;
        case 80:
                block = new Snow();
                break;
        case 85:
                block = new Fence();
                break;
        case 98:
                block = new Stone_Brick();
                break;
        case 107:
                block = new Fence_Gate();
                break;
        case 108:
                block = new Brick_Stairs();
                break;
        case 109:
                block = new Stone_Brick_Stairs();
                break;
        case 114:
                block = new Nether_Brick_Stairs();
                break;
        case 128:
                block = new Sandstone_Stairs();
                break;
        case 134:
                block = new Spruce_Wood_Stairs();
                break;
        case 135:
                block = new Birch_Wood_Stairs();
                break;
        case 136:
                block = new Jungle_Wood_Stairs();
                break;
        case 156:
                block = new Quartz_Stairs();
                break;
        case 157:
                block = new Wooden_Double_Slab();
                break;
        case 158:
                block = new Wooden_Slab();
                break;
        case 163:
                block = new Acacia_Wood_Stairs();
                break;
        case 164:
                block = new Dark_Oak_Wood_Stairs();
                break;
        case 173:
                block = new Block_of_Coal();
                break;
        case 198:
                block = new Grass_Path();
                break;
        default:
                block = new Block(blockId);
                break;
        }
        return block;
    }
}
