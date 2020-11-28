package com.example.examplemod;

import net.minecraft.item.Items;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID)
public class EventSubscriber {

	@SubscribeEvent
	// event give ItemEntity and using .getItem again gets the item stack, finally
	// the last .getItem gets the Item to compare to rotten flesh
	public static void onClientPickupEvent(EntityItemPickupEvent event) {
		if (event.getItem().getItem().getItem() == Items.ROTTEN_FLESH) {
			event.setCanceled(true);
		}
	}
}
