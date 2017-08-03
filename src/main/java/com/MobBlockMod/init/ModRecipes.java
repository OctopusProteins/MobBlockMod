package com.MobBlockMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModRecipes {
	
	public static void registerRecipes() {// method thats dealing the recipes

		// shapeless

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bushMush), new ItemStack(ModItems.grassShreds, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pulp), new ItemStack(ModItems.mushyPulp));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodPulp), new ItemStack(ModBlocks.dwarfLog));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.refinedPulp), new ItemStack(ModItems.woodPulp, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.capSlice, 2), new ItemStack(ModItems.mushroomCap));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stemSlice, 2), new ItemStack(ModItems.mushroomStem));

		GameRegistry.addRecipe(new ItemStack(ModItems.bushEgg), new Object[] { "BAB", "DBE", "CCC", 'A', Items.EGG, 'B',
				ModItems.bushMush, 'C', ModItems.refinedPulp, 'D', ModItems.capMush, 'E', ModItems.stemMush, });

		GameRegistry.addRecipe(new ItemStack(ModItems.mushroomCompound),
				new Object[] { "AB ", "BA ", "   ", 'A', Blocks.RED_MUSHROOM, 'B', Blocks.BROWN_MUSHROOM,

				});

		GameRegistry.addRecipe(new ItemStack(ModItems.capMush), new Object[] { "AA ", "AA ", "   ", 'A', ModItems.capSlice, });

		GameRegistry.addRecipe(new ItemStack(ModItems.stemMush), new Object[] { "AA ", "AA ", "   ", 'A', ModItems.stemSlice, });

		GameRegistry.addRecipe(new ItemStack(ModItems.refinedPulp), new Object[] { "AA ", "AA ", "   ", 'A', ModItems.woodPulp,

		});

		GameRegistry.addRecipe(new ItemStack(ModBlocks.dwarfSapling), new Object[] { " A ", "AAA", " A ", 'A', ModItems.pulp, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 93),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.chickenBits, 'B', ModItems.geneEgg,

				});

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 92),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.cowBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 96),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.mooshroomBits, 'B', ModItems.geneEgg,

				});

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 90),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.pigBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 91),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.sheepBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 50),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.creeperBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 54),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.zombieBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 51),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.skeletonBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 52),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.spiderBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 95),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.wolfBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 58),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.endermanBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 120),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.villagerBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 98),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.ocelotBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 100),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.horseBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 101),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.rabbitBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 57),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.zombiepigmenBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 61),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.blazeBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 66),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.witchBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 55),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.slimeBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 65),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.batBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 94),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.squidBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 59),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.cavespiderBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 56),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.ghastBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 60),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.silverfishBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 62),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.magmacubeBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 67),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.endermiteBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 68),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.guardianBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 69),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.shulkerBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 102),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.polarbearBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 4),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.elderguardianBits, 'B', ModItems.geneEgg, });

		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 5),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.witherskeletonBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 23),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.huskBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 6),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.strayBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 32),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.muleBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 31),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.donkeyBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 28),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.skeletonhorseBits, 'B', ModItems.geneEgg, });
		GameRegistry.addRecipe(new ItemStack(Items.SPAWN_EGG, 1, 29),
				new Object[] { "AAA", "ABA", "AAA", 'A', ModItems.zombiehorseBits, 'B', ModItems.geneEgg, });

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
