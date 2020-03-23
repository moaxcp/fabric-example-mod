package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.registry.*;

public class ExampleMod implements ModInitializer {
	public static final Item FABRIC_ITEM = new FabricItem(new Item.Settings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
	}
}
