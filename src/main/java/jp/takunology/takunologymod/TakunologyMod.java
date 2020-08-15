package jp.takunology.takunologymod;

import jp.takunology.takunologymod.world.TakunoloOreGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("takunologymod")
public class TakunologyMod
{
    public static final String MOD_ID = "takunologymod";
    public static TakunologyMod instance;

    public TakunologyMod() 
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        instance = this;

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        TakunoloOreGen.generateOre();
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {

    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {

    }

}
