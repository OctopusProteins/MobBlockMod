package com.MobBlockMod.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DwarfLeaf extends Block
{
	private final String name = "dwarfLeaf";
	
	        public DwarfLeaf() 
	        {
	                super(Material.leaves);
	                GameRegistry.registerBlock(this, name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(0.5F);
	      	        setStepSound(Block.soundTypeGrass);
	      	        
	      	        
	        }
	        public String getName()
	        {
	        	return name;
	        }
	        
	        @SideOnly(Side.CLIENT)
	        public EnumWorldBlockLayer getBlockLayer()
	        {
	          return EnumWorldBlockLayer.CUTOUT;
	        }
	        @Override
	        public boolean isOpaqueCube() {
	        	
	        	return false;
	        }
			public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
				// TODO Auto-generated method stub
				List<ItemStack> list = new ArrayList();
				Random rand = new Random();
				if (rand.nextInt(100) < 25) {
					list.add(new ItemStack(Registry.pulp));
				}
				return list;
			}
			
			private void destroy(World worldIn, BlockPos pos)
		    {
		        this.dropBlockAsItem(worldIn, pos, worldIn.getBlockState(pos), 0);
		        worldIn.setBlockToAir(pos);
		    }
}
