package com.weido.pretty_in_pink;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.weido.pretty_in_pink.registry.PNPBlocks;
import com.weido.pretty_in_pink.registry.PNPCreativeModeTabs;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

import net.neoforged.fml.common.Mod;
import org.slf4j.LoggerFactory;

@Mod(PrettyInPink.MOD_ID)
public class PrettyInPink {
    public static final String MOD_ID = "pretty_in_pink";
    public static final String MOD_NAME = "Pretty In Pink";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID)
            .defaultCreativeTab((ResourceKey<CreativeModeTab>) null);

    public PrettyInPink(IEventBus eventBus) {
        onCtor(eventBus);
    }

    public static void onCtor(IEventBus modEventBus) {
        REGISTRATE.registerEventListeners(modEventBus);
        PNPCreativeModeTabs.register(modEventBus);
        PNPBlocks.register();

        modEventBus.addListener(PrettyInPink::init);
    }

    public static void init(final FMLCommonSetupEvent event) {
        LOGGER.info("{} initializing...", MOD_NAME);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }
}
