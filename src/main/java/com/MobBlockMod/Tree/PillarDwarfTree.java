package com.MobBlockMod.tree;

import java.util.Random;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class PillarDwarfTree extends WorldGenerator implements IWorldGenerator {
	

	IBlockState trunkBlock = Registry.dwarfLog.getDefaultState();
	IBlockState leafBlock = Registry.dwarfLeaf.getDefaultState();
	
	@Override
	public boolean generate(World world, Random random, BlockPos blockPos) {
		
		IBlockState block = world.getBlockState(blockPos.add(0, -1, 0));
		int interval = random.nextInt(30);
		
		if ((block == Blocks.GRASS.getDefaultState() || block == Blocks.DIRT.getDefaultState()) && interval == 7) {
			
			int height = 30 + random.nextInt(30);
			generateTrunk(world, blockPos, trunkBlock, leafBlock, height);
			
			
			return true;
		}else{
			return false;
		}
	}
	
	public void generateTrunk(World world, BlockPos blockPos, IBlockState trunk, IBlockState leaf, int height) {
		for (int i = 0; i <= height; i++) {
			for (int j = -3; j <= 4; j++) {
				for (int k = -3; k <= 4; k++) {
					buildBlock(world, blockPos.add(j, i, k), leaf, 0);
				}
			}
			buildBlock(world, blockPos.add(0, i, 0), trunk, 0);
			buildBlock(world, blockPos.add(0, i, 1), trunk, 0);
			buildBlock(world, blockPos.add(1, i, 0), trunk, 0);
			buildBlock(world, blockPos.add(1, i, 1), trunk, 0);
		}
		generateTop(world, blockPos, trunk, leaf, height);
	}
	
public void generateTop(World world, BlockPos blockPos, IBlockState trunk, IBlockState leaf, int height) {
	for (int i = -2; i <= 3; i++) {
		for (int j = -2; j <= 3; j++) {
			buildBlock(world, blockPos.add(i, height + 1, j), leaf, 0);
		}
	}
	
	for (int i = -1; i <= 2; i++) {
		for (int j = -1; j <= 2; j++) {
			buildBlock(world, blockPos.add(i, height + 2, j), leaf, 0);
		}
	}
	
	buildBlock(world, blockPos.add(0, height + 3, 0), leaf, 0);
	buildBlock(world, blockPos.add(1, height + 3, 0), leaf, 0);
	buildBlock(world, blockPos.add(1, height + 3, 1), leaf, 0);
	buildBlock(world, blockPos.add(0, height + 3, 1), leaf, 0);
}
	
public void setNoBlock(World world, BlockPos blockPos) {
		
		Block block = world.getBlockState(blockPos).getBlock(); 
		if (!(world.isAirBlock(blockPos))) {
			
			world.setBlockState(blockPos, Blocks.AIR.getDefaultState());//(x, y, z, Blocks.air);
		}
	}
	
	public void buildBlock(World world, BlockPos blockPos, IBlockState block, int meta) {
		
		if (world.isAirBlock(blockPos) || world.getBlockState(blockPos).getBlock().isLeaves(block, world, blockPos)) {
			
			world.setBlockState(blockPos, block);
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}

	
}