package com.MobBlockMod.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
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
	                super(Material.LEAVES);
	                GameRegistry.registerBlock(this, name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(0.5F);
	                this.setSoundType(SoundType.PLANT);
	      	        
	      	        
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
