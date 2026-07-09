package com.c4tbox.astralith.item;

import com.c4tbox.astralith.Astralith;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Tool;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Astralith.MOD_ID);

    public static final DeferredItem<Item> ASTRAL_SHARD = ITEMS.register("astral_shard",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> ASTRALITH = ITEMS.register("astralith",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant()));
    public static final DeferredItem<Item> DEAL = ITEMS.register("deal",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().stacksTo(1)));
    public static final DeferredItem<Item> ASTRALITH_GLAIVE = ITEMS.register("astralith_glaive",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant().component(Tool)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
