package net.spidereye.luxnox.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LuxNox.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LuxNox.LOGGER.info("Registering Mod Items for" + LuxNox.MOD_ID);
    }
}
