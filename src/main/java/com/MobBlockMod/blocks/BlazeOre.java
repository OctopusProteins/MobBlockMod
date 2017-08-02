package com.MobBlockMod.blocks;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlazeOre extends Block 
{
	private final String name = "blazeOre";
	
	        public BlazeOre() 
	        {
	                super(Material.GROUND);
	                setRegistryName(name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(1.8F);
	      	        setHarvestLevel("pickaxe", 0);
	      	      this.setSoundType(SoundType.STONE);
	      	        setLightLevel(8 / 16f);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}
