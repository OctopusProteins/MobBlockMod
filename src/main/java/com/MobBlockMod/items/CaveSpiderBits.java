package com.MobBlockMod.items;//Change this

import com.MobBlockMod.Registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class CaveSpiderBits extends Item 
{
	private final String name = "cavespiderBits";
	 //
	public CaveSpiderBits() 
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
