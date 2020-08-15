package jp.takunology.takunologymod.init;

import jp.takunology.takunologymod.TakunologyMod;
import jp.takunology.takunologymod.items.Foods;
import jp.takunology.takunologymod.items.Ingots;
import jp.takunology.takunologymod.tools.TakunoloTools;

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
    public static void registerIngots(final RegistryEvent.Register<Item> event)
    {       
        event.getRegistry().register(Ingots.takunolo_ingot);
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
}