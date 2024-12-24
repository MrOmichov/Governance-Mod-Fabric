package org.mromichov.governancemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.mromichov.governancemod.GovernanceMod;

public class ModItems {
    public static final Item CARD = registerItem("card", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GovernanceMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GovernanceMod.LOGGER.info("Registering Mod Items for " + GovernanceMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(CARD);
        });
    }
}
