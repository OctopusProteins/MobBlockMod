package com.MobBlockMod.tree;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenPillarDwarfTree implements IWorldGenerator{
	
   private WorldGenerator tallDwarfTree;
  
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        
		switch(world.provider.getDimension()){
            case 0:
                if (random.nextInt(3) == 1){
            	this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
                }
            	break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
		}
		
	}
    
	private void generateEnd(World world, Random random, int chunkX, int chunkZ){
		
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
			new PillarDwarfTree().generate(world, random, blockPos);
			//System.out.println("Gneeratte");
		}	
			}
    
	private void generateNether(World world, Random random, int chunkX, int chunkZ){
		
	}
	

    
}
