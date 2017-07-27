package com.MobBlockMod.Tree;

import java.util.Random;

import com.MobBlockMod.MyCode;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

public class DwarfTree extends WorldGenAbstractTree {
	
	public DwarfTree() {
		super(false);
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		
		while (world.isAirBlock(x, y, z) && y > 2) {
			y--;
		}
		
		Block block = world.getBlock(x, y, z);
		
		if (block != Blocks.grass && block != Blocks.dirt)  {
			return false;
		}else{
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					if (world.isAirBlock(x + i, y - 1, z + j) && world.isAirBlock(x + i, y - 2, z +j) && !world.isAirBlock(x + i, y, z+ j)) {
						return false;
					}
				}
			}
			int rand = random.nextInt(3);
			if (!(rand == 0)) {
				
			}else{
				rand = random.nextInt(3);
			}
			if (rand == 0) {
				rand = 1;
			}
			int baselength = 0 + random.nextInt(rand);
			int branches = 0 + random.nextInt(1);
			
			int h = 1;
			
			block.onPlantGrow(world, x, y - 1, z, x, y, z);
			
			for (int i = 0; i < baselength; i++) {
				buildBlock(world, x, y + h, z, MyCode.blockLog, 0);
				h++;	
			}
			
			int c = 1;
			for (int i = 0; i < branches; i++) {
				generateBranch(world, random, x, y + h, z, c);
				c++;
				h+=2;
			}
			
			generateTop(world, x, y + h, z);
			return true;
			
		}
		
	}
	
	public void generateTop(World world, int x, int y, int z) {
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
			}
		}
		setNoBlock(world, x, y, z);
		setNoBlock(world, x + 1, y, z);
		setNoBlock(world, x - 1, y, z);
		setNoBlock(world, x, y + 1, z);
		setNoBlock(world, x, y, z + 1);
		setNoBlock(world, x, y, z - 1);
		
		buildBlock(world, x, y, z, MyCode.blockLog, 0);
		buildBlock(world, x + 1, y, z, MyCode.blockLeaf, 0);
		buildBlock(world, x - 1, y, z, MyCode.blockLeaf, 0);
		buildBlock(world, x, y + 1, z, MyCode.blockLeaf, 0);
		buildBlock(world, x, y, z + 1, MyCode.blockLeaf, 0);
		buildBlock(world, x, y, z - 1, MyCode.blockLeaf, 0);
	}
	
	public void generateBranch(World world, Random random, int x, int y, int z, int p) {
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
			}
		}
	}
	
	public void setNoBlock(World world, int x, int y, int z) {
		Block block = world.getBlock(x, y, z); 
		if (!(world.isAirBlock(x, y, z))) {
			if (block != Blocks.log || block != Blocks.log2){
			}
			if (block != MyCode.blockLeaf){
			}
			world.setBlock(x, y, z, Blocks.air);
		}
	}
	
	public void buildBlock(World world, int x, int y, int z, Block block, int meta) {
		if (world.isAirBlock(x, y, z) || world.getBlock(x, y, z).isLeaves(world, x, y, z)) {
			world.setBlock(x, y, z, block, meta, 2);
		}
	}
}
