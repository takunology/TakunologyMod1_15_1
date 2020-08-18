package jp.takunology.takunologymod.items;

import jp.takunology.takunologymod.events.TakunologyItemGroup;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class TimesetItems extends Item
{
    
    public static final Item night_flower = new TimesetItems(new Item.Properties()
    .group(TakunologyItemGroup.takunologyItemGroup))
    .setRegistryName("night_flower");

    public static final Item noon_flower = new TimesetItems(new Item.Properties()
    .group(TakunologyItemGroup.takunologyItemGroup))
    .setRegistryName("noon_flower");

    public TimesetItems(Properties properties) 
    {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(stack.getItem().equals(night_flower)) 
        {
            tooltip.add(new StringTextComponent("time set night flower"));
        }
        else if(stack.getItem().equals(noon_flower)) 
        {
            tooltip.add(new StringTextComponent("time set noon flower"));
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(playerIn.getHeldItemMainhand().getItem().equals(night_flower))
        {
            worldIn.setDayTime(18000);
        }
        else if(playerIn.getHeldItemMainhand().getItem().equals(noon_flower))
        {
            worldIn.setDayTime(6000);
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}