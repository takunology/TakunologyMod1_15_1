package jp.takunology.takunologymod.tools;

import com.google.common.base.Supplier;

import jp.takunology.takunologymod.items.Ingots;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public class ModToolBase {
    public enum TakunologyItemTier implements IItemTier {
        
        MATERIAL_TAKUNOLO(3, 2000, 8.0F, 4.0F, 200, () -> {
            return Ingredient.fromItems(Ingots.takunolo_ingot);
        });

        private final int harvestLevel;
        private final int durability;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private TakunologyItemTier (int harvestLevel, int durability, float efficiency, float attackDamage, 
        int enchantability, Supplier<Ingredient> repairMaterial)
        {
            this.harvestLevel = harvestLevel;
            this.durability = durability;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return durability;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
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
			return this.repairMaterial.getValue();
		}
    }

    public enum ThunderItemTier implements IItemTier {
        
        MATERIAL_Thunder(3, 2500, 10.0F, 6.0F, 200, () -> {
            return Ingredient.fromItems(Ingots.takunolo_ingot);
        });

        private final int harvestLevel;
        private final int durability;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ThunderItemTier (int harvestLevel, int durability, float efficiency, float attackDamage, 
        int enchantability, Supplier<Ingredient> repairMaterial)
        {
            this.harvestLevel = harvestLevel;
            this.durability = durability;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return durability;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
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
			return this.repairMaterial.getValue();
		}
    }
}