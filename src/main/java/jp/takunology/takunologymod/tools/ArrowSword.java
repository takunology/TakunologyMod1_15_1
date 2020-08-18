package jp.takunology.takunologymod.tools;

import jp.takunology.takunologymod.events.TakunologyItemGroup;
import jp.takunology.takunologymod.tools.ModToolBase.ThunderItemTier;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ArrowSword extends SwordItem {

     public static Item arrow_sword = new ArrowSword (
     ThunderItemTier.MATERIAL_Thunder, 10, 5.0f, new Item.Properties()
     .group(TakunologyItemGroup.takunologyItemGroup))
     .setRegistryName("arrow_sword");
     

    public ArrowSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) 
    {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) 
    {
        for (int i = 0; i < 16; i++) {
            ArrowEntity arrowentity = new ArrowEntity(worldIn, playerIn);
            arrowentity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 2.0F, 30.0F);
            worldIn.addEntity(arrowentity);
        }
    
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }



        /*LightningBoltEntity lightning = new LightningBoltEntity(worldIn,
        playerIn.prevPosX + 10 , playerIn.prevPosY, playerIn.prevPosZ, false);

        lightning.tick();
        lightning.onStruckByLightning(lightning);*/
}

