package com.MobBlockMod.Tree;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenTallDwarfTree implements IWorldGenerator{
   
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        
		switch(world.provider.dimensionId){
            case 1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
		
	}
    
	private void generateEnd(World world, Random random, int chunkX, int chunkZ){
		
	}
    
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {

		for(int i = 0; i < 3; i++){
			int Xcoord1 = BlockX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = BlockZ + random.nextInt(16);
			BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(Xcoord1, Zcoord1);	
			if (biomegenbase == BiomeGenBase.coldTaiga || biomegenbase == BiomeGenBase.coldTaigaHills || biomegenbase == BiomeGenBase.megaTaiga || biomegenbase == BiomeGenBase.megaTaigaHills || biomegenbase == BiomeGenBase.taiga || biomegenbase == BiomeGenBase.taigaHills) {
				(new TallDwarfTree()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			}
		}	
	}
    
	private void generateNether(World world, Random random, int chunkX, int chunkZ){
		
	}
	

    
}
