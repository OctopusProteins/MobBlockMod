package com.MobBlockMod.world;

import java.util.Random;

import com.MobBlockMod.Registry;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MBMWorldGen implements IWorldGenerator{

	//private WorldGenerator 
	private WorldGenerator chickenOre;
	private WorldGenerator cowOre;
	private WorldGenerator mooshroomOre;
	private WorldGenerator pigOre;
	private WorldGenerator sheepOre;
	private WorldGenerator creeperOre;
	private WorldGenerator zombieOre;
	private WorldGenerator skeletonOre;
	private WorldGenerator spiderOre;
	private WorldGenerator wolfOre;
	private WorldGenerator endermanOre;
	private WorldGenerator villagerOre;
	private WorldGenerator ocelotOre;
	private WorldGenerator horseOre;
	private WorldGenerator rabbitOre;
	private WorldGenerator zombiepigmenOre;
	private WorldGenerator blazeOre;
	private WorldGenerator witchOre;
	private WorldGenerator slimeOre;
	private WorldGenerator magmacubeOre;
	private WorldGenerator batOre;
	private WorldGenerator squidOre;
	private WorldGenerator cavespiderOre;
	private WorldGenerator ghastOre;
	private WorldGenerator silverfishOre;
	private WorldGenerator endermiteOre;
	private WorldGenerator guardianOre;
	private WorldGenerator elderguardianOre;
	
	public MBMWorldGen() {
		this.batOre = new MBMWorldGenMinable(Registry.batOre.getDefaultState(), 8);
		this.chickenOre = new MBMWorldGenMinable(Registry.chickenOre.getDefaultState(), 6);
		this.cowOre = new MBMWorldGenMinable(Registry.cowOre.getDefaultState(), 7);
		this.mooshroomOre = new MBMWorldGenMinable(Registry.mooshroomOre.getDefaultState(), 5);
		this.pigOre = new MBMWorldGenMinable(Registry.pigOre.getDefaultState(), 6);
		this.sheepOre = new MBMWorldGenMinable(Registry.sheepOre.getDefaultState(), 6);
		this.creeperOre = new MBMWorldGenMinable(Registry.creeperOre.getDefaultState(), 5);
		this.zombieOre = new MBMWorldGenMinable(Registry.zombieOre.getDefaultState(), 6);
		this.skeletonOre = new MBMWorldGenMinable(Registry.skeletonOre.getDefaultState(), 5);
		this.spiderOre = new MBMWorldGenMinable(Registry.spiderOre.getDefaultState(), 6);
		this.wolfOre = new MBMWorldGenMinable(Registry.wolfOre.getDefaultState(), 4);
		this.villagerOre = new MBMWorldGenMinable(Registry.villagerOre.getDefaultState(), 3);
		this.ocelotOre = new MBMWorldGenMinable(Registry.ocelotOre.getDefaultState(), 4);
		this.horseOre = new MBMWorldGenMinable(Registry.horseOre.getDefaultState(), 4);
		this.rabbitOre = new MBMWorldGenMinable(Registry.rabbitOre.getDefaultState(), 5);
		this.witchOre = new MBMWorldGenMinable(Registry.witchOre.getDefaultState(), 4);
		this.slimeOre = new MBMWorldGenMinable(Registry.slimeOre.getDefaultState(), 7);
		this.batOre = new MBMWorldGenMinable(Registry.batOre.getDefaultState(), 8);
		this.squidOre = new MBMWorldGenMinable(Registry.squidOre.getDefaultState(), 7);
		this.cavespiderOre = new MBMWorldGenMinable(Registry.cavespiderOre.getDefaultState(), 4);
		this.silverfishOre = new MBMWorldGenMinable(Registry.silverfishOre.getDefaultState(), 5);
		this.guardianOre = new MBMWorldGenMinable(Registry.guardianOre.getDefaultState(), 4);
		//this.elderguardianOre = new MBMWorldGenMinable(Registry.elderguardianOre.getDefaultState(), 3);
		
		this.endermanOre = new MBMWorldGenEndMinable(Registry.endermanOre.getDefaultState(), 3);
		this.endermiteOre = new MBMWorldGenEndMinable(Registry.endermiteOre.getDefaultState(), 6);
		
		this.ghastOre = new MBMWorldGenNetherMinable(Registry.ghastOre.getDefaultState(), 3);
		this.zombiepigmenOre = new MBMWorldGenNetherMinable(Registry.zombiepigmenOre.getDefaultState(), 6);
		this.blazeOre = new MBMWorldGenNetherMinable(Registry.blazeOre.getDefaultState(), 5);
		this.magmacubeOre = new MBMWorldGenNetherMinable(Registry.magmacubeOre.getDefaultState(), 7);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimensionId()) {
		case 0: //overworld
			this.runGenerator(batOre, world, random, chunkX, chunkZ, 6, 0, 35);
			this.runGenerator(chickenOre, world, random, chunkX, chunkZ, 6, 0, 35);
			this.runGenerator(cowOre, world, random, chunkX, chunkZ, 7, 0, 35);
			this.runGenerator(mooshroomOre, world, random, chunkX, chunkZ, 5, 0, 35);
			this.runGenerator(pigOre, world, random, chunkX, chunkZ, 6, 0, 35);
			this.runGenerator(sheepOre, world, random, chunkX, chunkZ, 6, 0, 35);
			this.runGenerator(creeperOre, world, random, chunkX, chunkZ, 5, 0, 35);
			this.runGenerator(zombieOre, world, random, chunkX, chunkZ, 6, 0, 35);
			this.runGenerator(skeletonOre, world, random, chunkX, chunkZ, 5, 0, 35);
			this.runGenerator(spiderOre, world, random, chunkX, chunkZ, 6, 0, 35);
			this.runGenerator(wolfOre, world, random, chunkX, chunkZ, 4, 0, 35);
			this.runGenerator(villagerOre, world, random, chunkX, chunkZ, 3, 0, 35);
			this.runGenerator(ocelotOre, world, random, chunkX, chunkZ, 4, 0, 35);
			this.runGenerator(horseOre, world, random, chunkX, chunkZ, 4, 0, 35);
			this.runGenerator(rabbitOre, world, random, chunkX, chunkZ, 5, 0, 35);
			this.runGenerator(witchOre, world, random, chunkX, chunkZ, 4, 0, 35);
			this.runGenerator(slimeOre, world, random, chunkX, chunkZ, 7, 0, 35);
			this.runGenerator(batOre, world, random, chunkX, chunkZ, 8, 0, 35);
			this.runGenerator(squidOre, world, random, chunkX, chunkZ, 7, 0, 35);
			this.runGenerator(cavespiderOre, world, random, chunkX, chunkZ, 4, 0, 35);
			this.runGenerator(silverfishOre, world, random, chunkX, chunkZ, 5, 0, 35);
			this.runGenerator(guardianOre, world, random, chunkX, chunkZ, 6, 0, 35);
			//this.runGenerator(elderguardianOre, world, random, chunkX, chunkZ, 4, 0, 35);
			
			break;
		case -1: //nether
			this.runGenerator(zombiepigmenOre, world, random, chunkX, chunkZ, 8, 1, 126); //bottom to top of dim - 8
			this.runGenerator(magmacubeOre, world, random, chunkX, chunkZ, 7, 1, 126); //7
			this.runGenerator(blazeOre, world, random, chunkX, chunkZ, 4, 1, 126); //4
			this.runGenerator(ghastOre, world, random, chunkX, chunkZ, 6, 1, 126); //6
			break;
		case 1: //end
			
			this.runGenerator(endermanOre, world, random, chunkX, chunkZ, 8, 8, 60); //bottom to top
			this.runGenerator(endermiteOre, world, random, chunkX, chunkZ, 12, 8, 60);
			break;
		}
		// TODO Auto-generated method stub
		
	}
	
	public void runGenerator(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("MinHeight or MaxHeight is out of bounds");
		}
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chanceToSpawn; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 +rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	

}
