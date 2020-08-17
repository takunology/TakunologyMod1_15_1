package jp.takunology.takunologymod.armor;

import jp.takunology.takunologymod.armor.ModArmorBase.TakunologyMaterial;
import jp.takunology.takunologymod.events.TakunologyItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class TakunoloArmor
{
    public static final Item takunolo_helmet = new ArmorItem(
        TakunologyMaterial.MATERIAL_TAKUNOLO, EquipmentSlotType.HEAD,
        new Item.Properties().group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_helmet");

    public static final Item takunolo_chest = new ArmorItem(
        TakunologyMaterial.MATERIAL_TAKUNOLO, EquipmentSlotType.CHEST,
        new Item.Properties().group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_chest");

    public static final Item takunolo_legs = new ArmorItem(
        TakunologyMaterial.MATERIAL_TAKUNOLO, EquipmentSlotType.LEGS,
        new Item.Properties().group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_legs");

    public static final Item takunolo_feet = new ArmorItem(
        TakunologyMaterial.MATERIAL_TAKUNOLO, EquipmentSlotType.FEET,
        new Item.Properties().group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_feet");
}