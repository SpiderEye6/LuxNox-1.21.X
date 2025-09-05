package net.spidereye.luxnox.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

public class ModItemGroups {
    public static final ItemGroup LUXITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LuxNox.MOD_ID, "luxite_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LUXITE_INGOT))
                    .displayName(Text.translatable("itemgroup.luxnox.luxite_items_group"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.LUXITE_DUST);
                        entries.add(ModItems.LUXITE_INGOT);
                        entries.add(ModItems.LUXITE_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(ModItems.LUXITE_INFUSED_DIAMOND_SWORD);
                        entries.add(ModItems.LUXITE_INFUSED_DIAMOND_PICKAXE);
                        entries.add(ModItems.LUXITE_INFUSED_DIAMOND_SHOVEL);
                        entries.add(ModItems.LUXITE_INFUSED_DIAMOND_AXE);
                        entries.add(ModItems.LUXITE_INFUSED_DIAMOND_HOE);

                    })).build()) ;

    public static void registerItemGroups() {
        LuxNox.LOGGER.info("Registering Item Groups for " + LuxNox.MOD_ID);
    }
}