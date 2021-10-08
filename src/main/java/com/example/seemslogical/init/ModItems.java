package com.example.seemslogical.init;

import com.example.seemslogical.SeemsLogical;
import com.example.seemslogical.item.BasicItem;
import it.unimi.dsi.fastutil.objects.AbstractObject2ObjectSortedMap;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AirItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.concurrent.Semaphore;

public class ModItems {

    public static CreativeModeTab SEEMSLOGICAL_ITEMTAB = new CreativeModeTab(SeemsLogical.MOD_ID) {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TEMP_ITEM);
        }

        @Override
        public boolean hasSearchBar() {
            return false;
        }
    };

    public static BasicItem TEMP_ITEM = new BasicItem(SeemsLogical.id("test_item"), (new Item.Properties().tab(SEEMSLOGICAL_ITEMTAB).stacksTo(64)));

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(TEMP_ITEM);
    }
}
