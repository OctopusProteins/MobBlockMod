package com.MobBlockMod.Tree;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.scoreboard.IScoreObjectiveCriteria.EnumRenderType;
import net.minecraft.util.EnumWorldBlockLayer;
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

}
