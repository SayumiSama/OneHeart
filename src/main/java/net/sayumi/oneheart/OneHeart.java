package net.sayumi.oneheart;

import net.fabricmc.api.ModInitializer;

import net.sayumi.oneheart.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OneHeart implements ModInitializer {
	public static final String MOD_ID = "one-heart";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}