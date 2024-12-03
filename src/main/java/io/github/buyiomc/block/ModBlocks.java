package io.github.buyiomc.block;

import io.github.buyiomc.CodeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CODE_EDIT = register("code_edit", new Block(AbstractBlock.Settings.create().strength(0.7f, 0.7f)));
    public static final Block KEIL = register("keil_edit", new Block(AbstractBlock.Settings.create().strength(0.7f, 0.7f)));

    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(CodeMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CodeMod.MOD_ID, id), block);
    }

    public static void registerModBlocks() {

        CodeMod.LOGGER.info("Registering Mod Blocks");
    }
}
