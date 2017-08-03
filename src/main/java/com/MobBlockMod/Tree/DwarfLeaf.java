package com.MobBlockMod.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.MobBlockMod.init.ModItems;
import com.MobBlockMod.init.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DwarfLeaf extends Block implements IShearable
{
	private final String name = "dwarfLeaf";
	
	        public DwarfLeaf() 
	        {
	                super(Material.LEAVES);
	                setRegistryName(name);
	                setUnlocalizedName(name);
	                setCreativeTab(ModTabs.mobBlockModTab);
	                setHardness(0.2F);
	                this.setSoundType(SoundType.PLANT);
	      	        Blocks.FIRE.setFireInfo(this, 8, 60);
	      	        
	        }
	        public String getName()
	        {
	        	return name;
	        }
	        
	        
	        @SideOnly(Side.CLIENT)
	        public BlockRenderLayer getBlockLayer()
	        {
	          return BlockRenderLayer.CUTOUT;
	        }
	        @Override
	        public boolean isOpaqueCube(IBlockState iBlockState) {
	          return false;
	        }
			public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
				// TODO Auto-generated method stub
				List<ItemStack> list = new ArrayList();
				Random rand = new Random();
				if (rand.nextInt(100) < 25) {
					list.add(new ItemStack(ModItems.pulp));
				}
				return list;
			}
			
			private void destroy(World worldIn, BlockPos pos)
		    {
		        this.dropBlockAsItem(worldIn, pos, worldIn.getBlockState(pos), 0);
		        worldIn.setBlockToAir(pos);
		    }
			@Override
			public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
				// TODO Auto-generated method stub
				return true;
			}
}
