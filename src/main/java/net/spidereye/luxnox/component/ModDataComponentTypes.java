package net.spidereye.luxnox.component;

import com.mojang.serialization.Codec;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spidereye.luxnox.LuxNox;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {
    public static final ComponentType<Boolean> IS_BLOCKING = register("is_blocking", booleanBuilder -> booleanBuilder.codec(Codec.BOOL));


    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(LuxNox.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        LuxNox.LOGGER.info("Registering Data Component Types for " +LuxNox.MOD_ID);
    }
}
