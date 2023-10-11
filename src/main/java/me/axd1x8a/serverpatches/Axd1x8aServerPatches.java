package me.axd1x8a.serverpatches;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import net.fabricmc.api.ModInitializer;

public class Axd1x8aServerPatches implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("axd1x8a-server-patches");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading patches");
	}
}
