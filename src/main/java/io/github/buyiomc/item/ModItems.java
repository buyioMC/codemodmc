package io.github.buyiomc.item;

import io.github.buyiomc.CodeMod;
import io.github.buyiomc.item.custom.NullPointerException;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JAVA_LANGUAGE = registerItems("java_language", new Item(new Item.Settings()));
    public static final Item C_LANGUAGE = registerItems("c_language", new Item(new Item.Settings()));
    public static final Item COMPILER = registerItems("compiler", new Item(new Item.Settings()));
    public static final Item EMBEDDED_PROJECT_BIN = registerItems("embedded_project_bin", new Item(new Item.Settings()));
    public static final Item MICROCONTROLLER = registerItems("microcontroller", new Item(new Item.Settings()));
    public static final Item HOT_PIECE = registerItems("hot_piece", new Item(new Item.Settings()));
    public static final Item JAVA_CLASS_FILE = registerItems("java_class_file", new Item(new Item.Settings().maxCount(1)));
    public static final Item NULL_POINTER_EXCEPTION = registerItems("null_pointer_exception", new NullPointerException(new Item.Settings().maxCount(1)));
    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CodeMod.MOD_ID, id), item);
    }

    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(JAVA_LANGUAGE);
        fabricItemGroupEntries.add(C_LANGUAGE);
        fabricItemGroupEntries.add(EMBEDDED_PROJECT_BIN);
        fabricItemGroupEntries.add(MICROCONTROLLER);
        fabricItemGroupEntries.add(HOT_PIECE);
        fabricItemGroupEntries.add(COMPILER);
        fabricItemGroupEntries.add(JAVA_CLASS_FILE);
        fabricItemGroupEntries.add(NULL_POINTER_EXCEPTION);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        CodeMod.LOGGER.info("Registering Mod Items");
    }
}
