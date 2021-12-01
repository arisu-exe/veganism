package io.github.fallOut015.veganism.world.item;

import io.github.fallOut015.veganism.MainVeganism;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsVeganism {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainVeganism.MODID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}