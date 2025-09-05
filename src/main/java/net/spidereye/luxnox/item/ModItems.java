package net.spidereye.luxnox.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

public class ModItems {
    public static final Item LUXITE_DUST = registerItem("luxite_dust", new Item(new Item.Settings()));
    public static final Item LUXITE_INGOT = registerItem("luxite_ingot", new Item(new Item.Settings()));
    public static final Item LUXITE_UPGRADE_SMITHING_TEMPLATE = registerItem("luxite_upgrade_smithing_template", new Item(new Item.Settings()));

    public static final Item LUXITE_INFUSED_DIAMOND_SWORD = registerItem("luxite_infused_diamond_sword",
            new SwordItem(ModToolMaterials.LUXITE_INFUSED, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LUXITE_INFUSED, 3, -2.4F))));
    public static final Item LUXITE_INFUSED_DIAMOND_PICKAXE = registerItem("luxite_infused_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.LUXITE_INFUSED, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LUXITE_INFUSED, 1.0F, -2.8F))));
    public static final Item LUXITE_INFUSED_DIAMOND_SHOVEL = registerItem("luxite_infused_diamond_shovel",
            new ShovelItem(ModToolMaterials.LUXITE_INFUSED, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LUXITE_INFUSED, 1.5F, -3.0F))));
    public static final Item LUXITE_INFUSED_DIAMOND_AXE = registerItem("luxite_infused_diamond_axe",
            new AxeItem(ModToolMaterials.LUXITE_INFUSED, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LUXITE_INFUSED, 5.0F, -3.0F))));
    public static final Item LUXITE_INFUSED_DIAMOND_HOE = registerItem("luxite_infused_diamond_hoe",
            new HoeItem(ModToolMaterials.LUXITE_INFUSED, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LUXITE_INFUSED, -3.0F, 0.0F))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LuxNox.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LuxNox.LOGGER.info("Registering Mod Items for" + LuxNox.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS);
    }
}
