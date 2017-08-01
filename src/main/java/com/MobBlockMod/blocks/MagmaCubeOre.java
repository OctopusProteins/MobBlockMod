package com.MobBlockMod.blocks;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MagmaCubeOre extends Block 
{
	private final String name = "magmacubeOre";
	
	        public MagmaCubeOre() 
	        {
	                super(Material.GROUND);
	                GameRegistry.registerBlock(this, name);
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
