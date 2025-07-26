package com.weido.pretty_in_pink.registry;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.weido.pretty_in_pink.PrettyInPink;
import it.unimi.dsi.fastutil.objects.*;
import net.createmod.catnip.platform.CatnipServices;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.CreativeModeTab.DisplayItemsGenerator;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Predicate;

public class PNPCreativeModeTabs {
    //Copied from Create's Creative Mode Tab Implementation
    private static final DeferredRegister<CreativeModeTab> REGISTER =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrettyInPink.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BASE_CREATIVE_TAB = REGISTER.register("base",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.pretty_in_pink.base"))
            .withTabsBefore(AllCreativeModeTabs.PALETTES_CREATIVE_TAB.getKey())
            .icon(PNPBlocks.PINK_STEEL_BLOCK::asStack)
            .displayItems(new RegistrateDisplayItemGenerator(PNPCreativeModeTabs.BASE_CREATIVE_TAB))
            .build());

    @ApiStatus.Internal
    public static void register(IEventBus modEventBus) {
        REGISTER.register(modEventBus);
    }

    private record RegistrateDisplayItemGenerator(DeferredHolder<CreativeModeTab, CreativeModeTab> tabFilter) implements DisplayItemsGenerator {
        public static final Predicate<Item> IS_ITEM_3D_PREDICATE;

        static {
            MutableObject<Predicate<Item>> isItem3d = new MutableObject<>(item -> false);
            if (CatnipServices.PLATFORM.getEnv().isClient())
                isItem3d.setValue(item -> {
                    ItemRenderer itemRenderer = Minecraft.getInstance()
                        .getItemRenderer();
                    BakedModel model = itemRenderer.getModel(new ItemStack(item), null, null, 0);
                    return model.isGui3d();
                });
            IS_ITEM_3D_PREDICATE = isItem3d.getValue();
        }

        @Override
        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters parameters, CreativeModeTab.@NotNull Output output) {
            List<Item> items = collectBlocks();
            outputAll(output, items);
        }

        private List<Item> collectBlocks() {
            List<Item> items = new ReferenceArrayList<>();
            for (RegistryEntry<Block, Block> entry : PrettyInPink.registrate().getAll(Registries.BLOCK)) {
                if (!CreateRegistrate.isInCreativeTab(entry, tabFilter))
                    continue;
                Item item = entry.get().asItem();
                if (item != Items.AIR)
                    items.add(item);
            }
            return items;
        }

        private static void outputAll(CreativeModeTab.Output output, List<Item> items) {
            for (Item item : items) {
                output.accept(new ItemStack(item), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
    }
}