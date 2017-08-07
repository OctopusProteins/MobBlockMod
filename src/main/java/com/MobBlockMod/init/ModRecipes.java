   package com.MobBlockMod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

	public static void registerRecipes() {
		addSmeltingRecipes();
	}

	private static void addSmeltingRecipes() {
		GameRegistry.addSmelting(ModBlocks.chickenOre, new ItemStack(ModItems.chickenBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.cowOre, new ItemStack(ModItems.cowBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.mooshroomOre, new ItemStack(ModItems.mooshroomBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.wolfOre, new ItemStack(ModItems.wolfBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.pigOre, new ItemStack(ModItems.pigBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.sheepOre, new ItemStack(ModItems.sheepBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.creeperOre, new ItemStack(ModItems.creeperBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.zombieOre, new ItemStack(ModItems.zombieBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.skeletonOre, new ItemStack(ModItems.skeletonBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.spiderOre, new ItemStack(ModItems.spiderBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.endermanOre, new ItemStack(ModItems.endermanBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.villagerOre, new ItemStack(ModItems.villagerBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.ocelotOre, new ItemStack(ModItems.ocelotBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.horseOre, new ItemStack(ModItems.horseBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.rabbitOre, new ItemStack(ModItems.rabbitBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.zombiepigmenOre, new ItemStack(ModItems.zombiepigmenBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.blazeOre, new ItemStack(ModItems.blazeBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.witchOre, new ItemStack(ModItems.witchBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.slimeOre, new ItemStack(ModItems.slimeBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.magmacubeOre, new ItemStack(ModItems.magmacubeBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.batOre, new ItemStack(ModItems.batBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.squidOre, new ItemStack(ModItems.squidBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.cavespiderOre, new ItemStack(ModItems.cavespiderBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.ghastOre, new ItemStack(ModItems.ghastBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.silverfishOre, new ItemStack(ModItems.silverfishBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.endermiteOre, new ItemStack(ModItems.endermiteBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.guardianOre, new ItemStack(ModItems.guardianBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.elderguardianOre, new ItemStack(ModItems.elderguardianBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.shulkerOre, new ItemStack(ModItems.shulkerBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.polarbearOre, new ItemStack(ModItems.polarbearBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.witherskeletonOre, new ItemStack(ModItems.witherskeletonBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.huskOre, new ItemStack(ModItems.huskBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.strayOre, new ItemStack(ModItems.strayBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.muleOre, new ItemStack(ModItems.muleBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.donkeyOre, new ItemStack(ModItems.donkeyBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.skeletonhorseOre, new ItemStack(ModItems.skeletonhorseBits, 3), 5.00F);
		GameRegistry.addSmelting(ModBlocks.zombiehorseOre, new ItemStack(ModItems.zombiehorseBits, 3), 5.00F);

		GameRegistry.addSmelting(ModItems.bushEgg, new ItemStack(ModItems.geneEgg), 3.50F);

	}
}
