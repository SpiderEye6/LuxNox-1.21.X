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
    }
}
