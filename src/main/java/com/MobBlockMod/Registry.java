package com.MobBlockMod;

import com.MobBlockMod.CreativeTabs.MobBlockModTab;
import com.MobBlockMod.MyBlocks.*;
import com.MobBlockMod.MyItems.*;
import com.MobBlockMod.Tree.*;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registry {
	
	public static final String modid = MobBlockMod.MODID;
	public static final CreativeTabs mobBlockModTab = new MobBlockModTab(CreativeTabs.getNextID(), "mobBlockModTab");
	
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
	
	public static Block dwarfLog;
	public static Block dwarfLeaf;
	public static Block dwarfSapling;
	
	public static Block tabBlock;
	
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
	
	public static Item mushroomCap;
	public static Item mushroomStem;
	public static Item capSlice;
	public static Item stemSlice;
	public static Item capMush;
	public static Item stemMush;
	public static Item mushroomCompound;
	
	public static void MyBlocks()
	  {
	    chickenOre = new ChickenOre();
	    cowOre = new CowOre();	      
	    mooshroomOre = new MooshroomOre();	      
	    pigOre = new PigOre();	     
	    sheepOre = new SheepOre();	    
	    creeperOre = new CreeperOre();	     
	    zombieOre = new ZombieOre();	     
	    skeletonOre = new SkeletonOre();	   
	    spiderOre = new SpiderOre();	     
	    wolfOre = new WolfOre();	      
	    endermanOre = new EndermanOre();	      
	    villagerOre = new VillagerOre();	    
	    ocelotOre = new OcelotOre();	     
	    horseOre = new HorseOre();	     
	    rabbitOre = new RabbitOre();	    
	    zombiepigmenOre = new ZombiePigmenOre();	    
	    blazeOre = new BlazeOre();	     
	    witchOre = new WitchOre();	     
	    slimeOre = new SlimeOre();	      
	    magmacubeOre = new MagmaCubeOre();	      
	    batOre = new BatOre();	    
	    squidOre = new SquidOre();	     
	    cavespiderOre = new CaveSpiderOre();
	    ghastOre = new GhastOre();	    
	    silverfishOre = new SilverfishOre();
	    
	    dwarfLog = new DwarfLog();
	    dwarfLeaf = new DwarfLeaf();
	    dwarfSapling = new DwarfSapling();
	    
	    tabBlock = new TabBlock();
	}
	
	public static void renderBlockItem()
	{
		ItemModelMesher renderItem = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		
		renderItem.register(Item.getItemFromBlock(batOre), 0, new ModelResourceLocation(modid + ":" + ((BatOre) batOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(blazeOre), 0, new ModelResourceLocation(modid + ":" + ((BlazeOre) blazeOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(cavespiderOre), 0, new ModelResourceLocation(modid + ":" + ((CaveSpiderOre) cavespiderOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(chickenOre), 0, new ModelResourceLocation(modid + ":" + ((ChickenOre) chickenOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(cowOre), 0, new ModelResourceLocation(modid + ":" + ((CowOre) cowOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(creeperOre), 0, new ModelResourceLocation(modid + ":" + ((CreeperOre) creeperOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(endermanOre), 0, new ModelResourceLocation(modid + ":" + ((EndermanOre) endermanOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(ghastOre), 0, new ModelResourceLocation(modid + ":" + ((GhastOre) ghastOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(horseOre), 0, new ModelResourceLocation(modid + ":" + ((HorseOre) horseOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(magmacubeOre), 0, new ModelResourceLocation(modid + ":" + ((MagmaCubeOre) magmacubeOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(mooshroomOre), 0, new ModelResourceLocation(modid + ":" + ((MooshroomOre) mooshroomOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(ocelotOre), 0, new ModelResourceLocation(modid + ":" + ((OcelotOre) ocelotOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(pigOre), 0, new ModelResourceLocation(modid + ":" + ((PigOre) pigOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(rabbitOre), 0, new ModelResourceLocation(modid + ":" + ((RabbitOre) rabbitOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(sheepOre), 0, new ModelResourceLocation(modid + ":" + ((SheepOre) sheepOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(silverfishOre), 0, new ModelResourceLocation(modid + ":" + ((SilverfishOre) silverfishOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(skeletonOre), 0, new ModelResourceLocation(modid + ":" + ((SkeletonOre) skeletonOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(slimeOre), 0, new ModelResourceLocation(modid + ":" + ((SlimeOre) slimeOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(spiderOre), 0, new ModelResourceLocation(modid + ":" + ((SpiderOre) spiderOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(squidOre), 0, new ModelResourceLocation(modid + ":" + ((SquidOre) squidOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(villagerOre), 0, new ModelResourceLocation(modid + ":" + ((VillagerOre) villagerOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(witchOre), 0, new ModelResourceLocation(modid + ":" + ((WitchOre) witchOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(wolfOre), 0, new ModelResourceLocation(modid + ":" + ((WolfOre) wolfOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(zombieOre), 0, new ModelResourceLocation(modid + ":" + ((ZombieOre) zombieOre).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(zombiepigmenOre), 0, new ModelResourceLocation(modid + ":" + ((ZombiePigmenOre) zombiepigmenOre).getName(), "inventory"));
		
		renderItem.register(Item.getItemFromBlock(dwarfLog), 0, new ModelResourceLocation(modid + ":" + ((DwarfLog) dwarfLog).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(dwarfLeaf), 0, new ModelResourceLocation(modid + ":" + ((DwarfLeaf) dwarfLeaf).getName(), "inventory"));
		renderItem.register(Item.getItemFromBlock(dwarfSapling), 0, new ModelResourceLocation(modid + ":" + ((DwarfSapling) dwarfSapling).getName(), "inventory"));
		
		renderItem.register(Item.getItemFromBlock(tabBlock), 0, new ModelResourceLocation(modid + ":" + ((TabBlock) tabBlock).getName(), "inventory"));
	}
	
public static void MyRecipes(){ //method thats dealing the recipes 
	
	//shapeless
		
	GameRegistry.addShapelessRecipe(new ItemStack(bushMush), new ItemStack(grassShreds, 2));
	GameRegistry.addShapelessRecipe(new ItemStack(pulp), new ItemStack(mushyPulp));
	GameRegistry.addShapelessRecipe(new ItemStack(woodPulp), new ItemStack(dwarfLog));
	GameRegistry.addShapelessRecipe(new ItemStack(refinedPulp), new ItemStack(woodPulp, 3));
	GameRegistry.addShapelessRecipe(new ItemStack(capSlice, 2), new ItemStack(mushroomCap));
	GameRegistry.addShapelessRecipe(new ItemStack(stemSlice, 2), new ItemStack(mushroomStem));
	
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
		
		GameRegistry.addRecipe(new ItemStack(dwarfSapling), new Object[] {
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
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 65), new Object[] {
			"AAA","ABA","AAA",
			'A', batBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 94), new Object[] {
			"AAA","ABA","AAA",
			'A', squidBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 59), new Object[] {
			"AAA","ABA","AAA",
			'A', cavespiderBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 56), new Object[] {
			"AAA","ABA","AAA",
			'A', ghastBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 60), new Object[] {
			"AAA","ABA","AAA",
			'A', silverfishBits, 
			'B', geneEgg,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62), new Object[] {
				"AAA","ABA","AAA",
				'A', magmacubeBits, 
				'B', geneEgg,
			});
		
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
		
	}

public static void MyItems()
{
  
  chickenBits = new ChickenBits();
  cowBits = new CowBits();
  mooshroomBits = new MooshroomBits();
  pigBits = new PigBits();
  sheepBits = new SheepBits();
  creeperBits = new CreeperBits();
  zombieBits = new ZombieBits();
  skeletonBits = new SkeletonBits();
  spiderBits = new SpiderBits();
  wolfBits = new WolfBits();
  endermanBits = new EndermanBits();
  villagerBits = new VillagerBits();
  ocelotBits = new OcelotBits();
  horseBits = new HorseBits();
  rabbitBits = new RabbitBits();
  zombiepigmenBits = new ZombiePigmenBits();
  blazeBits = new BlazeBits();	    
  witchBits = new WitchBits();
  slimeBits = new SlimeBits();	    
  magmacubeBits = new MagmaCubeBits();	  
  batBits = new BatBits();	   
  squidBits = new SquidBits();
  cavespiderBits = new CaveSpiderBits();
  ghastBits = new GhastBits();
  silverfishBits = new SilverfishBits();
 
  bushMush = new BushMush();
 
  grassShreds = new GrassShreds(); 
 
  bushEgg = new BushEgg();
  geneEgg = new GeneEgg();	    
  woodPulp = new WoodPulp();	   
  refinedPulp = new RefinedPulp();
 	   
  mushyPulp = new MushyPulp();	
  
  pulp = new Pulp();	    
  mushroomCap = new MushroomCap();
  mushroomStem = new MushroomStem();	    
  capSlice = new CapSlice();
  stemSlice = new StemSlice();
  capMush = new CapMush();	   
  stemMush = new StemMush();
  mushroomCompound = new MushroomCompound();
  
  
  MinecraftForge.addGrassSeed(new ItemStack(grassShreds), 7);
  MinecraftForge.addGrassSeed(new ItemStack(mushyPulp), 6);
 
}
public static void renderItems()
{
	ItemModelMesher renderItem = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
	renderItem.register(batBits, 0, new ModelResourceLocation(modid + ":" + ((BatBits) batBits).getName(), "inventory"));
	renderItem.register(blazeBits, 0, new ModelResourceLocation(modid + ":" + ((BlazeBits) blazeBits).getName(), "inventory"));
	renderItem.register(bushEgg, 0, new ModelResourceLocation(modid + ":" + ((BushEgg) bushEgg).getName(), "inventory"));
	renderItem.register(bushMush, 0, new ModelResourceLocation(modid + ":" + ((BushMush) bushMush).getName(), "inventory"));
	renderItem.register(capMush, 0, new ModelResourceLocation(modid + ":" + ((CapMush) capMush).getName(), "inventory"));
	renderItem.register(capSlice, 0, new ModelResourceLocation(modid + ":" + ((CapSlice) capSlice).getName(), "inventory"));
	renderItem.register(cavespiderBits, 0, new ModelResourceLocation(modid + ":" + ((CaveSpiderBits) cavespiderBits).getName(), "inventory"));
	renderItem.register(chickenBits, 0, new ModelResourceLocation(modid + ":" + ((ChickenBits) chickenBits).getName(), "inventory"));
	renderItem.register(cowBits, 0, new ModelResourceLocation(modid + ":" + ((CowBits) cowBits).getName(), "inventory"));
	renderItem.register(creeperBits, 0, new ModelResourceLocation(modid + ":" + ((CreeperBits) creeperBits).getName(), "inventory"));
	renderItem.register(endermanBits, 0, new ModelResourceLocation(modid + ":" + ((EndermanBits) endermanBits).getName(), "inventory"));
	renderItem.register(geneEgg, 0, new ModelResourceLocation(modid + ":" + ((GeneEgg) geneEgg).getName(), "inventory"));
	renderItem.register(ghastBits, 0, new ModelResourceLocation(modid + ":" + ((GhastBits) ghastBits).getName(), "inventory"));
	renderItem.register(grassShreds, 0, new ModelResourceLocation(modid + ":" + ((GrassShreds) grassShreds).getName(), "inventory"));
	renderItem.register(horseBits, 0, new ModelResourceLocation(modid + ":" + ((HorseBits) horseBits).getName(), "inventory"));
	renderItem.register(magmacubeBits, 0, new ModelResourceLocation(modid + ":" + ((MagmaCubeBits) magmacubeBits).getName(), "inventory"));
	renderItem.register(mooshroomBits, 0, new ModelResourceLocation(modid + ":" + ((MooshroomBits) mooshroomBits).getName(), "inventory"));
	renderItem.register(mushroomCap, 0, new ModelResourceLocation(modid + ":" + ((MushroomCap) mushroomCap).getName(), "inventory"));
	renderItem.register(mushroomCompound, 0, new ModelResourceLocation(modid + ":" + ((MushroomCompound) mushroomCompound).getName(), "inventory"));
	renderItem.register(mushroomStem, 0, new ModelResourceLocation(modid + ":" + ((MushroomStem) mushroomStem).getName(), "inventory"));
	renderItem.register(mushyPulp, 0, new ModelResourceLocation(modid + ":" + ((MushyPulp) mushyPulp).getName(), "inventory"));
	renderItem.register(ocelotBits, 0, new ModelResourceLocation(modid + ":" + ((OcelotBits) ocelotBits).getName(), "inventory"));
	renderItem.register(pigBits, 0, new ModelResourceLocation(modid + ":" + ((PigBits) pigBits).getName(), "inventory"));
	renderItem.register(pulp, 0, new ModelResourceLocation(modid + ":" + ((Pulp) pulp).getName(), "inventory"));
	renderItem.register(rabbitBits, 0, new ModelResourceLocation(modid + ":" + ((RabbitBits) rabbitBits).getName(), "inventory"));
	renderItem.register(refinedPulp, 0, new ModelResourceLocation(modid + ":" + ((RefinedPulp) refinedPulp).getName(), "inventory"));
	renderItem.register(sheepBits, 0, new ModelResourceLocation(modid + ":" + ((SheepBits) sheepBits).getName(), "inventory"));
	renderItem.register(silverfishBits, 0, new ModelResourceLocation(modid + ":" + ((SilverfishBits) silverfishBits).getName(), "inventory"));
	renderItem.register(skeletonBits, 0, new ModelResourceLocation(modid + ":" + ((SkeletonBits) skeletonBits).getName(), "inventory"));
	renderItem.register(slimeBits, 0, new ModelResourceLocation(modid + ":" + ((SlimeBits) slimeBits).getName(), "inventory"));
	renderItem.register(spiderBits, 0, new ModelResourceLocation(modid + ":" + ((SpiderBits) spiderBits).getName(), "inventory"));
	renderItem.register(squidBits, 0, new ModelResourceLocation(modid + ":" + ((SquidBits) squidBits).getName(), "inventory"));
	renderItem.register(stemMush, 0, new ModelResourceLocation(modid + ":" + ((StemMush) stemMush).getName(), "inventory"));
	renderItem.register(stemSlice, 0, new ModelResourceLocation(modid + ":" + ((StemSlice) stemSlice).getName(), "inventory"));
	renderItem.register(villagerBits, 0, new ModelResourceLocation(modid + ":" + ((VillagerBits) villagerBits).getName(), "inventory"));
	renderItem.register(witchBits, 0, new ModelResourceLocation(modid + ":" + ((WitchBits) witchBits).getName(), "inventory"));
	renderItem.register(wolfBits, 0, new ModelResourceLocation(modid + ":" + ((WolfBits) wolfBits).getName(), "inventory"));
	renderItem.register(woodPulp, 0, new ModelResourceLocation(modid + ":" + ((WoodPulp) woodPulp).getName(), "inventory"));
	renderItem.register(zombieBits, 0, new ModelResourceLocation(modid + ":" + ((ZombieBits) zombieBits).getName(), "inventory"));
	renderItem.register(zombiepigmenBits, 0, new ModelResourceLocation(modid + ":" + ((ZombiePigmenBits) zombiepigmenBits).getName(), "inventory"));
}


}
