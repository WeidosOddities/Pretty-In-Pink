package com.weido.pretty_in_pink;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.weido.pretty_in_pink.registry.PNPBlocks;
import com.weido.pretty_in_pink.registry.PNPCreativeModeTabs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@Mod(PrettyInPink.MOD_ID)
public class PrettyInPink {
    public static final String MOD_ID = "pretty_in_pink";
    public static final String MOD_NAME = "Pretty In Pink";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static CreateRegistrate REGISTRATE;

    public PrettyInPink() {
        REGISTRATE = CreateRegistrate.create(MOD_ID)
                .defaultCreativeTab((ResourceKey<CreativeModeTab>) null);
        onCtor();
    }

    public static void onCtor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get()
                .getModEventBus();

        REGISTRATE.registerEventListeners(modEventBus);

        PNPCreativeModeTabs.register(modEventBus);
        PNPBlocks.register();

        modEventBus.addListener(PrettyInPink::init);
    }

    public static void init(final FMLCommonSetupEvent event) {
        LOGGER.info("{} initializing...", MOD_NAME);
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }
}
