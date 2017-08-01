package com.MobBlockMod.tabs;

import com.MobBlockMod.Registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MobBlockModTab extends CreativeTabs {

	public MobBlockModTab(int par1, String par2Str) {
		super(par1, par2Str);		
	}
	
	@Override
	public Item getTabIconItem() 
	{
		ItemStack itemStack = new ItemStack(Registry.tabBlock);
		return itemStack.getItem();
	}

}
