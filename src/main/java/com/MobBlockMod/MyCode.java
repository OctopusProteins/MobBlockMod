package com.MobBlockMod;

//Recipes
import com.MobBlockMod.YourModsName;
import com.MobBlockMod.CreativeTabs.MobBlockModTab;
import com.MobBlockMod.MyBlocks.BatOre;
import com.MobBlockMod.MyBlocks.BlazeOre;
import com.MobBlockMod.MyBlocks.CaveSpiderOre;
import com.MobBlockMod.MyBlocks.ChickenOre;
import com.MobBlockMod.MyBlocks.CowOre;
import com.MobBlockMod.MyBlocks.CreeperOre;
import com.MobBlockMod.MyBlocks.EndermanOre;
import com.MobBlockMod.MyBlocks.GhastOre;
import com.MobBlockMod.MyBlocks.HorseOre;
import com.MobBlockMod.MyBlocks.MagmaCubeOre;
import com.MobBlockMod.MyBlocks.OcelotOre;
import com.MobBlockMod.MyBlocks.PigOre;
import com.MobBlockMod.MyBlocks.RabbitOre;
import com.MobBlockMod.MyBlocks.SheepOre;
import com.MobBlockMod.MyBlocks.SilverfishOre;
import com.MobBlockMod.MyBlocks.SkeletonOre;
import com.MobBlockMod.MyBlocks.SlimeOre;
import com.MobBlockMod.MyBlocks.SpiderOre;
import com.MobBlockMod.MyBlocks.SquidOre;
import com.MobBlockMod.MyBlocks.VillagerOre;
import com.MobBlockMod.MyBlocks.WitchOre;
import com.MobBlockMod.MyBlocks.WolfOre;
import com.MobBlockMod.MyBlocks.ZombieOre;
import com.MobBlockMod.MyBlocks.ZombiePigmenOre;
import com.MobBlockMod.MyItems.BatBits;
import com.MobBlockMod.MyItems.BlazeBits;
import com.MobBlockMod.MyItems.BushEgg;
import com.MobBlockMod.MyItems.BushMush;
import com.MobBlockMod.MyItems.CapMush;
import com.MobBlockMod.MyItems.CapSlice;
import com.MobBlockMod.MyItems.CaveSpiderBits;
import com.MobBlockMod.MyItems.ChickenBits;
import com.MobBlockMod.MyItems.CowBits;
import com.MobBlockMod.MyItems.CreeperBits;
import com.MobBlockMod.MyItems.EndermanBits;
import com.MobBlockMod.MyItems.GeneEgg;
import com.MobBlockMod.MyItems.GhastBits;
import com.MobBlockMod.MyItems.GrassShreds;
import com.MobBlockMod.MyItems.HorseBits;
import com.MobBlockMod.MyItems.MagmaCubeBits;
import com.MobBlockMod.MyItems.MooshroomBits;
import com.MobBlockMod.MyItems.MushroomCap;
import com.MobBlockMod.MyItems.MushroomCompound;
import com.MobBlockMod.MyItems.MushroomStem;
import com.MobBlockMod.MyItems.MushyPulp;
import com.MobBlockMod.MyItems.OcelotBits;
import com.MobBlockMod.MyItems.PigBits;
import com.MobBlockMod.MyItems.Pulp;
import com.MobBlockMod.MyItems.RabbitBits;
import com.MobBlockMod.MyItems.RefinedPulp;
import com.MobBlockMod.MyItems.SheepBits;
import com.MobBlockMod.MyItems.SilverfishBits;
import com.MobBlockMod.MyItems.SkeletonBits;
import com.MobBlockMod.MyItems.SlimeBits;
import com.MobBlockMod.MyItems.SpiderBits;
import com.MobBlockMod.MyItems.SquidBits;
import com.MobBlockMod.MyItems.StemMush;
import com.MobBlockMod.MyItems.StemSlice;
import com.MobBlockMod.MyItems.VillagerBits;
import com.MobBlockMod.MyItems.WitchBits;
import com.MobBlockMod.MyItems.WolfBits;
import com.MobBlockMod.MyItems.WoodPulp;
import com.MobBlockMod.MyItems.ZombieBits;
import com.MobBlockMod.MyItems.ZombiePigmenBits;
import com.MobBlockMod.Tree.ItemLeafBlocks;
import com.MobBlockMod.Tree.ItemLogBlocks;
import com.MobBlockMod.Tree.ItemSaplingBlock;
import com.MobBlockMod.Tree.MBMLeaf;
import com.MobBlockMod.Tree.MBMLog;
import com.MobBlockMod.Tree.MBMSapling;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
//Blocks
//MyBlocks
//import com.MobBlockMod.MyBlocks.HardDirtBlock;
//import com.MobBlockMod.MyBlocks.TestBlock;
//items
//import com.MobBlockMod.MyItems.Test1Item;
import cpw.mods.fml.common.registry.GameRegistry;


