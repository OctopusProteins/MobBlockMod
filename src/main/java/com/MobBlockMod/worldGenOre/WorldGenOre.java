package com.MobBlockMod.worldGenOre;

import java.util.Random;

import com.MobBlockMod.MyCode;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator
{
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, rand, chunkX *16, chunkZ * 16);
			
		case 0:
			generateSurface(world, rand, chunkX *16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) 
	{
		for (int i = 0; i < 10; i++)
			//chng 100(# of times block will spawn in 1 chunk)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(40);//from layer 0 to x
			int randPosZ = chunkZ + rand.nextInt(16);
			
			(new WorldGenMinable(MyCode.chickenOre, 6)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.cowOre, 7)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.mooshroomOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.pigOre, 6)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.sheepOre, 6)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.creeperOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.zombieOre, 6)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.skeletonOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.spiderOre, 6)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.wolfOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.endermanOre, 3)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.villagerOre, 3)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.ocelotOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.horseOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.rabbitOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.zombiepigmenOre, 6)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.blazeOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.witchOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.slimeOre, 7)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.magmacubeOre, 7)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.batOre, 8)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.squidOre, 7)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.cavespiderOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.ghastOre, 3)).generate(world, rand, randPosX, randPosY, randPosZ);
			(new WorldGenMinable(MyCode.silverfishOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
		
		
	}

	private void generateNether(World world, Random rand, int i, int j) 
	{
		
		
	}

}
