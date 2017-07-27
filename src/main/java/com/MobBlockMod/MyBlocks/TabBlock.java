package com.MobBlockMod.MyBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TabBlock extends Block{
	private final String name = "tabBlock";
	
	public TabBlock() {
		super(Material.air);
		GameRegistry.registerBlock(this, name);
        setUnlocalizedName(name);
	}
	public String getName()
    {
    	return name;
    }

}
