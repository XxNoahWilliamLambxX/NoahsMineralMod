package com.acidapple2006.noahsmineralmod.util;

import com.acidapple2006.noahsmineralmod.blocks.*;
import com.acidapple2006.noahsmineralmod.items.ItemBase;
import com.acidapple2006.noahsmineralmod.tools.ModItemTier;
import com.acidapple2006.noahsmineralmod.Main;
import net.minecraft.block.Block;
import net.minecraft.item.*;
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
    public static final RegistryObject<Item> AZURITE_INGOT =  ITEMS.register("azurite_ingot", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_SCRAP =  ITEMS.register("diamond_scrap", ItemBase::new);
    public static final RegistryObject<Item> LAPIS_SCRAP =  ITEMS.register("lapis_scrap", ItemBase::new);

    // Tools
    // Ruby Set
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
             new SwordItem(ModItemTier.RUBY, 0, -2.4f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, -2.4f, new Item.Properties().group(Main.TAB) ));
    // Azurite Set
    public static final RegistryObject<SwordItem> AZURITE_SWORD = ITEMS.register("azurite_sword", () ->
            new SwordItem(ModItemTier.AZURITE, 0, -2.4f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<PickaxeItem> AZURITE_PICKAXE = ITEMS.register("azurite_pickaxe", () ->
            new PickaxeItem(ModItemTier.AZURITE, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<HoeItem> AZURITE_HOE = ITEMS.register("azurite_hoe", () ->
            new HoeItem(ModItemTier.AZURITE, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<ShovelItem> AZURITE_SHOVEL = ITEMS.register("azurite_shovel", () ->
            new ShovelItem(ModItemTier.AZURITE, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<AxeItem> AZURITE_AXE = ITEMS.register("azurite_axe", () ->
            new AxeItem(ModItemTier.AZURITE, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    // Pink Opal Set
    public static final RegistryObject<SwordItem> PINK_OPAL_SWORD = ITEMS.register("pink_opal_sword", () ->
            new SwordItem(ModItemTier.PINKOPAL, 0, -2.4f, new Item.Properties().group(Main.TAB)));
    public static final RegistryObject<PickaxeItem> PINK_OPAL_PICKAXE = ITEMS.register("pink_opal_pickaxe", () ->
            new PickaxeItem(ModItemTier.PINKOPAL, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    // Pink Opal Set NEW
    public static final RegistryObject<HoeItem> PINK_OPAL_HOE = ITEMS.register("pink_opal_hoe", () ->
            new HoeItem(ModItemTier.PINKOPAL, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<ShovelItem> PINK_OPAL_SHOVEL = ITEMS.register("pink_opal_shovel", () ->
            new ShovelItem(ModItemTier.PINKOPAL, 0, -2.4f, new Item.Properties().group(Main.TAB) ));
    public static final RegistryObject<AxeItem> PINK_OPAL_AXE = ITEMS.register("pink_opal_axe", () ->
            new AxeItem(ModItemTier.PINKOPAL, 0, -2.4f, new Item.Properties().group(Main.TAB) ));

    // Blocks
    public static final RegistryObject<Block> AZURITE_ORE = BLOCKS.register("azurite_ore", AzuriteOre::new);
    public static final RegistryObject<Block> PINK_OPAL_ORE = BLOCKS.register("pink_opal_ore", PinkOpalOre::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> DYE_ORE = BLOCKS.register("dye_ore", DyeOre::new);
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = BLOCKS.register("nether_diamond_ore", NetherDiamondOre::new);
    public static final RegistryObject<Block> NETHER_LAPIS_ORE = BLOCKS.register("nether_lapis_ore", NetherLapisOre::new);

    // Block Items
    public static final RegistryObject<Item> AZURITE_ORE_ITEM = ITEMS.register("azurite_ore", () -> new BlockItemBase(AZURITE_ORE.get()));
    public static final RegistryObject<Item> PINK_OPAL_ORE_ITEM = ITEMS.register("pink_opal_ore", () -> new BlockItemBase(PINK_OPAL_ORE.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> DYE_ORE_ITEM = ITEMS.register("dye_ore", () -> new BlockItemBase(DYE_ORE.get()));
    public static final RegistryObject<Item> NETHER_DIAMOND_ORE_ITEM = ITEMS.register("nether_diamond_ore", () -> new BlockItemBase(NETHER_DIAMOND_ORE.get()));
    public static final RegistryObject<Item> NETHER_LAPIS_ORE_ITEM = ITEMS.register("nether_lapis_ore", () -> new BlockItemBase(NETHER_LAPIS_ORE.get()));

}
