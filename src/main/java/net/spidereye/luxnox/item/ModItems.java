package net.spidereye.luxnox.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

public class ModItems {
    // -------------------------------------------------------------- LUXITE ITEMS -----------------------------------------------------------------------------------
    public static final Item LUXITE_DUST = registerItem("luxite_dust", new Item(new Item.Settings()));
    public static final Item LUXITE_INGOT = registerItem("luxite_ingot", new Item(new Item.Settings()));
    public static final Item LUXITE_UPGRADE_SMITHING_TEMPLATE = registerItem("luxite_upgrade_smithing_template", new Item(new Item.Settings()));


    // -------------------------------------------------------------- LUXITE INFUSED DIAMOND TOOLS -------------------------------------------------------------------
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

    // -------------------------------------------------------------- LUXITE INFUSED DIAMOND ARMOR  ------------------------------------------------------------------

    public static final Item LUXITE_INFUSED_DIAMOND_HELMET = registerItem("luxite_infused_diamond_helmet",
            new ArmorItem(ModArmorMaterials.LUXITE_INFUSED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(33))));
    public static final Item LUXITE_INFUSED_DIAMOND_CHESTPLATE = registerItem("luxite_infused_diamond_chestplate",
            new ArmorItem(ModArmorMaterials.LUXITE_INFUSED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(33))));
    public static final Item LUXITE_INFUSED_DIAMOND_LEGGINGS = registerItem("luxite_infused_diamond_leggings",
            new ArmorItem(ModArmorMaterials.LUXITE_INFUSED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(33))));
    public static final Item LUXITE_INFUSED_DIAMOND_BOOTS = registerItem("luxite_infused_diamond_boots",
            new ArmorItem(ModArmorMaterials.LUXITE_INFUSED_DIAMOND_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(33))));

    // -------------------------------------------------------------- LUXITE TOOLS -----------------------------------------------------------------------------------

    public static final Item LUXITE_SWORD = registerItem("luxite_sword",
            new SwordItem(ModToolMaterials.LUXITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LUXITE, 3, -2.4F))));
    public static final Item LUXITE_PICKAXE = registerItem("luxite_pickaxe",
            new PickaxeItem(ModToolMaterials.LUXITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LUXITE, 1.5F, -3.0F))));
    public static final Item LUXITE_SHOVEL = registerItem("luxite_shovel",
            new ShovelItem(ModToolMaterials.LUXITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LUXITE, 1.0F, -2.8F))));
    public static final Item LUXITE_AXE = registerItem("luxite_axe",
            new AxeItem(ModToolMaterials.LUXITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LUXITE, 5.0F, -3.0F))));
    public static final Item LUXITE_HOE = registerItem("luxite_hoe",
            new HoeItem(ModToolMaterials.LUXITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LUXITE, -4.0F, 0.0F))));

    // -------------------------------------------------------------- LUXITE ARMOR  --------------------------------------------------------------------------------

    public static final Item LUXITE_HELMET = registerItem("luxite_helmet",
            new ArmorItem(ModArmorMaterials.LUXITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item LUXITE_CHESTPLATE = registerItem("luxite_chestplate",
            new ArmorItem(ModArmorMaterials.LUXITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item LUXITE_LEGGINGS = registerItem("luxite_leggings",
            new ArmorItem(ModArmorMaterials.LUXITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item LUXITE_BOOTS = registerItem("luxite_boots",
            new ArmorItem(ModArmorMaterials.LUXITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LuxNox.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LuxNox.LOGGER.info("Registering Mod Items for" + LuxNox.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS);
    }
}
