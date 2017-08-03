package com.MobBlockMod.init;

import com.MobBlockMod.MobBlockMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ModSounds {
	
	public static SoundEvent mushroomLive = createSoundEvent("mushroomLive");
	public static SoundEvent mushroomHurt = createSoundEvent("mushroomHurt");
	public static SoundEvent mushroomDie = createSoundEvent("mushroomDie");
	
	@SubscribeEvent
	public static void registerSounds(final RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().register(new SoundEvent(new ResourceLocation(MobBlockMod.MODID, "mushroomLive")).setRegistryName(new ResourceLocation(MobBlockMod.MODID, "mushroomLive")));
		event.getRegistry().register(new SoundEvent(new ResourceLocation(MobBlockMod.MODID, "mushroomHurt")).setRegistryName(new ResourceLocation(MobBlockMod.MODID, "mushroomHurt")));
		event.getRegistry().register(new SoundEvent(new ResourceLocation(MobBlockMod.MODID, "mushroomDie")).setRegistryName(new ResourceLocation(MobBlockMod.MODID, "mushroomDie")));
	}
	
	private static SoundEvent createSoundEvent(String name)
	{
		ResourceLocation registryName = new ResourceLocation(MobBlockMod.MODID, name);
		return new SoundEvent(registryName).setRegistryName(registryName);
	}
}
