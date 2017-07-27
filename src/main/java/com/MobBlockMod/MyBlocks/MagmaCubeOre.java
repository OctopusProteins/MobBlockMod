package com.MobBlockMod.MyBlocks;

import java.util.Random;

import com.MobBlockMod.YourModsName;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MagmaCubeOre extends Block 
	{
	public static final String modid = YourModsName.MODID;
			@SideOnly(Side.CLIENT)
			private IIcon top;
			@SideOnly(Side.CLIENT)
			private IIcon bottom;
			private IIcon[] icons;
    
			@SideOnly(Side.CLIENT)
			public IIcon getIcon(int side, int p_149691_2_)
			{
				return side == 1 || side == 0 ? this.top : (side == 1 ? this.bottom : this.blockIcon);
			}
    
			@SideOnly(Side.CLIENT)
			public void registerBlockIcons(IIconRegister p_149651_1_)
			{
				this.blockIcon = p_149651_1_.registerIcon(modid + ":" + "magmacubestone");
				this.top = p_149651_1_.registerIcon(modid + ":" + "magmacubestone_1");
    			this.bottom = p_149651_1_.registerIcon(modid + ":" + "magmacubestone_0");
			}

			public MagmaCubeOre (Material material) 
	        {
	                super(material);
	                this.setBlockTextureName(modid + ":" + "magmacubestone");
	        }


	}
