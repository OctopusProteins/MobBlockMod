package com.MobBlockMod.items;//Change this

import com.MobBlockMod.Registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class OcelotBits extends Item 
{
	private final String name = "ocelotBits";
	 //
	public OcelotBits() 
	{
		 
		setCreativeTab(Registry.mobBlockModTab);
	    setUnlocalizedName(name);
	    
	}
	        
	public String getName()
	{
		return name;
	}
	      
}
