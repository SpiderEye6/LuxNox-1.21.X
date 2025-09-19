package net.spidereye.luxnox.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.block.DispenserBlock;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.spidereye.luxnox.component.ModDataComponentTypes;

import java.util.List;


public class ParryingDaggerItem extends SwordItem implements Equipment {
    public ParryingDaggerItem(ToolMaterial toolMaterial, Item.Settings settings) {
        super(toolMaterial, settings.component(DataComponentTypes.TOOL, createToolComponent()));
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
    }

    private static ToolComponent createToolComponent() {
        return new ToolComponent(
                List.of(ToolComponent.Rule.ofAlwaysDropping(List.of(Blocks.COBWEB), 15.0F), ToolComponent.Rule.of(BlockTags.SWORD_EFFICIENT, 1.5F)), 1.0F, 2
        );
    }

    public static AttributeModifiersComponent createAttributeModifiers(ToolMaterial material, int baseAttackDamage, float attackSpeed) {
        return AttributeModifiersComponent.builder()
                .add(
                        EntityAttributes.GENERIC_ATTACK_DAMAGE,
                        new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, baseAttackDamage + material.getAttackDamage(), EntityAttributeModifier.Operation.ADD_VALUE),
                        AttributeModifierSlot.MAINHAND
                )
                .add(
                        EntityAttributes.GENERIC_ATTACK_SPEED,
                        new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, attackSpeed, EntityAttributeModifier.Operation.ADD_VALUE),
                        AttributeModifierSlot.MAINHAND
                )
                .build();
    }

    public static void parry(PlayerEntity attacker, PlayerEntity blocker, Item blockerItem, Item attackerItem) {
        attacker.getItemCooldownManager().set(attackerItem, 20);
        blocker.getItemCooldownManager().set(blockerItem, 20);
        attacker.incrementStat(Stats.USED.getOrCreateStat(attackerItem));
        blocker.incrementStat(Stats.USED.getOrCreateStat(blockerItem));
        blocker.getOffHandStack().damage(1, blocker, EquipmentSlot.OFFHAND);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BLOCK;
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 72000;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        itemStack.set(ModDataComponentTypes.IS_BLOCKING, true);
        return TypedActionResult.consume(itemStack);
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        stack.set(ModDataComponentTypes.IS_BLOCKING, false);
        return super.isUsedOnRelease(stack);
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return super.canRepair(stack, ingredient);
    }

    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.OFFHAND;
    }
}
