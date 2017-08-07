package com.MobBlockMod.init;

import com.MobBlockMod.blocks.BatOre;
import com.MobBlockMod.blocks.BlazeOre;
import com.MobBlockMod.blocks.CaveSpiderOre;
import com.MobBlockMod.blocks.ChickenOre;
import com.MobBlockMod.blocks.CowOre;
import com.MobBlockMod.blocks.CreeperOre;
import com.MobBlockMod.blocks.DonkeyOre;
import com.MobBlockMod.blocks.ElderGuardianOre;
import com.MobBlockMod.blocks.EndermanOre;
import com.MobBlockMod.blocks.EndermiteOre;
import com.MobBlockMod.blocks.EvokerOre;
import com.MobBlockMod.blocks.GhastOre;
import com.MobBlockMod.blocks.GuardianOre;
import com.MobBlockMod.blocks.HorseOre;
import com.MobBlockMod.blocks.HuskOre;
import com.MobBlockMod.blocks.LlamaOre;
import com.MobBlockMod.blocks.MagmaCubeOre;
import com.MobBlockMod.blocks.MooshroomOre;
import com.MobBlockMod.blocks.MuleOre;
import com.MobBlockMod.blocks.OcelotOre;
import com.MobBlockMod.blocks.ParrotOre;
import com.MobBlockMod.blocks.PigOre;
import com.MobBlockMod.blocks.PolarBearOre;
import com.MobBlockMod.blocks.RabbitOre;
import com.MobBlockMod.blocks.SheepOre;
import com.MobBlockMod.blocks.ShulkerOre;
import com.MobBlockMod.blocks.SilverfishOre;
import com.MobBlockMod.blocks.SkeletonHorseOre;
import com.MobBlockMod.blocks.SkeletonOre;
import com.MobBlockMod.blocks.SlimeOre;
import com.MobBlockMod.blocks.SpiderOre;
import com.MobBlockMod.blocks.SquidOre;
import com.MobBlockMod.blocks.StrayOre;
import com.MobBlockMod.blocks.TabBlock;
import com.MobBlockMod.blocks.VexOre;
import com.MobBlockMod.blocks.VillagerOre;
import com.MobBlockMod.blocks.VindicatorOre;
import com.MobBlockMod.blocks.WitchOre;
import com.MobBlockMod.blocks.WitherSkeletonOre;
import com.MobBlockMod.blocks.WolfOre;
import com.MobBlockMod.blocks.ZombieHorseOre;
import com.MobBlockMod.blocks.ZombieOre;
import com.MobBlockMod.blocks.ZombiePigmenOre;
import com.MobBlockMod.blocks.ZombieVillagerOre;
import com.MobBlockMod.tree.DwarfLeaf;
import com.MobBlockMod.tree.DwarfLog;
import com.MobBlockMod.tree.DwarfSapling;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class ModBlocks
{
	public static final Block chickenOre = new ChickenOre();
	public static final Block cowOre = new CowOre();
	public static final Block mooshroomOre = new MooshroomOre();
	public static final Block pigOre = new PigOre();
	public static final Block sheepOre = new SheepOre();
	public static final Block creeperOre = new CreeperOre();
	public static final Block zombieOre = new ZombieOre();
	public static final Block skeletonOre = new SkeletonOre();
	public static final Block spiderOre = new SpiderOre();
	public static final Block wolfOre = new WolfOre();
	public static final Block endermanOre = new EndermanOre();
	public static final Block villagerOre = new VillagerOre();
	public static final Block ocelotOre = new OcelotOre();
	public static final Block horseOre = new HorseOre();
	public static final Block rabbitOre = new RabbitOre();
	public static final Block zombiepigmenOre = new ZombiePigmenOre();
	public static final Block blazeOre = new BlazeOre();
	public static final Block witchOre = new WitchOre();
	public static final Block slimeOre = new SlimeOre();
	public static final Block magmacubeOre = new MagmaCubeOre();
	public static final Block batOre = new BatOre();
	public static final Block squidOre = new SquidOre();
	public static final Block cavespiderOre = new CaveSpiderOre();
	public static final Block ghastOre = new GhastOre();
	public static final Block silverfishOre = new SilverfishOre();
	public static final Block endermiteOre = new EndermiteOre();
	public static final Block guardianOre = new GuardianOre();
	public static final Block shulkerOre = new ShulkerOre();
	public static final Block polarbearOre = new PolarBearOre();
	public static final Block elderguardianOre = new ElderGuardianOre();
	public static final Block witherskeletonOre = new WitherSkeletonOre();
	public static final Block strayOre = new StrayOre();
	public static final Block huskOre = new HuskOre();
	public static final Block donkeyOre = new DonkeyOre();
	public static final Block muleOre = new MuleOre();
	public static final Block skeletonhorseOre = new SkeletonHorseOre();
	public static final Block zombiehorseOre = new ZombieHorseOre();
	public static final Block zombievillagerOre = new ZombieVillagerOre();
	public static final Block evokerOre = new EvokerOre();
	public static final Block llamaOre = new LlamaOre();
	public static final Block vexOre = new VexOre();
	public static final Block vindicatorOre = new VindicatorOre();
	public static final Block parrotOre = new ParrotOre();
	
	public static final Block dwarfLog = new DwarfLog();
	public static final Block dwarfLeaf = new DwarfLeaf();
	public static final Block dwarfSapling = new DwarfSapling();
	
	public static final Block tabBlock = new TabBlock();

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(chickenOre);
		event.getRegistry().register(cowOre);
		event.getRegistry().register(mooshroomOre);
		event.getRegistry().register(pigOre);
		event.getRegistry().register(sheepOre);
		event.getRegistry().register(creeperOre);
		event.getRegistry().register(zombieOre);
		event.getRegistry().register(skeletonOre);
		event.getRegistry().register(spiderOre);
		event.getRegistry().register(wolfOre);
		event.getRegistry().register(endermanOre);
		event.getRegistry().register(villagerOre);
		event.getRegistry().register(ocelotOre);
		event.getRegistry().register(horseOre);
		event.getRegistry().register(rabbitOre);
		event.getRegistry().register(zombiepigmenOre);
		event.getRegistry().register(blazeOre);
		event.getRegistry().register(witchOre);
		event.getRegistry().register(slimeOre);
		event.getRegistry().register(magmacubeOre);
		event.getRegistry().register(batOre);
		event.getRegistry().register(squidOre);
		event.getRegistry().register(cavespiderOre);
		event.getRegistry().register(ghastOre);
		event.getRegistry().register(silverfishOre);
		event.getRegistry().register(endermiteOre);
		event.getRegistry().register(guardianOre);
		event.getRegistry().register(shulkerOre);
		event.getRegistry().register(polarbearOre);
		event.getRegistry().register(elderguardianOre);
		event.getRegistry().register(witherskeletonOre);
		event.getRegistry().register(strayOre);
		event.getRegistry().register(huskOre);
		event.getRegistry().register(donkeyOre);
		event.getRegistry().register(muleOre);
		event.getRegistry().register(skeletonhorseOre);
		event.getRegistry().register(zombiehorseOre);
		event.getRegistry().register(zombievillagerOre);
		event.getRegistry().register(evokerOre);
		event.getRegistry().register(llamaOre);
		event.getRegistry().register(vexOre);
		event.getRegistry().register(vindicatorOre);
		event.getRegistry().register(parrotOre);
		
		event.getRegistry().register(dwarfLog);
		event.getRegistry().register(dwarfLeaf);
		event.getRegistry().register(dwarfSapling);
		
		event.getRegistry().register(tabBlock);
	}

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new ItemBlock(chickenOre).setRegistryName(chickenOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(cowOre).setRegistryName(cowOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(mooshroomOre).setRegistryName(mooshroomOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(pigOre).setRegistryName(pigOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(sheepOre).setRegistryName(sheepOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(creeperOre).setRegistryName(creeperOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(zombieOre).setRegistryName(zombieOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(skeletonOre).setRegistryName(skeletonOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(spiderOre).setRegistryName(spiderOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(wolfOre).setRegistryName(wolfOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(endermanOre).setRegistryName(endermanOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(villagerOre).setRegistryName(villagerOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ocelotOre).setRegistryName(ocelotOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(horseOre).setRegistryName(horseOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(rabbitOre).setRegistryName(rabbitOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(zombiepigmenOre).setRegistryName(zombiepigmenOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(blazeOre).setRegistryName(blazeOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(witchOre).setRegistryName(witchOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(slimeOre).setRegistryName(slimeOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(magmacubeOre).setRegistryName(magmacubeOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(batOre).setRegistryName(batOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(squidOre).setRegistryName(squidOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(cavespiderOre).setRegistryName(cavespiderOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ghastOre).setRegistryName(ghastOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(silverfishOre).setRegistryName(silverfishOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(endermiteOre).setRegistryName(endermiteOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(guardianOre).setRegistryName(guardianOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(shulkerOre).setRegistryName(shulkerOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(polarbearOre).setRegistryName(polarbearOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(elderguardianOre).setRegistryName(elderguardianOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(witherskeletonOre).setRegistryName(witherskeletonOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(strayOre).setRegistryName(strayOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(huskOre).setRegistryName(huskOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(donkeyOre).setRegistryName(donkeyOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(muleOre).setRegistryName(muleOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(skeletonhorseOre).setRegistryName(skeletonhorseOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(zombiehorseOre).setRegistryName(zombiehorseOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(tabBlock).setRegistryName(tabBlock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(zombievillagerOre).setRegistryName(zombievillagerOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(evokerOre).setRegistryName(evokerOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(llamaOre).setRegistryName(llamaOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(vexOre).setRegistryName(vexOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(vindicatorOre).setRegistryName(vindicatorOre.getRegistryName()));
		event.getRegistry().register(new ItemBlock(parrotOre).setRegistryName(parrotOre.getRegistryName()));
		
		event.getRegistry().register(new ItemBlock(dwarfLog).setRegistryName(dwarfLog.getRegistryName()));
		event.getRegistry().register(new ItemBlock(dwarfLeaf).setRegistryName(dwarfLeaf.getRegistryName()));
		event.getRegistry().register(new ItemBlock(dwarfSapling).setRegistryName(dwarfSapling.getRegistryName()));
	}


	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerInventoryModels(final ModelRegistryEvent event)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(chickenOre), 0, new ModelResourceLocation(Item.getItemFromBlock(chickenOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(cowOre), 0, new ModelResourceLocation(Item.getItemFromBlock(cowOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(mooshroomOre), 0, new ModelResourceLocation(Item.getItemFromBlock(mooshroomOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(pigOre), 0, new ModelResourceLocation(Item.getItemFromBlock(pigOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(sheepOre), 0, new ModelResourceLocation(Item.getItemFromBlock(sheepOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(creeperOre), 0, new ModelResourceLocation(Item.getItemFromBlock(creeperOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(zombieOre), 0, new ModelResourceLocation(Item.getItemFromBlock(zombieOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(skeletonOre), 0, new ModelResourceLocation(Item.getItemFromBlock(skeletonOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(spiderOre), 0, new ModelResourceLocation(Item.getItemFromBlock(spiderOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(wolfOre), 0, new ModelResourceLocation(Item.getItemFromBlock(wolfOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(endermanOre), 0, new ModelResourceLocation(Item.getItemFromBlock(endermanOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(villagerOre), 0, new ModelResourceLocation(Item.getItemFromBlock(villagerOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ocelotOre), 0, new ModelResourceLocation(Item.getItemFromBlock(ocelotOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(horseOre), 0, new ModelResourceLocation(Item.getItemFromBlock(horseOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(rabbitOre), 0, new ModelResourceLocation(Item.getItemFromBlock(rabbitOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(zombiepigmenOre), 0, new ModelResourceLocation(Item.getItemFromBlock(zombiepigmenOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blazeOre), 0, new ModelResourceLocation(Item.getItemFromBlock(blazeOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(witchOre), 0, new ModelResourceLocation(Item.getItemFromBlock(witchOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(slimeOre), 0, new ModelResourceLocation(Item.getItemFromBlock(slimeOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(magmacubeOre), 0, new ModelResourceLocation(Item.getItemFromBlock(magmacubeOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(batOre), 0, new ModelResourceLocation(Item.getItemFromBlock(batOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(squidOre), 0, new ModelResourceLocation(Item.getItemFromBlock(squidOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(cavespiderOre), 0, new ModelResourceLocation(Item.getItemFromBlock(cavespiderOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ghastOre), 0, new ModelResourceLocation(Item.getItemFromBlock(ghastOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(silverfishOre), 0, new ModelResourceLocation(Item.getItemFromBlock(silverfishOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(endermiteOre), 0, new ModelResourceLocation(Item.getItemFromBlock(endermiteOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(guardianOre), 0, new ModelResourceLocation(Item.getItemFromBlock(guardianOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(shulkerOre), 0, new ModelResourceLocation(Item.getItemFromBlock(shulkerOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(polarbearOre), 0, new ModelResourceLocation(Item.getItemFromBlock(polarbearOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(elderguardianOre), 0, new ModelResourceLocation(Item.getItemFromBlock(elderguardianOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(witherskeletonOre), 0, new ModelResourceLocation(Item.getItemFromBlock(witherskeletonOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(strayOre), 0, new ModelResourceLocation(Item.getItemFromBlock(strayOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(huskOre), 0, new ModelResourceLocation(Item.getItemFromBlock(huskOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(donkeyOre), 0, new ModelResourceLocation(Item.getItemFromBlock(donkeyOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(muleOre), 0, new ModelResourceLocation(Item.getItemFromBlock(muleOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(skeletonhorseOre), 0, new ModelResourceLocation(Item.getItemFromBlock(skeletonhorseOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(zombiehorseOre), 0, new ModelResourceLocation(Item.getItemFromBlock(zombiehorseOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(zombievillagerOre), 0, new ModelResourceLocation(Item.getItemFromBlock(zombievillagerOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(evokerOre), 0, new ModelResourceLocation(Item.getItemFromBlock(evokerOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(llamaOre), 0, new ModelResourceLocation(Item.getItemFromBlock(llamaOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(vexOre), 0, new ModelResourceLocation(Item.getItemFromBlock(vexOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(vindicatorOre), 0, new ModelResourceLocation(Item.getItemFromBlock(vindicatorOre).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(parrotOre), 0, new ModelResourceLocation(Item.getItemFromBlock(parrotOre).getRegistryName(), "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(tabBlock), 0, new ModelResourceLocation(Item.getItemFromBlock(tabBlock).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(dwarfLeaf), 0, new ModelResourceLocation(Item.getItemFromBlock(dwarfLeaf).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(dwarfLog), 0, new ModelResourceLocation(Item.getItemFromBlock(dwarfLog).getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(dwarfSapling), 0, new ModelResourceLocation(Item.getItemFromBlock(dwarfSapling).getRegistryName(), "inventory"));
	}

}