package net.spidereye.luxnox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.spidereye.luxnox.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Luxite
        itemModelGenerator.register(ModItems.LUXITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUXITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUXITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LUXITE_INFUSED_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_INFUSED_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_INFUSED_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_INFUSED_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_INFUSED_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_INFUSED_DIAMOND_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_INFUSED_DIAMOND_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_INFUSED_DIAMOND_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_INFUSED_DIAMOND_BOOTS));

        itemModelGenerator.register(ModItems.LUXITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LUXITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUXITE_BOOTS));

        // Noxite
        itemModelGenerator.register(ModItems.ENDER_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FADED_NOXITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NOXITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOXITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARGED_NOXITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OVERCHARGED_NOXITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.WARPED_COPPER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOID_SLIME_BALL, Models.GENERATED);
    }
}
