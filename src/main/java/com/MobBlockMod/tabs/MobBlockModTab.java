package com.MobBlockMod.tabs;

import com.MobBlockMod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MobBlockModTab extends CreativeTabs {

	public MobBlockModTab(int par1, String par2Str) {
		super(par1, par2Str);		
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(ModBlocks.tabBlock));
	}

}
