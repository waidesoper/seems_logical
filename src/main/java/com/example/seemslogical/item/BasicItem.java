package com.example.seemslogical.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class BasicItem extends Item {

    public BasicItem(ResourceLocation id, Properties properties) {
        super(properties);

        this.setRegistryName(id);
    }
}
