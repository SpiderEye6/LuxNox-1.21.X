package net.spidereye.luxnox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;
import net.spidereye.luxnox.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LUXITE_DUST, 1)
                .input(Items.BLAZE_POWDER)
                .input(Items.GLOWSTONE_DUST)
                .input(Items.REDSTONE)
                .criterion(hasItem(Items.BLAZE_POWDER), conditionsFromItem(Items.BLAZE_POWDER))
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LUXITE_DUST, 4)
                .input(ModItems.LUXITE_INGOT)
                .criterion(hasItem(ModItems.LUXITE_INGOT), conditionsFromItem(ModItems.LUXITE_DUST))
                .offerTo(exporter, Identifier.of(LuxNox.MOD_ID, "luxite_dust_from_luxite_ingot"));


        offerSmithingTemplateCopyingRecipe(exporter, ModItems.LUXITE_UPGRADE_SMITHING_TEMPLATE, ModItems.LUXITE_DUST);
    }
}
