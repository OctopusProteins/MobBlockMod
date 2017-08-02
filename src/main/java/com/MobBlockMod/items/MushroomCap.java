package com.MobBlockMod.items;//Change this

import com.MobBlockMod.Registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class MushroomCap extends Item 
{
	private final String name = "mushroomCap";
	 //
	public MushroomCap() 
	{
		 
		setCreativeTab(Registry.mobBlockModTab);
	    setUnlocalizedName(name);
	    
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