public class MyCode {
    
	//list blocks here #setupBlocks
	//public static Block hardDirt;
	//public static Block testBlock;
	public static Block chickenOre;
	public static Block cowOre;
	public static Block mooshroomOre;
	public static Block pigOre;
	public static Block sheepOre;
	public static Block creeperOre;
	public static Block zombieOre;
	public static Block skeletonOre;
	public static Block spiderOre;
	public static Block wolfOre;
	public static Block endermanOre;
	public static Block villagerOre;
	public static Block ocelotOre;
	public static Block horseOre;
	public static Block rabbitOre;
	public static Block zombiepigmenOre;
	public static Block blazeOre;
	public static Block witchOre;
	public static Block slimeOre;
	public static Block magmacubeOre;
	public static Block batOre;
	public static Block squidOre;
	public static Block cavespiderOre;
	public static Block ghastOre;
	public static Block silverfishOre;
	
	
	//Items
	//public static Item test1Item;
	public static Item chickenBits;
	public static Item cowBits;
	public static Item mooshroomBits;
	public static Item pigBits;
	public static Item sheepBits;
	public static Item creeperBits;
	public static Item zombieBits;
	public static Item skeletonBits;
	public static Item spiderBits;
	public static Item wolfBits;
	public static Item endermanBits;
	public static Item villagerBits;
	public static Item ocelotBits;
	public static Item horseBits;
	public static Item rabbitBits;
	public static Item zombiepigmenBits;
	public static Item blazeBits;
	public static Item witchBits;
	public static Item slimeBits;
	public static Item magmacubeBits;
	public static Item batBits;
	public static Item squidBits;
	public static Item cavespiderBits;
	public static Item ghastBits;
	public static Item silverfishBits;
	
	public static Item bushMush;
	public static Item grassShreds;
	public static Item bushEgg;
	public static Item geneEgg;
	public static Item woodPulp;
	public static Item refinedPulp;
	public static Item mushyPulp;
	public static Item pulp;
	
	public static Block blockLog;
	public static Block blockLeaf;
	public static Block blockSapling;
	
	public static Item mushroomCap;
	public static Item mushroomStem;
	public static Item capSlice;
	public static Item stemSlice;
	public static Item capMush;
	public static Item stemMush;
	public static Item mushroomCompound;
	
	public static final String modid = YourModsName.MODID;  
	
