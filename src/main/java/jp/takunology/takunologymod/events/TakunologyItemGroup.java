package jp.takunology.takunologymod.events;

import jp.takunology.takunologymod.blocks.DiceBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TakunologyItemGroup extends ItemGroup
{
    public static final TakunologyItemGroup takunologyItemGroup 
    = new TakunologyItemGroup(ItemGroup.GROUPS.length, "takunologymod");

    private TakunologyItemGroup(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(DiceBlocks.dice_one);
    }

    
}