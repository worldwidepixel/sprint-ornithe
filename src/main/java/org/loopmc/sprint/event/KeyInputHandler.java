package org.loopmc.sprint.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.options.KeyBinding;

import net.minecraft.client.render.TextRenderer;
import net.minecraft.client.render.texture.TextureManager;
import net.ornithemc.osl.entrypoints.api.ModInitializer;
import net.ornithemc.osl.entrypoints.api.client.ClientModInitializer;
import net.ornithemc.osl.keybinds.api.KeyBindingEvents;

import net.ornithemc.osl.lifecycle.api.client.MinecraftClientEvents;
import org.lwjgl.input.Keyboard;
import net.minecraft.text.StringUtils;

public class KeyInputHandler implements ModInitializer {

	public static KeyBinding sprintKey;

	@Override
	public void init() {
		KeyBindingEvents.REGISTER_KEYBINDS.register(registry -> {
			sprintKey = registry.register("Sprint", Keyboard.KEY_R);
		});
		MinecraftClientEvents.TICK_END.register(client -> {
			if(sprintKey.pressed) {
				client.player.setSprinting(true);
			}
		});
	}


}
