package io.github.buyiomc.item;

import io.github.buyiomc.CodeMod;
import io.github.buyiomc.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CODE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(CodeMod.MOD_ID, "code_group"),
        ItemGroup.create(null, -1).displayName(Text.translatable("ItemGroup.code_group"))    //itemGroup.code_group
                .icon(() -> new ItemStack(ModItems.JAVA_LANGUAGE))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.JAVA_LANGUAGE);
                    entries.add(ModItems.COMPILER);
                    entries.add(ModBlocks.CODE_EDIT);
                }).build());

    public static void registerModItemsGroups() {
        CodeMod.LOGGER.info("Registering Mod Item Groups");
    }
}