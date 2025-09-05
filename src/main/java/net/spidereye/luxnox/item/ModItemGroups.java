package net.spidereye.luxnox.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

public class ModItemGroups {

    public static void registerItemGroups() {
        LuxNox.LOGGER.info("Registering Item Groups for " + LuxNox.MOD_ID);
    }
}
