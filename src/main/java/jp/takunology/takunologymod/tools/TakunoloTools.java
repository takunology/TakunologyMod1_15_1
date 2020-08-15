package jp.takunology.takunologymod.tools;

import jp.takunology.takunologymod.events.TakunologyItemGroup;
import jp.takunology.takunologymod.tools.ModToolBase.TakunologyItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;

public class TakunoloTools
{
    public static final Item takunolo_sword = new SwordItem(
        TakunologyItemTier.MATERIAL_TAKUNOLO, 10, 5.0f, 
        new Item.Properties()
        .group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_sword");

    public static final Item takunolo_axe = new AxeItem(
        TakunologyItemTier.MATERIAL_TAKUNOLO, 8, 4.0f,
        new Item.Properties()
        .group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_axe");
    
    public static final Item takunolo_pickaxe = new PickaxeItem(
        TakunologyItemTier.MATERIAL_TAKUNOLO, 4, 5.0f,
        new Item.Properties()
        .group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_pickaxe");

    public static final Item takunolo_shovel = new ShovelItem(
        TakunologyItemTier.MATERIAL_TAKUNOLO, 3, 5.0f,
        new Item.Properties()
        .group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_shovel");

    public static final Item takunolo_hoe = new HoeItem(
        TakunologyItemTier.MATERIAL_TAKUNOLO, 5.0f,
        new Item.Properties()
        .group(TakunologyItemGroup.takunologyItemGroup))
        .setRegistryName("takunolo_hoe");
}