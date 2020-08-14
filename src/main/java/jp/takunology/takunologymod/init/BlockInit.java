package jp.takunology.takunologymod.init;

import jp.takunology.takunologymod.TakunologyMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(TakunologyMod.MOD_ID)
@Mod.EventBusSubscriber(modid = TakunologyMod.MOD_ID, bus = Bus.MOD)
public class BlockInit 
{

    public static final Block dice_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.create(Material.IRON)
        .hardnessAndResistance(0.5f, 15.0f)
        .sound(SoundType.SAND)).setRegistryName("dice_block"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(dice_block, new Item.Properties()
        .group(ItemGroup.BUILDING_BLOCKS)
        .maxStackSize(32)).setRegistryName("dice_block"));
    }
}