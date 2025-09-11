package net.spidereye.luxnox.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_LUXITE_INFUSED_TOOL = createTag("needs_luxite_infused_tool");
        public static final TagKey<Block> INCORRECT_FOR_LUXITE_INFUSED_TOOL = createTag("incorrect_for_luxite_infused_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(LuxNox.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> NOXITE = createTag("noxite");
        public static final TagKey<Item> LUXITE = createTag("luxite");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(LuxNox.MOD_ID, name));
        }
    }
}
