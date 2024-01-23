package ca.worldwidepixel.sprint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.ornithemc.osl.entrypoints.api.ModInitializer;

//import net.minecraft.client.render.TextRenderer;


public class Sprint implements ModInitializer {

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("Sprint");

	@Override
	public void init() {
		LOGGER.info("Sprint is working!");
	}

}
