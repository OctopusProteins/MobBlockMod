package com.MobBlockMod.tree;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenDwarfTree implements IWorldGenerator{
	
   private WorldGenerator dwarfTree;
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        
		switch(world.provider.getDimension()){
            case 0:
                //generateSurface(world, random, chunkX * 16, chunkZ * 16);
            	this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
            	//System.out.println("switch");
            	break;
            case 1:
                break;
            case -1:               
                break;
		}
		
	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		//System.out.println("Surface Gebn");
		for(int i = 0; i < 3; i++){
			int Xcoord1 = BlockX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = BlockZ + random.nextInt(16);
			
			BlockPos blockPos = new BlockPos(Xcoord1, Ycoord1, Zcoord1);
			//System.out.println(i);
			
			//new DwarfTree().generate(world, random, blockPos);
			new DwarfTree().generate(world, random, blockPos);
			//System.out.println("Gneeratte");
		}	
			}

    
}
