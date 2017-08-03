package com.MobBlockMod.items;//Change this

import com.MobBlockMod.init.ModTabs;

import net.minecraft.item.Item;



public class MushyPulp extends Item 
{
	private final String name = "mushyPulp";
	 //
	public MushyPulp() 
	{
		 
		setCreativeTab(ModTabs.mobBlockModTab);
	    setUnlocalizedName(name);
	    setRegistryName(name);
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
