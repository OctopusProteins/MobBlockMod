package com.MobBlockMod.Tree;

import java.util.List;

import com.MobBlockMod.MyCode;
import com.MobBlockMod.YourModsName;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MBMLeaf extends BlockLeaves {
	
	public static final String modid = YourModsName.MODID;
	
	public static final String[][] Leaftypes = new String[][] {{"LeafDwarf"}, {"LeafDwarfOpaque"}};
	public static final String[] leaves = new String[] {"Dwarf"};
	
	protected void func_150124_c(World p_150124_1_, int p_150124_2_, int p_150124_3_, int p_150124_4_, int p_150124_5_, int p_150124_6_)
    {
        if ((p_150124_5_ & 3) == 1 && p_150124_1_.rand.nextInt(p_150124_6_) == 0)
        {
            this.dropBlockAsItem(p_150124_1_, p_150124_2_, p_150124_3_, p_150124_4_, new ItemStack(MyCode.blockSapling, 1, 0));
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return super.damageDropped(p_149692_1_) + 4;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_)
    {
        return p_149643_1_.getBlockMetadata(p_149643_2_, p_149643_3_, p_149643_4_) & 3;
    }


    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ic)
    {
        for (int i = 0; i < Leaftypes.length; ++i)
        {
            this.field_150129_M[i] = new IIcon[Leaftypes[i].length];

            for (int j = 0; j < Leaftypes[i].length; ++j)
            {
                this.field_150129_M[i][j] = ic.registerIcon(modid + ":" + "LeafDwarf");
                this.field_150129_M[i][j] = ic.registerIcon(modid + ":" + "LeafDwarfOpaque");
            }
        }
    }
    
	@Override
	public IIcon getIcon(int side, int meta) {
		return (meta & 0x3) == 1 ? this.field_150129_M[this.field_150127_b][0] : this.field_150129_M[this.field_150127_b][0];
	}

	@Override
	public String[] func_150125_e() {
		return leaves;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess blockaccess, int x, int y, int z, int side) {
		return true;
	}
	
}
