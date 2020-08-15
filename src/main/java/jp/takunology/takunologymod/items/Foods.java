package jp.takunology.takunologymod.items;

import jp.takunology.takunologymod.events.TakunologyItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods 
{
    public static final Item riceball = new Item(new Item.Properties()
    .group(TakunologyItemGroup.takunologyItemGroup)
    .food(new Food.Builder().hunger(4).saturation(1.4f).setAlwaysEdible().build()))
    .setRegistryName("riceball");
    
    public static final Item curry_rice = new Item(new Item.Properties()
    .group(TakunologyItemGroup.takunologyItemGroup)
    .food(new Food.Builder().hunger(8).saturation(1.4f).setAlwaysEdible()
    .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 600, 2), 0.8f).build()))
    .setRegistryName("curry_rice");

    public static final Item pizza = new Item(new Item.Properties()
    .group(TakunologyItemGroup.takunologyItemGroup)
    .food(new Food.Builder().hunger(6).saturation(1.4f).setAlwaysEdible().build()))
    .setRegistryName("pizza");
}