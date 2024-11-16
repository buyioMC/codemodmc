package io.github.buyiomc.item;

import io.github.buyiomc.CodeMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JAVA_LANGUAGE = registerItems("java_language", new Item(new Item.Settings()));
    public static final Item COMPILER = registerItems("compiler", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CodeMod.MOD_ID, id), item);
    }

    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(JAVA_LANGUAGE);
        fabricItemGroupEntries.add(COMPILER);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        CodeMod.LOGGER.info("Registering Mod Items");
    }
}
