package net.spidereye.luxnox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.spidereye.luxnox.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
//        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_LUXITE_INFUSED_TOOL)
//                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

//        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_LUXITE_INFUSED_TOOL)
//                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
    }
}
