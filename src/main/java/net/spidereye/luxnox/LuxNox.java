package net.spidereye.luxnox;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.spidereye.luxnox.block.ModBlocks;
import net.spidereye.luxnox.component.ModDataComponentTypes;
import net.spidereye.luxnox.item.ModItemGroups;
import net.spidereye.luxnox.item.ModItems;
import net.spidereye.luxnox.util.ParryEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxNox implements ModInitializer {
	public static final String MOD_ID = "luxnox";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();

		AttackEntityCallback.EVENT.register(new ParryEvent());
	}
}