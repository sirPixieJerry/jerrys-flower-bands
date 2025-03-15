package net.jerrys.jerrys_flower_bands;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.jerrys.jerrys_flower_bands.item.ModCreativeModTabs;
import net.jerrys.jerrys_flower_bands.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JerrysFlowerBands.MOD_ID)
public class JerrysFlowerBands {
    public static final String MOD_ID = "jerrys_flower_bands";
    private static final Logger LOGGER = LogUtils.getLogger();

    public JerrysFlowerBands(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM JERRY'S FLOWER BANDS!");
    }
}
