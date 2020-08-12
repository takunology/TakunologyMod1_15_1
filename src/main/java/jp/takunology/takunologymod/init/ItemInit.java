package jp.takunology.takunologymod.init;

import jp.takunology.takunologymod.TakunologyMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.item.Food;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TakunologyMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(TakunologyMod.MOD_ID)
public class ItemInit
{
    public static final Item riceball = null;
    public static final Item curry_rice = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD)).setRegistryName("riceball"));
        
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.FOOD)
        .food(new Food.Builder().hunger(2).saturation(1.4f).setAlwaysEdible()
        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 600, 1), 0.8f).build()))
        .setRegistryName("curry_rice"));
    
    }
}