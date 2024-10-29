package net.ekks.testmod.Item;

import net.ekks.testmod.TestMod;
import net.ekks.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PHONE.get()))
                        .title(Component.translatable("Custom Items"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.PHONE.get());
                            output.accept(ModItems.TOILETPAPER.get());
                            output.accept(ModItems.STAR.get());
                            output.accept(ModBlocks.STAR_ORE.get());
                            output.accept(ModBlocks.STAR_BLOCK.get());

                        })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
