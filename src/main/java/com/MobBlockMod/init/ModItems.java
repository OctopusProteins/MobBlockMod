package com.MobBlockMod.init;

import com.MobBlockMod.items.BatBits;
import com.MobBlockMod.items.BlazeBits;
import com.MobBlockMod.items.BushEgg;
import com.MobBlockMod.items.BushMush;
import com.MobBlockMod.items.CapMush;
import com.MobBlockMod.items.CapSlice;
import com.MobBlockMod.items.CaveSpiderBits;
import com.MobBlockMod.items.ChickenBits;
import com.MobBlockMod.items.CowBits;
import com.MobBlockMod.items.CreeperBits;
import com.MobBlockMod.items.DonkeyBits;
import com.MobBlockMod.items.ElderGuardianBits;
import com.MobBlockMod.items.EndermanBits;
import com.MobBlockMod.items.EndermiteBits;
import com.MobBlockMod.items.GeneEgg;
import com.MobBlockMod.items.GhastBits;
import com.MobBlockMod.items.GrassShreds;
import com.MobBlockMod.items.GuardianBits;
import com.MobBlockMod.items.HorseBits;
import com.MobBlockMod.items.HuskBits;
import com.MobBlockMod.items.MagmaCubeBits;
import com.MobBlockMod.items.MooshroomBits;
import com.MobBlockMod.items.MuleBits;
import com.MobBlockMod.items.MushroomCap;
import com.MobBlockMod.items.MushroomCompound;
import com.MobBlockMod.items.MushroomStem;
import com.MobBlockMod.items.MushyPulp;
import com.MobBlockMod.items.OcelotBits;
import com.MobBlockMod.items.PigBits;
import com.MobBlockMod.items.PolarBearBits;
import com.MobBlockMod.items.Pulp;
import com.MobBlockMod.items.RabbitBits;
import com.MobBlockMod.items.RefinedPulp;
import com.MobBlockMod.items.SheepBits;
import com.MobBlockMod.items.ShulkerBits;
import com.MobBlockMod.items.SilverfishBits;
import com.MobBlockMod.items.SkeletonBits;
import com.MobBlockMod.items.SkeletonHorseBits;
import com.MobBlockMod.items.SlimeBits;
import com.MobBlockMod.items.SpiderBits;
import com.MobBlockMod.items.SquidBits;
import com.MobBlockMod.items.StemMush;
import com.MobBlockMod.items.StemSlice;
import com.MobBlockMod.items.StrayBits;
import com.MobBlockMod.items.VillagerBits;
import com.MobBlockMod.items.WitchBits;
import com.MobBlockMod.items.WitherSkeletonBits;
import com.MobBlockMod.items.WolfBits;
import com.MobBlockMod.items.WoodPulp;
import com.MobBlockMod.items.ZombieBits;
import com.MobBlockMod.items.ZombieHorseBits;
import com.MobBlockMod.items.ZombiePigmenBits;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class ModItems
{
	public static final Item chickenBits = new ChickenBits();
	public static final Item cowBits = new CowBits();
	public static final Item mooshroomBits = new MooshroomBits();
	public static final Item pigBits = new PigBits();
	public static final Item sheepBits = new SheepBits();
	public static final Item creeperBits = new CreeperBits();
	public static final Item zombieBits = new ZombieBits();
	public static final Item skeletonBits = new SkeletonBits();
	public static final Item spiderBits = new SpiderBits();
	public static final Item wolfBits = new WolfBits();
	public static final Item endermanBits = new EndermanBits();
	public static final Item villagerBits = new VillagerBits();
	public static final Item ocelotBits = new OcelotBits();
	public static final Item horseBits = new HorseBits();
	public static final Item rabbitBits = new RabbitBits();
	public static final Item zombiepigmenBits = new ZombiePigmenBits();
	public static final Item blazeBits = new BlazeBits();	    
	public static final Item witchBits = new WitchBits();
	public static final Item slimeBits = new SlimeBits();	    
	public static final Item magmacubeBits = new MagmaCubeBits();	  
	public static final Item batBits = new BatBits();	   
	public static final Item squidBits = new SquidBits();
	public static final Item cavespiderBits = new CaveSpiderBits();
	public static final Item ghastBits = new GhastBits();
	public static final Item silverfishBits = new SilverfishBits();
	public static final Item endermiteBits = new EndermiteBits();
	public static final Item guardianBits = new GuardianBits();
	public static final Item elderguardianBits = new ElderGuardianBits();
	public static final Item shulkerBits = new ShulkerBits();
	public static final Item polarbearBits = new PolarBearBits();
	public static final Item witherskeletonBits = new WitherSkeletonBits();
	public static final Item huskBits = new HuskBits();
	public static final Item strayBits = new StrayBits();
	public static final Item muleBits = new MuleBits();
	public static final Item donkeyBits = new DonkeyBits();
	public static final Item skeletonhorseBits = new SkeletonHorseBits();
	public static final Item zombiehorseBits = new ZombieHorseBits();

	public static final Item bushMush = new BushMush();

	public static final Item grassShreds = new GrassShreds(); 

	public static final Item bushEgg = new BushEgg();
	public static final Item geneEgg = new GeneEgg();	    
	public static final Item woodPulp = new WoodPulp();	   
	public static final Item refinedPulp = new RefinedPulp();
	   
	public static final Item mushyPulp = new MushyPulp();	

	public static final Item pulp = new Pulp();	    
	public static final Item mushroomCap = new MushroomCap();
	public static final Item mushroomStem = new MushroomStem();	    
	public static final Item capSlice = new CapSlice();
	public static final Item stemSlice = new StemSlice();
	public static final Item capMush = new CapMush();	   
	public static final Item stemMush = new StemMush();
	public static final Item mushroomCompound = new MushroomCompound();


	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(chickenBits);
		event.getRegistry().register(cowBits);
		event.getRegistry().register(mooshroomBits);
		event.getRegistry().register(pigBits);
		event.getRegistry().register(sheepBits);
		event.getRegistry().register(creeperBits);
		event.getRegistry().register(zombieBits);
		event.getRegistry().register(skeletonBits);
		event.getRegistry().register(spiderBits);
		event.getRegistry().register(wolfBits);
		event.getRegistry().register(endermanBits);
		event.getRegistry().register(villagerBits);
		event.getRegistry().register(ocelotBits);
		event.getRegistry().register(horseBits);
		event.getRegistry().register(rabbitBits);
		event.getRegistry().register(zombiepigmenBits);
		event.getRegistry().register(blazeBits);
		event.getRegistry().register(witchBits);
		event.getRegistry().register(slimeBits);
		event.getRegistry().register(magmacubeBits);
		event.getRegistry().register(batBits);
		event.getRegistry().register(squidBits);
		event.getRegistry().register(cavespiderBits);
		event.getRegistry().register(ghastBits);
		event.getRegistry().register(silverfishBits);
		event.getRegistry().register(endermiteBits);
		event.getRegistry().register(guardianBits);
		event.getRegistry().register(shulkerBits);
		event.getRegistry().register(polarbearBits);
		event.getRegistry().register(elderguardianBits);
		event.getRegistry().register(witherskeletonBits);
		event.getRegistry().register(strayBits);
		event.getRegistry().register(huskBits);
		event.getRegistry().register(donkeyBits);
		event.getRegistry().register(muleBits);
		event.getRegistry().register(skeletonhorseBits);
		event.getRegistry().register(zombiehorseBits);
		
		event.getRegistry().register(bushMush);
		event.getRegistry().register(grassShreds);
		event.getRegistry().register(bushEgg);
		event.getRegistry().register(geneEgg);
		event.getRegistry().register(woodPulp);
		event.getRegistry().register(refinedPulp);
		event.getRegistry().register(mushyPulp);
		event.getRegistry().register(pulp);
		event.getRegistry().register(mushroomCap);
		event.getRegistry().register(mushroomStem);
		event.getRegistry().register(capSlice);
		event.getRegistry().register(stemSlice);
		event.getRegistry().register(capMush);
		event.getRegistry().register(stemMush);
		event.getRegistry().register(mushroomCompound);
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerInventoryModels(final ModelRegistryEvent event)
	{
		ModelLoader.setCustomModelResourceLocation(chickenBits, 0, new ModelResourceLocation(chickenBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(cowBits, 0, new ModelResourceLocation(cowBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(mooshroomBits, 0, new ModelResourceLocation(mooshroomBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(pigBits, 0, new ModelResourceLocation(pigBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(sheepBits, 0, new ModelResourceLocation(sheepBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(creeperBits, 0, new ModelResourceLocation(creeperBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(zombieBits, 0, new ModelResourceLocation(zombieBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(skeletonBits, 0, new ModelResourceLocation(skeletonBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(spiderBits, 0, new ModelResourceLocation(spiderBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(wolfBits, 0, new ModelResourceLocation(wolfBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(endermanBits, 0, new ModelResourceLocation(endermanBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(villagerBits, 0, new ModelResourceLocation(villagerBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(ocelotBits, 0, new ModelResourceLocation(ocelotBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(horseBits, 0, new ModelResourceLocation(horseBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(rabbitBits, 0, new ModelResourceLocation(rabbitBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(zombiepigmenBits, 0, new ModelResourceLocation(zombiepigmenBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(blazeBits, 0, new ModelResourceLocation(blazeBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(witchBits, 0, new ModelResourceLocation(witchBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(slimeBits, 0, new ModelResourceLocation(slimeBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(magmacubeBits, 0, new ModelResourceLocation(magmacubeBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(batBits, 0, new ModelResourceLocation(batBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(squidBits, 0, new ModelResourceLocation(squidBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(cavespiderBits, 0, new ModelResourceLocation(cavespiderBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(ghastBits, 0, new ModelResourceLocation(ghastBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(silverfishBits, 0, new ModelResourceLocation(silverfishBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(endermiteBits, 0, new ModelResourceLocation(endermiteBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(guardianBits, 0, new ModelResourceLocation(guardianBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(shulkerBits, 0, new ModelResourceLocation(shulkerBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(polarbearBits, 0, new ModelResourceLocation(polarbearBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(elderguardianBits, 0, new ModelResourceLocation(elderguardianBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(witherskeletonBits, 0, new ModelResourceLocation(witherskeletonBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(strayBits, 0, new ModelResourceLocation(strayBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(huskBits, 0, new ModelResourceLocation(huskBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(donkeyBits, 0, new ModelResourceLocation(donkeyBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(muleBits, 0, new ModelResourceLocation(muleBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(skeletonhorseBits, 0, new ModelResourceLocation(skeletonhorseBits.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(zombiehorseBits, 0, new ModelResourceLocation(zombiehorseBits.getRegistryName(), "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(bushMush, 0, new ModelResourceLocation(bushMush.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(grassShreds, 0, new ModelResourceLocation(grassShreds.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(bushEgg, 0, new ModelResourceLocation(bushEgg.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(geneEgg, 0, new ModelResourceLocation(geneEgg.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(woodPulp, 0, new ModelResourceLocation(woodPulp.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(refinedPulp, 0, new ModelResourceLocation(refinedPulp.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(mushyPulp, 0, new ModelResourceLocation(mushyPulp.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(pulp, 0, new ModelResourceLocation(pulp.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(mushroomCap, 0, new ModelResourceLocation(mushroomCap.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(mushroomStem, 0, new ModelResourceLocation(mushroomStem.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(capSlice, 0, new ModelResourceLocation(capSlice.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(stemSlice, 0, new ModelResourceLocation(stemSlice.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(capMush, 0, new ModelResourceLocation(capMush.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(stemMush, 0, new ModelResourceLocation(stemMush.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(mushroomCompound, 0, new ModelResourceLocation(mushroomCompound.getRegistryName(), "inventory"));
	}

}