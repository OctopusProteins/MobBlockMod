package com.MobBlockMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TabBlock extends Block{
	private final String name = "tabBlock";
	
	public TabBlock() {
		super(Material.AIR);
		setRegistryName(name);
        setUnlocalizedName(name);
	}
	public String getName()
    {
    	return name;
    }

}
