package net.ekks.testmod.Item;

import net.ekks.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            //A Long list of Items, and we will add the items to the list when forge loads the items
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> TOILETPAPER = ITEMS.register("toiletpaper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PHONE = ITEMS.register("phone",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
