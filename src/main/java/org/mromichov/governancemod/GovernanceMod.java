package org.mromichov.governancemod;

import net.fabricmc.api.ModInitializer;

import org.mromichov.governancemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GovernanceMod implements ModInitializer {
	public static final String MOD_ID = "governancemod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}