package com.MobBlockMod.Tree;

import com.MobBlockMod.Registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DwarfLog extends Block 
{
	private final String name = "dwarfLog";
	
	        public DwarfLog() 
	        {
	                super(Material.wood);
	                GameRegistry.registerBlock(this, name);
	                setUnlocalizedName(name);
	                setCreativeTab(Registry.mobBlockModTab);
	                setHardness(2.5F);
	      	        setStepSound(Block.soundTypeWood);
	        }
	        public String getName()
	        {
	        	return name;
	        }

}