	public static CreativeTabs mobBlockModTab = new MobBlockModTab(CreativeTabs.getNextID(), "mobBlockModTab");
	
	
	public static void MyBlocks()
	  {
	    chickenOre = new ChickenOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("chickenOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "chickenstone");

	    cowOre = new CowOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("cowOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "cowstone");

	    mooshroomOre = new CowOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("mooshroomOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "mooshroomstone");

	    pigOre = new PigOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("pigOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "pigstone");

	    sheepOre = new SheepOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("sheepOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "sheepstone");

	    creeperOre = new CreeperOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("creeperOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "creeperstone");

	    zombieOre = new ZombieOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("zombieOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "zombiestone");

	    skeletonOre = new SkeletonOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("skeletonOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "skele-buttstone");

	    spiderOre = new SpiderOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("spiderOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "spiderstone");

	    wolfOre = new WolfOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("wolfOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "wolfstone");

	    endermanOre = new EndermanOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("endermanOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "endermanstone");

	    villagerOre = new VillagerOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("villagerOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "villagerstone");

	    ocelotOre = new OcelotOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("ocelotOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "ocelotstone");

	    horseOre = new HorseOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("horseOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "horsestone");

	    rabbitOre = new RabbitOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("rabbitOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "rabbitstone");

	    zombiepigmenOre = new ZombiePigmenOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("zombiepigmenOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "zombiepigmenstone");

	    blazeOre = new BlazeOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("blazeOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "blazestone");

	    witchOre = new WitchOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("witchOre")
	      .setCreativeTab(mobBlockModTab);

	    slimeOre = new SlimeOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("slimeOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "slimestone");

	    magmacubeOre = new MagmaCubeOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("magmacubeOre")
	      .setCreativeTab(mobBlockModTab);

	    batOre = new BatOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("batOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "batstone");

	    squidOre = new SquidOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("squidOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "squidstone");

	    cavespiderOre = new CaveSpiderOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("cavespiderOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "cavespiderstone");

	    ghastOre = new GhastOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("ghastOre")
	      .setCreativeTab(mobBlockModTab);

	    silverfishOre = new SilverfishOre(Material.ground)
	      .setHardness(1.8F)
	      .setStepSound(Block.soundTypeStone)
	      .setBlockName("silverfishOre")
	      .setCreativeTab(mobBlockModTab)
	      .setBlockTextureName(modid + ":" + "silverfishstone");

	    GameRegistry.registerBlock(chickenOre, "ChickenOre");
	    GameRegistry.registerBlock(cowOre, "CowOre");
	    GameRegistry.registerBlock(mooshroomOre, "MooshroomOre");
	    GameRegistry.registerBlock(pigOre, "PigOre");
	    GameRegistry.registerBlock(sheepOre, "SheepOre");
	    GameRegistry.registerBlock(creeperOre, "CreeperOre");
	    GameRegistry.registerBlock(zombieOre, "ZombieOre");
	    GameRegistry.registerBlock(skeletonOre, "SkeletonOre");
	    GameRegistry.registerBlock(spiderOre, "SpiderOre");
	    GameRegistry.registerBlock(wolfOre, "WolfOre");
	    GameRegistry.registerBlock(endermanOre, "EndermanOre");
	    GameRegistry.registerBlock(villagerOre, "VillagerOre");
	    GameRegistry.registerBlock(ocelotOre, "OcelotOre");
	    GameRegistry.registerBlock(horseOre, "HorseOre");
	    GameRegistry.registerBlock(rabbitOre, "RabbitOre");
	    GameRegistry.registerBlock(zombiepigmenOre, "ZombiePigmenOre");
	    GameRegistry.registerBlock(blazeOre, "BlazeOre");
	    GameRegistry.registerBlock(witchOre, "WitchOre");
	    GameRegistry.registerBlock(slimeOre, "SlimeOre");
	    GameRegistry.registerBlock(magmacubeOre, "MagmaCubeOre");
	    GameRegistry.registerBlock(batOre, "BatOre");
	    GameRegistry.registerBlock(squidOre, "SquidOre");
	    GameRegistry.registerBlock(cavespiderOre, "CaveSpiderOre");
	    GameRegistry.registerBlock(ghastOre, "GhastOre");
	    GameRegistry.registerBlock(silverfishOre, "SilverfishOre");
	    
	    blockLog = new MBMLog().setBlockName("Log");
	    blockLeaf = new MBMLeaf().setBlockName("Leaf");
	    blockSapling = new MBMSapling().setBlockName("Sapling").setCreativeTab(mobBlockModTab);
	    GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));
	    GameRegistry.registerBlock(blockSapling, ItemSaplingBlock.class, blockSapling.getUnlocalizedName().substring(5));
	    
	  }

	
	public static void MyRecipes(){ //method thats dealing the recipes 
		//creates 10 cocoa beans a sapling 
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 10, 3), new Object[] { new ItemStack(Blocks.sapling) });
		
		//creates 1 tnt blocks with one sapling block and one cobblestone block
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.tnt), new Object[] { new ItemStack(Blocks.sapling), new ItemStack(Blocks.cobblestone) });
		
		//creates diamond pickaxe with 1 bed and sponge
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_pickaxe ), new Object[] { new ItemStack(Items.bed), new ItemStack(Blocks.sponge) });
		
		//mi 1 shapeless
		//clownfish to wolf spawn egg
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 95), new Object[] { new ItemStack(Items.fish, 1, 2)});
		
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.red_mushroom), new Object[] { new ItemStack(Blocks.wool), new ItemStack(Blocks.wool, 2, 14)});
		
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot), new Object[] { new ItemStack(Items.bucket), new ItemStack(Blocks.cauldron)});
		//shaped
		//dirt(A) sand(B)
		
		//GameRegistry.addRecipe(new ItemStack(Blocks.gold_ore, 64), new Object[]{
			//"ABA", "B B", "ABA",
			//'A', Blocks.dirt,
			//'B', Blocks.sand
		//});
		
		//GameRegistry.addRecipe(new ItemStack(Blocks.diamond_ore, 64), new Object[]{
			//"AAA", "AAA", "AAA",
			//'A', Blocks.dirt,
		//});
		
		
		//GameRegistry.addRecipe(new ItemStack(Items.speckled_melon, 64), new Object[]{
			//"ABA", "BCB", "ABA",
			//'A', Blocks.dirt,
			//'B', Blocks.sand,
			//'C', Blocks.cobblestone
		//});
		
		//everybody did this :D
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(chickenOre), new Object[] { new ItemStack(Items.feather), new ItemStack(Items.feather) });
		GameRegistry.addShapelessRecipe(new ItemStack(cowOre), new Object[] { new ItemStack(Items.milk_bucket) });
		GameRegistry.addShapelessRecipe(new ItemStack(mooshroomOre), new Object[] { new ItemStack(Blocks.red_mushroom), new ItemStack(Blocks.red_mushroom) });
		GameRegistry.addShapelessRecipe(new ItemStack(pigOre), new Object[] { new ItemStack(Items.cooked_porkchop), new ItemStack(Items.cooked_porkchop) });
		GameRegistry.addShapelessRecipe(new ItemStack(sheepOre), new Object[] { new ItemStack(Blocks.wool), new ItemStack(Blocks.wool) });
		GameRegistry.addShapelessRecipe(new ItemStack(creeperOre), new Object[] { new ItemStack(Items.gunpowder), new ItemStack(Items.gunpowder) });
		GameRegistry.addShapelessRecipe(new ItemStack(zombieOre), new Object[] { new ItemStack(Items.rotten_flesh), new ItemStack(Items.rotten_flesh), new ItemStack(Items.rotten_flesh) });
		GameRegistry.addShapelessRecipe(new ItemStack(skeletonOre), new Object[] { new ItemStack(Items.arrow), new ItemStack(Items.arrow) });
		GameRegistry.addShapelessRecipe(new ItemStack(spiderOre), new Object[] { new ItemStack(Items.spider_eye) });
		GameRegistry.addShapelessRecipe(new ItemStack(wolfOre), new Object[] { new ItemStack(Items.bone), new ItemStack(Items.bone) });
		GameRegistry.addShapelessRecipe(new ItemStack(endermanOre), new Object[] { new ItemStack(Items.ender_pearl) });
		GameRegistry.addShapelessRecipe(new ItemStack(villagerOre), new Object[] { new ItemStack(Items.emerald) });
		GameRegistry.addShapelessRecipe(new ItemStack(ocelotOre), new Object[] { new ItemStack(Items.fish), new ItemStack(Items.fish) });
		GameRegistry.addShapelessRecipe(new ItemStack(horseOre), new Object[] { new ItemStack(Items.apple), new ItemStack(Items.apple) });
		GameRegistry.addShapelessRecipe(new ItemStack(rabbitOre), new Object[] { new ItemStack(Items.carrot) });
		GameRegistry.addShapelessRecipe(new ItemStack(zombiepigmenOre), new Object[] { new ItemStack(Items.rotten_flesh), new ItemStack(Items.rotten_flesh), new ItemStack(Items.gold_nugget) });
		GameRegistry.addShapelessRecipe(new ItemStack(blazeOre), new Object[] { new ItemStack(Items.blaze_rod) });
		GameRegistry.addShapelessRecipe(new ItemStack(witchOre), new Object[] { new ItemStack(Blocks.cauldron) });
		GameRegistry.addShapelessRecipe(new ItemStack(slimeOre), new Object[] { new ItemStack(Items.slime_ball), new ItemStack(Items.slime_ball) });
		GameRegistry.addShapelessRecipe(new ItemStack(magmacubeOre), new Object[] { new ItemStack(Items.magma_cream) });
		GameRegistry.addShapelessRecipe(new ItemStack(batOre), new Object[] { new ItemStack(Blocks.double_plant) });
		GameRegistry.addShapelessRecipe(new ItemStack(squidOre), new Object[] { new ItemStack(Items.dye), new ItemStack(Items.dye) });
		GameRegistry.addShapelessRecipe(new ItemStack(cavespiderOre), new Object[] { new ItemStack(Items.fermented_spider_eye) });
		GameRegistry.addShapelessRecipe(new ItemStack(ghastOre), new Object[] { new ItemStack(Items.ghast_tear) });
		GameRegistry.addShapelessRecipe(new ItemStack(silverfishOre), new Object[] { new ItemStack(Blocks.wool) });		
		*/
		GameRegistry.addShapelessRecipe(new ItemStack(bushMush), new Object[] { new ItemStack(grassShreds, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(woodPulp), new Object[] { new ItemStack(blockLog) });
		GameRegistry.addShapelessRecipe(new ItemStack(pulp), new Object[] { new ItemStack(mushyPulp) });
		GameRegistry.addShapelessRecipe(new ItemStack(capSlice, 2), new Object[] { new ItemStack(mushroomCap) });
		GameRegistry.addShapelessRecipe(new ItemStack(stemSlice, 3), new Object[] { new ItemStack(mushroomStem) });
		
		//credit goes to robotarrow for shaped crafting :)
		GameRegistry.addRecipe(new ItemStack(bushEgg), new Object[] {
			"BAB","DBE","CCC",
			'A', Items.egg,
			'B', bushMush,
			'C', refinedPulp,
			'D', capMush,
			'E', stemMush,
		});
		
		GameRegistry.addRecipe(new ItemStack(mushroomCompound), new Object[] {
			"AB ","BA ","   ",
			'A', Blocks.red_mushroom,
			'B', Blocks.brown_mushroom,
			
		});
		
		GameRegistry.addRecipe(new ItemStack(capMush), new Object[] {
			"AA ","AA ","   ",
			'A', capSlice,
		});
		
		GameRegistry.addRecipe(new ItemStack(stemMush), new Object[] {
			"AA ","AA ","   ",
			'A', stemSlice,
		});
		
		GameRegistry.addRecipe(new ItemStack(refinedPulp), new Object[] {
			"AA ","AA ","   ",
			'A', woodPulp,
		
		});
		
		GameRegistry.addRecipe(new ItemStack(blockSapling), new Object[] {
			" A ","AAA"," A ",
			'A', pulp,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 93), new Object[] {
			"AAA","ABA","AAA",
			'A', chickenBits,
			'B', geneEgg,
			
		});
	
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 92), new Object[] {
			"AAA","ABA","AAA",
			'A', cowBits,
			'B', geneEgg,
		});
						
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 96), new Object[] {
			"AAA","ABA","AAA",
			'A', mooshroomBits,
			'B', geneEgg,
			
		});
			
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 90), new Object[] {
			"AAA","ABA","AAA",
			'A', pigBits,
			'B', geneEgg,
		});
					
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 91), new Object[] {
			"AAA","ABA","AAA",
			'A', sheepBits,
			'B', geneEgg,
		});
					
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 50), new Object[] {
			"AAA","ABA","AAA",
			'A', creeperBits,
			'B', geneEgg,
		});
					
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 54), new Object[] {
			"AAA","ABA","AAA",
			'A', zombieBits,
			'B', geneEgg,
		});
						
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 51), new Object[] {
			"AAA","ABA","AAA",
			'A', skeletonBits,
			'B', geneEgg,
		});
						
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 52), new Object[] {
			"AAA","ABA","AAA",
			'A', spiderBits,
			'B', geneEgg,
		});
									
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 95), new Object[] {
			"AAA","ABA","AAA",
			'A', wolfBits,
			'B', geneEgg,
		});
					
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 58), new Object[] {
			"AAA","ABA","AAA",
			'A', endermanBits,
			'B', geneEgg,
		});
												
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 120), new Object[] {
			"AAA","ABA","AAA",
			'A', villagerBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 98), new Object[] {
			"AAA","ABA","AAA",
			'A', ocelotBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 100), new Object[] {
			"AAA","ABA","AAA",
			'A', horseBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 101), new Object[] {
			"AAA","ABA","AAA",
			'A', rabbitBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 57), new Object[] {
			"AAA","ABA","AAA",
			'A', zombiepigmenBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 61), new Object[] {
			"AAA","ABA","AAA",
			'A', blazeBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 66), new Object[] {
			"AAA","ABA","AAA",
			'A', witchBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 55), new Object[] {
			"AAA","ABA","AAA",
			'A', slimeBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62), new Object[] {
			"AAA","ABA","AAA",
			'A', batBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62), new Object[] {
			"AAA","ABA","AAA",
			'A', squidBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62), new Object[] {
			"AAA","ABA","AAA",
			'A', cavespiderBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62), new Object[] {
			"AAA","ABA","AAA",
			'A', ghastBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62), new Object[] {
			"AAA","ABA","AAA",
			'A', silverfishBits, 
			'B', geneEgg,
		});
		
		
		//GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(Blocks.red_mushroom, 2), 3.00F);
		
		//GameRegistry.addSmelting(Items.melon, new ItemStack(Items.rotten_flesh, 15), 1.00F);
		
		//GameRegistry.addSmelting(Blocks.diamond_block, new ItemStack(Blocks.dirt, 1), 500.00F);
		
		//credit to robotarrow for smelting :)
		
		GameRegistry.addSmelting(chickenOre, new ItemStack(chickenBits, 3), 5.00F);
		GameRegistry.addSmelting(cowOre, new ItemStack(cowBits, 3), 5.00F);
		GameRegistry.addSmelting(mooshroomOre, new ItemStack(mooshroomBits, 3), 5.00F);
		GameRegistry.addSmelting(wolfOre, new ItemStack(wolfBits, 3), 5.00F);
		GameRegistry.addSmelting(pigOre, new ItemStack(pigBits, 3), 5.00F);
		GameRegistry.addSmelting(sheepOre, new ItemStack(sheepBits, 3), 5.00F);
		GameRegistry.addSmelting(creeperOre, new ItemStack(creeperBits, 3), 5.00F);
		GameRegistry.addSmelting(zombieOre, new ItemStack(zombieBits, 3), 5.00F);
		GameRegistry.addSmelting(skeletonOre, new ItemStack(skeletonBits, 3), 5.00F);
		GameRegistry.addSmelting(spiderOre, new ItemStack(spiderBits, 3), 5.00F);
		GameRegistry.addSmelting(endermanOre, new ItemStack(endermanBits, 3), 5.00F);
		GameRegistry.addSmelting(villagerOre, new ItemStack(villagerBits, 3), 5.00F); 
		GameRegistry.addSmelting(ocelotOre, new ItemStack(ocelotBits, 3), 5.00F);
		GameRegistry.addSmelting(horseOre, new ItemStack(horseBits, 3), 5.00F);
		GameRegistry.addSmelting(rabbitOre, new ItemStack(rabbitBits, 3), 5.00F);
		GameRegistry.addSmelting(zombiepigmenOre, new ItemStack(zombiepigmenBits, 3), 5.00F);
		GameRegistry.addSmelting(blazeOre, new ItemStack(blazeBits, 3), 5.00F);
		GameRegistry.addSmelting(witchOre, new ItemStack(witchBits, 3), 5.00F);
		GameRegistry.addSmelting(slimeOre, new ItemStack(slimeBits, 3), 5.00F);
		GameRegistry.addSmelting(magmacubeOre, new ItemStack(magmacubeBits, 3), 5.00F);
		GameRegistry.addSmelting(batOre, new ItemStack(batBits, 3), 5.00F);
		GameRegistry.addSmelting(squidOre, new ItemStack(squidBits, 3), 5.00F);
		GameRegistry.addSmelting(cavespiderOre, new ItemStack(cavespiderBits, 3), 5.00F);
		GameRegistry.addSmelting(ghastOre, new ItemStack(ghastBits, 3), 5.00F);
		GameRegistry.addSmelting(silverfishOre, new ItemStack(silverfishBits, 3), 5.00F);
		GameRegistry.addSmelting(bushEgg, new ItemStack(geneEgg), 3.50F);
		
		//ItemStack dirtOfDoom = new ItemStack(Blocks.dirt, 1);
		//dirtOfDoom.addEnchantment(Enchantment.knockback, 127);
		//GameRegistry.addSmelting(Items.speckled_melon, dirtOfDoom, 0.00F);
		
	}
	public static void MyItems()
	  {
	    chickenBits = new ChickenBits();
	    chickenBits.setCreativeTab(mobBlockModTab);
	    chickenBits.setUnlocalizedName("chickenBits");
	    chickenBits.setTextureName(modid + ":" + "chickenbit");

	    cowBits = new CowBits();
	    cowBits.setCreativeTab(mobBlockModTab);
	    cowBits.setUnlocalizedName("cowBits");
	    cowBits.setTextureName(modid + ":" + "cowbits");

	    mooshroomBits = new MooshroomBits();
	    mooshroomBits.setCreativeTab(mobBlockModTab);
	    mooshroomBits.setUnlocalizedName("mooshroomBits");
	    mooshroomBits.setTextureName(modid + ":" + "mooshroombit");

	    pigBits = new PigBits();
	    pigBits.setCreativeTab(mobBlockModTab);
	    pigBits.setUnlocalizedName("pigBits");
	    pigBits.setTextureName(modid + ":" + "pigbit");

	    sheepBits = new SheepBits();
	    sheepBits.setCreativeTab(mobBlockModTab);
	    sheepBits.setUnlocalizedName("sheepBits");
	    sheepBits.setTextureName(modid + ":" + "sheepbit");

	    creeperBits = new CreeperBits();
	    creeperBits.setCreativeTab(mobBlockModTab);
	    creeperBits.setUnlocalizedName("creeperBits");
	    creeperBits.setTextureName(modid + ":" + "creeperbit");

	    zombieBits = new ZombieBits();
	    zombieBits.setCreativeTab(mobBlockModTab);
	    zombieBits.setUnlocalizedName("zombieBits");
	    zombieBits.setTextureName(modid + ":" + "zombiebit");

	    skeletonBits = new SkeletonBits();
	    skeletonBits.setCreativeTab(mobBlockModTab);
	    skeletonBits.setUnlocalizedName("skeletonBits");
	    skeletonBits.setTextureName(modid + ":" + "skelebuttbit");

	    spiderBits = new SpiderBits();
	    spiderBits.setCreativeTab(mobBlockModTab);
	    spiderBits.setUnlocalizedName("spiderBits");
	    spiderBits.setTextureName(modid + ":" + "spiderbit");

	    wolfBits = new WolfBits();
	    wolfBits.setCreativeTab(mobBlockModTab);
	    wolfBits.setUnlocalizedName("wolfBits");
	    wolfBits.setTextureName(modid + ":" + "wolfbit");

	    endermanBits = new EndermanBits();
	    endermanBits.setCreativeTab(mobBlockModTab);
	    endermanBits.setUnlocalizedName("endermanBits");
	    endermanBits.setTextureName(modid + ":" + "endermanbit");

	    villagerBits = new VillagerBits();
	    villagerBits.setCreativeTab(mobBlockModTab);
	    villagerBits.setUnlocalizedName("villagerBits");
	    villagerBits.setTextureName(modid + ":" + "villagerbit");

	    ocelotBits = new OcelotBits();
	    ocelotBits.setCreativeTab(mobBlockModTab);
	    ocelotBits.setUnlocalizedName("ocelotBits");
	    ocelotBits.setTextureName(modid + ":" + "ocelotbit");

	    horseBits = new HorseBits();
	    horseBits.setCreativeTab(mobBlockModTab);
	    horseBits.setUnlocalizedName("horseBits");
	    horseBits.setTextureName(modid + ":" + "horsebit");

	    rabbitBits = new RabbitBits();
	    rabbitBits.setCreativeTab(mobBlockModTab);
	    rabbitBits.setUnlocalizedName("rabbitBits");
	    rabbitBits.setTextureName(modid + ":" + "rabbitbit");

	    zombiepigmenBits = new ZombiePigmenBits();
	    zombiepigmenBits.setCreativeTab(mobBlockModTab);
	    zombiepigmenBits.setUnlocalizedName("zombiepigmenBits");
	    zombiepigmenBits.setTextureName(modid + ":" + "zombiepigmenbit");

	    blazeBits = new BlazeBits();
	    blazeBits.setCreativeTab(mobBlockModTab);
	    blazeBits.setUnlocalizedName("blazeBits");
	    blazeBits.setTextureName(modid + ":" + "blazebit");

	    witchBits = new WitchBits();
	    witchBits.setCreativeTab(mobBlockModTab);
	    witchBits.setUnlocalizedName("witchBits");
	    witchBits.setTextureName(modid + ":" + "witchbit");

	    slimeBits = new SlimeBits();
	    slimeBits.setCreativeTab(mobBlockModTab);
	    slimeBits.setUnlocalizedName("slimeBits");
	    slimeBits.setTextureName(modid + ":" + "slimebit");
	    
	    magmacubeBits = new MagmaCubeBits();
	    magmacubeBits.setCreativeTab(mobBlockModTab);
	    magmacubeBits.setUnlocalizedName("magmacubeBits");
	    magmacubeBits.setTextureName(modid + ":" + "magmacubebit");

	    batBits = new BatBits();
	    batBits.setCreativeTab(mobBlockModTab);
	    batBits.setUnlocalizedName("batBits");
	    batBits.setTextureName(modid + ":" + "batbit");

	    squidBits = new SquidBits();
	    squidBits.setCreativeTab(mobBlockModTab);
	    squidBits.setUnlocalizedName("squidBits");
	    squidBits.setTextureName(modid + ":" + "squidbit");

	    cavespiderBits = new CaveSpiderBits();
	    cavespiderBits.setCreativeTab(mobBlockModTab);
	    cavespiderBits.setUnlocalizedName("cavespiderBits");
	    cavespiderBits.setTextureName(modid + ":" + "cavespiderbit");

	    ghastBits = new GhastBits();
	    ghastBits.setCreativeTab(mobBlockModTab);
	    ghastBits.setUnlocalizedName("ghastBits");
	    ghastBits.setTextureName(modid + ":" + "ghastbit");

	    silverfishBits = new SilverfishBits();
	    silverfishBits.setCreativeTab(mobBlockModTab);
	    silverfishBits.setUnlocalizedName("silverfishBits");
	    silverfishBits.setTextureName(modid + ":" + "silverfishbit");

	    GameRegistry.registerItem(chickenBits, "ChickenBits");
	    GameRegistry.registerItem(cowBits, "CowBits");
	    GameRegistry.registerItem(mooshroomBits, "MooshroomBits");
	    GameRegistry.registerItem(pigBits, "PigBits");
	    GameRegistry.registerItem(sheepBits, "SheepBits");
	    GameRegistry.registerItem(creeperBits, "CreeperBits");
	    GameRegistry.registerItem(zombieBits, "ZombieBits");
	    GameRegistry.registerItem(skeletonBits, "SkeletonBits");
	    GameRegistry.registerItem(spiderBits, "SpiderBits");
	    GameRegistry.registerItem(wolfBits, "WolfBits");
	    GameRegistry.registerItem(endermanBits, "EndermanBits");
	    GameRegistry.registerItem(villagerBits, "VillagerBits");
	    GameRegistry.registerItem(ocelotBits, "OcelotBits");
	    GameRegistry.registerItem(horseBits, "HorseBits");
	    GameRegistry.registerItem(rabbitBits, "RabbitBits");
	    GameRegistry.registerItem(zombiepigmenBits, "ZombiePigmenBits");
	    GameRegistry.registerItem(blazeBits, "BlazeBits");
	    GameRegistry.registerItem(witchBits, "WitchBits");
	    GameRegistry.registerItem(slimeBits, "SlimeBits");
	    GameRegistry.registerItem(magmacubeBits, "MagmaCubeBits");
	    GameRegistry.registerItem(batBits, "BatBits");
	    GameRegistry.registerItem(squidBits, "SquidBits");
	    GameRegistry.registerItem(cavespiderBits, "CaveSpiderBits");
	    GameRegistry.registerItem(ghastBits, "GhastBits");
	    GameRegistry.registerItem(silverfishBits, "SilverfishBits");
	    
	    bushMush = new BushMush();
	    bushMush.setCreativeTab(mobBlockModTab);
	    bushMush.setUnlocalizedName("bushMush");
	    bushMush.setTextureName(modid + ":" + "bushmush");
	    
	    grassShreds = new GrassShreds();
	    grassShreds.setCreativeTab(mobBlockModTab);
	    grassShreds.setUnlocalizedName("grassShreds");
	    grassShreds.setTextureName(modid + ":" + "grassshreds");
	    
	    bushEgg = new BushEgg();
	    bushEgg.setCreativeTab(mobBlockModTab);
	    bushEgg.setUnlocalizedName("bushEgg");
	    bushEgg.setTextureName(modid + ":" + "bushegg");
	    
	    geneEgg = new GeneEgg();
	    geneEgg.setCreativeTab(mobBlockModTab);
	    geneEgg.setUnlocalizedName("geneEgg");
	    geneEgg.setTextureName(modid + ":" + "geneegg");
	    
	    woodPulp = new WoodPulp();
	    woodPulp.setCreativeTab(mobBlockModTab);
	    woodPulp.setUnlocalizedName("woodpulp");
	    woodPulp.setTextureName(modid + ":" + "woodpulp");
	    
	    refinedPulp = new RefinedPulp();
	    refinedPulp.setCreativeTab(mobBlockModTab);
	    refinedPulp.setUnlocalizedName("refinedpulp");
	    refinedPulp.setTextureName(modid + ":" + "refinedpulp");
	    
	    mushyPulp = new MushyPulp();
	    mushyPulp.setCreativeTab(mobBlockModTab);
	    mushyPulp.setUnlocalizedName("mushypulp");
	    mushyPulp.setTextureName(modid + ":" + "mushypulp");
	    
	    pulp = new Pulp();
	    pulp.setCreativeTab(mobBlockModTab);
	    pulp.setUnlocalizedName("pulp");
	    pulp.setTextureName(modid + ":" + "pulp");
	    
	    mushroomCap = new MushroomCap();
	    mushroomCap.setCreativeTab(mobBlockModTab);
	    mushroomCap.setUnlocalizedName("mushroomcap");
	    mushroomCap.setTextureName(modid + ":mushroomcap");
	    
	    mushroomStem = new MushroomStem();
	    mushroomStem.setCreativeTab(mobBlockModTab);
	    mushroomStem.setUnlocalizedName("mushroomstem");
	    mushroomStem.setTextureName(modid + ":mushroomstem");
	    
	    capSlice = new CapSlice();
	    capSlice.setCreativeTab(mobBlockModTab);
	    capSlice.setUnlocalizedName("capslice");
	    capSlice.setTextureName(modid + ":capslice");
	    
	    stemSlice = new StemSlice();
	    stemSlice.setCreativeTab(mobBlockModTab);
	    stemSlice.setUnlocalizedName("stemslice");
	    stemSlice.setTextureName(modid + ":stemslice");
	    
	    capMush = new CapMush();
	    capMush.setCreativeTab(mobBlockModTab);
	    capMush.setUnlocalizedName("capmush");
	    capMush.setTextureName(modid + ":capmush");
	    
	    stemMush = new StemMush();
	    stemMush.setCreativeTab(mobBlockModTab);
	    stemMush.setUnlocalizedName("stemmush");
	    stemMush.setTextureName(modid + ":stemmush");
	    
	    mushroomCompound = new MushroomCompound();
	    mushroomCompound.setCreativeTab(mobBlockModTab);
	    mushroomCompound.setUnlocalizedName("mushroomcompound");
	    mushroomCompound.setTextureName(modid + ":mushroomcompound");
	    
	    MinecraftForge.addGrassSeed(new ItemStack(grassShreds), 7);
	    MinecraftForge.addGrassSeed(new ItemStack(mushyPulp), 6);
	    GameRegistry.registerItem(bushMush, "BushMush");
	    GameRegistry.registerItem(grassShreds, "GrassShreds");
	    GameRegistry.registerItem(bushEgg, "BushEgg");
	    GameRegistry.registerItem(geneEgg, "GeneEgg");
	    GameRegistry.registerItem(woodPulp, "WoodPulp");
	    GameRegistry.registerItem(refinedPulp, "RefinedPulp");
	    GameRegistry.registerItem(mushyPulp, "MushyPulp");
	    GameRegistry.registerItem(pulp, "Pulp");
	    GameRegistry.registerItem(mushroomStem, "MushroomStem");
	    GameRegistry.registerItem(mushroomCap, "MushroomCap");
	    GameRegistry.registerItem(stemSlice, "StemSlice");
	    GameRegistry.registerItem(capSlice, "CapSlice");
	    GameRegistry.registerItem(stemMush, "StemMush");
	    GameRegistry.registerItem(capMush, "CapMush");
	    GameRegistry.registerItem(mushroomCompound, "MushroomCompound");
	  }
	
	

}

