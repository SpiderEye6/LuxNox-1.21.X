package net.spidereye.luxnox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.spidereye.luxnox.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.LUXITE_INFUSED_DIAMOND_HOE);
    }
}
