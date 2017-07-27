package com.MobBlockMod.Tree;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.MobBlockMod.Registry;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DwarfSapling extends BlockBush implements IGrowable, IPlantable {

	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
	public static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);
	public static final List<net.minecraft.block.Block> SOIL = Arrays.asList(new net.minecraft.block.Block[]{Blocks.dirt, Blocks.grass});
	private final static String name = "dwarfSapling";
	
	public DwarfSapling() {
		super(Material.plants);
		setUnlocalizedName(name);
		this.setTickRandomly(true);
		this.setDefaultState(this.getDefaultState().withProperty(STAGE, 0));
		setCreativeTab(Registry.mobBlockModTab);
		GameRegistry.registerBlock(this, name);
	}
	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[]{STAGE});
	}
	
	@SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
      return EnumWorldBlockLayer.CUTOUT;
    }
    @Override
    public boolean isOpaqueCube() {
    	
    	return false;
    }
	
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return super.canPlaceBlockAt(worldIn, pos) && SOIL.contains(worldIn.getBlockState(pos.down()).getBlock());
	}
	
	public void checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state)
    {
		if (!this.canBlockStay(worldIn, pos, state))
        {
            this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockState(pos, Blocks.air.getDefaultState(), 3);
        }
    }
	
	@SuppressWarnings(value="deprecation")
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, net.minecraft.block.Block blockIn,
			BlockPos fromPos) {
		//super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		this.checkAndDropBlock(worldIn, pos, state);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
		IBlockState soil = worldIn.getBlockState(pos.down());
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
        {
            return soil.getBlock().canSustainPlant(worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
        }
        return SOIL.contains(soil);
    }
	
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(STAGE, meta);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return (Integer) state.getValue(STAGE);
	}
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return SAPLING_AABB;
	}
	
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return SAPLING_AABB;
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);
            this.checkAndDropBlock(worldIn, pos, state);
            if(worldIn.getBlockState(pos).getBlock() != this) return;
            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
            {
                this.grow(worldIn, rand, pos, state);
            }
        }
	}
	
	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		if (((Integer)state.getValue(STAGE)).intValue() == 0)
        {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else
        {
        	//correcting y pos
        	BlockPos down = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        	new DwarfTree().generate(worldIn, rand, pos);
        }
	}

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		return true;
	}
	
	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return (double)worldIn.rand.nextFloat() < 0.45D;
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Plains;
	}
	
	@Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
	
	public static String getName() {
		return name;
	}

}