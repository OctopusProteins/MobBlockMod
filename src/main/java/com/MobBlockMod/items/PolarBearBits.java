package com.MobBlockMod.items;//Change this

import com.MobBlockMod.Registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class PolarBearBits extends Item 
{
	private final String name = "polarbearBits";
	 
	public PolarBearBits() 
	{
		GameRegistry.registerItem(this, name);
		setCreativeTab(Registry.mobBlockModTab);
	    setUnlocalizedName(name);
	    
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
