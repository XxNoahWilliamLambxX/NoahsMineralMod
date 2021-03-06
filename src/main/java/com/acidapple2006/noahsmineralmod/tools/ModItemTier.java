package com.acidapple2006.noahsmineralmod.tools;

import com.acidapple2006.noahsmineralmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    RUBY(3, 2000, 10.0f, 1.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.RUBY_INGOT.get());
    }),
    AZURITE(3, 2000, 10.0f, 1.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.AZURITE_INGOT.get());
    }),
    PINKOPAL(3, 2000, 10.0f, 1.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.AZURITE_INGOT.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackdamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackdamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackdamage = attackdamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;

    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackdamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
