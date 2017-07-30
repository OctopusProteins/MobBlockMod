package com.MobBlockMod.world;

import java.util.Random;

import com.MobBlockMod.Registry;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
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
	private WorldGenerator shulkerOre;
	
	public MBMWorldGen() {
		this.batOre = new WorldGenMinable(Registry.batOre.getDefaultState(), 8);
		this.chickenOre = new WorldGenMinable(Registry.chickenOre.getDefaultState(), 6);
		this.cowOre = new WorldGenMinable(Registry.cowOre.getDefaultState(), 7);
		this.mooshroomOre = new WorldGenMinable(Registry.mooshroomOre.getDefaultState(), 5);
		this.pigOre = new WorldGenMinable(Registry.pigOre.getDefaultState(), 6);
		this.sheepOre = new WorldGenMinable(Registry.sheepOre.getDefaultState(), 6);
		this.creeperOre = new WorldGenMinable(Registry.creeperOre.getDefaultState(), 5);
		this.zombieOre = new WorldGenMinable(Registry.zombieOre.getDefaultState(), 6);
		this.skeletonOre = new WorldGenMinable(Registry.skeletonOre.getDefaultState(), 5);
		this.spiderOre = new WorldGenMinable(Registry.spiderOre.getDefaultState(), 6);
		this.wolfOre = new WorldGenMinable(Registry.wolfOre.getDefaultState(), 4);
		this.villagerOre = new WorldGenMinable(Registry.villagerOre.getDefaultState(), 3);
		this.ocelotOre = new WorldGenMinable(Registry.ocelotOre.getDefaultState(), 4);
		this.horseOre = new WorldGenMinable(Registry.horseOre.getDefaultState(), 4);
		this.rabbitOre = new WorldGenMinable(Registry.rabbitOre.getDefaultState(), 5);
		this.witchOre = new WorldGenMinable(Registry.witchOre.getDefaultState(), 4);
		this.slimeOre = new WorldGenMinable(Registry.slimeOre.getDefaultState(), 7);
		this.batOre = new WorldGenMinable(Registry.batOre.getDefaultState(), 8);
		this.squidOre = new WorldGenMinable(Registry.squidOre.getDefaultState(), 7);
		this.cavespiderOre = new WorldGenMinable(Registry.cavespiderOre.getDefaultState(), 4);
		this.silverfishOre = new WorldGenMinable(Registry.silverfishOre.getDefaultState(), 5);
		this.guardianOre = new WorldGenMinable(Registry.guardianOre.getDefaultState(), 4);
		//this.elderguardianOre = new WorldGenMinable(Registry.elderguardianOre.getDefaultState(), 3);
		
		this.shulkerOre = new WorldGenMinable(Registry.shulkerOre.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.END_STONE));
		this.endermanOre = new WorldGenMinable(Registry.endermanOre.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.END_STONE));
		this.endermiteOre = new WorldGenMinable(Registry.endermiteOre.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.END_STONE));
		
		this.ghastOre = new WorldGenMinable(Registry.ghastOre.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		this.zombiepigmenOre = new WorldGenMinable(Registry.zombiepigmenOre.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK));
		this.blazeOre = new WorldGenMinable(Registry.blazeOre.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
		this.magmacubeOre = new WorldGenMinable(Registry.magmacubeOre.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
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
			this.runGenerator(shulkerOre, world, random, chunkX, chunkZ, 10, 8, 60);
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
