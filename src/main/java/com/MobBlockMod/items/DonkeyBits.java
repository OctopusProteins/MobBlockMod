package com.MobBlockMod.items;//Change this

import com.MobBlockMod.Registry;

import net.minecraft.item.Item;



public class DonkeyBits extends Item 
{
	private final String name = "donkeyBits";
	 
	public DonkeyBits() 
	{
		// 
		setCreativeTab(Registry.mobBlockModTab);
	    setUnlocalizedName(name);
	    
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
