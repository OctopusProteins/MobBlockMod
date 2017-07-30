package com.MobBlockMod.Tree;

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

public class DwarfTree extends WorldGenerator implements IWorldGenerator {
	
	IBlockState trunkBlock = Registry.dwarfLog.getDefaultState();
	IBlockState leafBlock = Registry.dwarfLeaf.getDefaultState();
	
	@Override
	public boolean generate(World world, Random random, BlockPos blockPos) {
		
		IBlockState block = world.getBlockState(blockPos.add(0, -1, 0));
		
		if (block == Blocks.GRASS.getDefaultState() || block == Blocks.DIRT.getDefaultState()){
			
			int prob = random.nextInt(10);
			if (prob == 7) {
				buildBlock(world, blockPos, trunkBlock, 0);
				generateTop(world, blockPos.add(0, 1, 0));
			}else{
				generateTop(world, blockPos);
			}
			
			return true;
			
		}else{
			return false;
		}
		
		
	}
	
	public void generateTop(World world, BlockPos blockPos) {
		
		setNoBlock(world, blockPos);
		setNoBlock(world, blockPos.add(1, 0, 0));
		setNoBlock(world, blockPos.add(-1, 0, 0));
		setNoBlock(world, blockPos.add(0, 1, 0));
		setNoBlock(world, blockPos.add(0, 0, 1));
		setNoBlock(world, blockPos.add(0, 0, -1));
		
		buildBlock(world, blockPos, trunkBlock, 0);
		buildBlock(world, blockPos.add(1, 0, 0), leafBlock, 0);
		buildBlock(world, blockPos.add(-1, 0, 0), leafBlock, 0);
		buildBlock(world, blockPos.add(0, 1, 0), leafBlock, 0);
		buildBlock(world, blockPos.add(0, 0, 1), leafBlock, 0);
		buildBlock(world, blockPos.add(0, 0, -1), leafBlock, 0);
		
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
