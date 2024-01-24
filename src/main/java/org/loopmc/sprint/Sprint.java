package org.loopmc.sprint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.ornithemc.osl.entrypoints.api.ModInitializer;

//import net.minecraft.client.render.TextRenderer;


public class Sprint implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("Sprint");

	@Override
	public void init() {
		LOGGER.info("Sprint is working!");
	}

}
