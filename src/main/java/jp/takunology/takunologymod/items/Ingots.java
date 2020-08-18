package jp.takunology.takunologymod.items;

import jp.takunology.takunologymod.events.TakunologyItemGroup;

import net.minecraft.item.Item;

public class Ingots 
{
    public static final Item takunolo_ingot = new Item(new Item.Properties()
    .group(TakunologyItemGroup.takunologyItemGroup))
    .setRegistryName("takunolo_ingot");

    public static final Item lightning_ingot = new Item(new Item.Properties()
    .group(TakunologyItemGroup.takunologyItemGroup))
    .setRegistryName("lightning_ingot");
}