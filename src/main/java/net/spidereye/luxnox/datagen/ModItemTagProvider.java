package net.spidereye.luxnox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.spidereye.luxnox.item.ModItems;
import net.spidereye.luxnox.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.LUXITE)
                .add(ModItems.LUXITE_DUST)
                .add(ModItems.LUXITE_INGOT)
                .add(ModItems.LUXITE_UPGRADE_SMITHING_TEMPLATE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_SWORD)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_PICKAXE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_AXE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_SHOVEL)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_HOE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_HELMET)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_CHESTPLATE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_LEGGINGS)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_BOOTS)
                .add(ModItems.LUXITE_SWORD)
                .add(ModItems.LUXITE_PICKAXE)
                .add(ModItems.LUXITE_AXE)
                .add(ModItems.LUXITE_SHOVEL)
                .add(ModItems.LUXITE_HOE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_SWORD)
                .add(ModItems.LUXITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_PICKAXE)
                .add(ModItems.LUXITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_SHOVEL)
                .add(ModItems.LUXITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_AXE)
                .add(ModItems.LUXITE_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_HOE)
                .add(ModItems.LUXITE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_HELMET)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_CHESTPLATE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_LEGGINGS)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_BOOTS)
                .add(ModItems.LUXITE_HELMET)
                .add(ModItems.LUXITE_CHESTPLATE)
                .add(ModItems.LUXITE_LEGGINGS)
                .add(ModItems.LUXITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_HELMET)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_CHESTPLATE)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_LEGGINGS)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_BOOTS)
                .add(ModItems.LUXITE_HELMET)
                .add(ModItems.LUXITE_CHESTPLATE)
                .add(ModItems.LUXITE_LEGGINGS)
                .add(ModItems.LUXITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.LUXITE_PARRYING_DAGGER_ITEM);
    }
}
