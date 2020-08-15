package jp.takunology.takunologymod.init;

import jp.takunology.takunologymod.TakunologyMod;
import jp.takunology.takunologymod.blocks.DiceBlocks;
import jp.takunology.takunologymod.events.TakunologyItemGroup;
import jp.takunology.takunologymod.blocks.Ores;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(TakunologyMod.MOD_ID)
@Mod.EventBusSubscriber(modid = TakunologyMod.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(DiceBlocks.dice_one);
        event.getRegistry().register(Ores.takunolo_ore);
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(DiceBlocks.dice_one, new Item.Properties()
        .group(TakunologyItemGroup.takunologyItemGroup)
        .maxStackSize(64)).setRegistryName("dice_block"));
    }

    @SubscribeEvent
    public static void registerOreItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(Ores.takunolo_ore, new Item.Properties()
        .group(TakunologyItemGroup.takunologyItemGroup)
        .maxStackSize(64)).setRegistryName("takunolo_ore"));
    }
}