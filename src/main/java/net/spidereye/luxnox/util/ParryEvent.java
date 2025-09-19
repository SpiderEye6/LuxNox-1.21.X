package net.spidereye.luxnox.util;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import net.spidereye.luxnox.component.ModDataComponentTypes;
import net.spidereye.luxnox.item.custom.ParryingDaggerItem;
import org.jetbrains.annotations.Nullable;

public class ParryEvent implements AttackEntityCallback {
    @Override
    public ActionResult interact(PlayerEntity attacker, World world, Hand attackerHand, Entity entity, @Nullable EntityHitResult hitResult) {
        if(entity instanceof PlayerEntity blocker) {
            ItemStack blockingItemStack = blocker.getOffHandStack();
            Item attackingItem = attacker.getMainHandStack().getItem();

            if(attackingItem instanceof SwordItem || attackingItem instanceof AxeItem) {

                if(blockingItemStack.getItem() instanceof ParryingDaggerItem blockingItem) {

                    if(Boolean.TRUE.equals(blockingItemStack.get(ModDataComponentTypes.IS_BLOCKING))) {
                        ParryingDaggerItem.parry(attacker, blocker, attackingItem, blockingItem);
                        return ActionResult.SUCCESS;
                    }
                }
            }
        }

        return ActionResult.PASS;
    }
}
