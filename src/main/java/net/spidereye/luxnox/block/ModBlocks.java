package net.spidereye.luxnox.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

public class ModBlocks {



    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LuxNox.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LuxNox.LOGGER.info("registering Mod Blocks for " + LuxNox.MOD_ID);
    }
}
