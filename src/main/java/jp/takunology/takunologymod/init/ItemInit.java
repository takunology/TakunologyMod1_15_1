package jp.takunology.takunologymod.init;

import jp.takunology.takunologymod.TakunologyMod;
import jp.takunology.takunologymod.items.Foods;
import jp.takunology.takunologymod.items.Ingots;
import jp.takunology.takunologymod.tools.TakunoloTools;
import jp.takunology.takunologymod.armor.TakunoloArmor;
import jp.takunology.takunologymod.items.TimesetItems;
import jp.takunology.takunologymod.tools.ArrowSword;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TakunologyMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(TakunologyMod.MOD_ID)
public class ItemInit
{
    @SubscribeEvent
    public static void registerFoods(final RegistryEvent.Register<Item> event)
    {       
        event.getRegistry().register(Foods.riceball);
        event.getRegistry().register(Foods.curry_rice);
        event.getRegistry().register(Foods.pizza);
    }

    @SubscribeEvent
    public static void registerTimesetItems(final RegistryEvent.Register<Item> event)
    {       
        event.getRegistry().register(TimesetItems.night_flower);
        event.getRegistry().register(TimesetItems.noon_flower);
    }

    @SubscribeEvent
    public static void registerIngots(final RegistryEvent.Register<Item> event)
    {       
        event.getRegistry().register(Ingots.takunolo_ingot);
        event.getRegistry().register(Ingots.lightning_ingot);
    }

    @SubscribeEvent
    public static void registerTools(final RegistryEvent.Register<Item> event)
    {       
        event.getRegistry().register(TakunoloTools.takunolo_sword);
        event.getRegistry().register(TakunoloTools.takunolo_axe);
        event.getRegistry().register(TakunoloTools.takunolo_pickaxe);
        event.getRegistry().register(TakunoloTools.takunolo_shovel);
        event.getRegistry().register(TakunoloTools.takunolo_hoe);
    }

    @SubscribeEvent
    public static void registerArmor(final RegistryEvent.Register<Item> event)
    {       
        event.getRegistry().register(TakunoloArmor.takunolo_helmet);
        event.getRegistry().register(TakunoloArmor.takunolo_chest);
        event.getRegistry().register(TakunoloArmor.takunolo_legs);
        event.getRegistry().register(TakunoloArmor.takunolo_feet);

        event.getRegistry().register(ArrowSword.arrow_sword);
    }
}