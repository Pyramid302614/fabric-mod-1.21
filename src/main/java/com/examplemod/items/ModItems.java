package com.examplemod.items;

import com.examplemod.ExampleMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    //Items
    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings().fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(ExampleMod.MOD_ID,"test_item")))));

//

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM,Identifier.of(ExampleMod.MOD_ID,name)), item);
    }
    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering items for mod: " + ExampleMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST_ITEM);
        });
    }

}