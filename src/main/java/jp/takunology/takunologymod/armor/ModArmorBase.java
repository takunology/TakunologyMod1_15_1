package jp.takunology.takunologymod.armor;

import jp.takunology.takunologymod.TakunologyMod;
import jp.takunology.takunologymod.items.Ingots;

import com.google.common.base.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.LazyValue;

public class ModArmorBase {

    public enum TakunologyMaterial implements IArmorMaterial {

        MATERIAL_TAKUNOLO(TakunologyMod.MOD_ID + ":" + "takunolo", 5, 
        new int[] {7, 11, 8, 5}, 420, SoundEvents.field_226124_Y_, 6.9F, () -> {
            return Ingredient.fromItems(Ingots.takunolo_ingot);
        });

        private static final int[] DURABILITY_ARRAY = new int[] {13, 15, 16, 11};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        private TakunologyMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
        int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn)
        {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = soundEventIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return DURABILITY_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }
    }
}