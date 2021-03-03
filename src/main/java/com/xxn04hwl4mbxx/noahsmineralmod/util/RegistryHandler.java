package com.xxn04hwl4mbxx.noahsmineralmod.util;

import com.xxn04hwl4mbxx.noahsmineralmod.Main;
import com.xxn04hwl4mbxx.noahsmineralmod.blocks.*;
import com.xxn04hwl4mbxx.noahsmineralmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RUBY_INGOT =  ITEMS.register("ruby_ingot", ItemBase::new);
    public static final RegistryObject<Item> PINK_OPAL_INGOT =  ITEMS.register("pink_opal_ingot", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT =  ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> AZURITE_INGOT =  ITEMS.register("azurite_ingot", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> AZURITE_ORE = BLOCKS.register("azurite_ore", AzuriteOre::new);
    public static final RegistryObject<Block> PINK_OPAL_ORE = BLOCKS.register("pink_opal_ore", PinkOpalOre::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", CopperOre::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> DYE_ORE = BLOCKS.register("dye_ore", DyeOre::new);
    // new
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = BLOCKS.register("nether_diamond_ore", NetherDiamondOre::new);
    public static final RegistryObject<Block> NETHER_LAPIS_ORE = BLOCKS.register("nether_lapis_ore", NetherLapisOre::new);



    // Block Items
    public static final RegistryObject<Item> AZURITE_ORE_ITEM = ITEMS.register("azurite_ore", () -> new BlockItemBase(AZURITE_ORE.get()));
    public static final RegistryObject<Item> PINK_OPAL_ORE_ITEM = ITEMS.register("pink_opal_ore", () -> new BlockItemBase(PINK_OPAL_ORE.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> DYE_ORE_ITEM = ITEMS.register("dye_ore", () -> new BlockItemBase(DYE_ORE.get()));
    // new
    public static final RegistryObject<Item> NETHER_DIAMOND_ORE_ITEM = ITEMS.register("nether_diamond_ore", () -> new BlockItemBase(NETHER_DIAMOND_ORE.get()));
    public static final RegistryObject<Item> NETHER_LAPIS_ORE_ITEM = ITEMS.register("nether_lapis_ore", () -> new BlockItemBase(NETHER_LAPIS_ORE.get()));

}
