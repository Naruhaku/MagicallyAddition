package com.MagicalAdditions.Magic;

import cpw.mods.fml.common.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.event.*;

@Mod(modid = "magicaladditions", name = "Magical Additions", version = "1.0")
public class Main
{
    @SidedProxy(clientSide = "com.MagicalAdditions.Magic.ClientProxy", serverSide = "com.MagicalAdditions.Magic.ServerProxy")
    public static ServerProxy proxy;
    public static CreativeTabs tabMagicalThings;
    public static final String MODID = "magicaladditions";
    public static final String MODNAME = "Magical Additions";
    public static final String VERSION = "1.0";
    public static final String CLIENTSIDE = "com.MagicalAdditions.Magic.ClientProxy";
    public static final String SERVERSIDE = "com.MagicalAdditions.Magic.ServerProxy";
    public static Item Rune1;
    public static Item Rune2;
    public static Item Rune3;
    public static Item Rune4;
    public static Item Rune5;
    public static Item Rune6;
    public static Item Rune7;
    public static Item Rune8;
    public static Item Rune9;
    public static Item Rune10;
    public static Item Alchemyore;
    public static Item Alchemystone;
    
    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
    }
    
    @Mod.EventHandler
    public void Init(FMLPostInitializationEvent event) {
        tabMagicalThings = new CreativeTabs("magicaladditions") {
            public Item getTabIconItem() {
                return Alchemystone;
            }
        };
        Rune1 = new MagicalItem("rune1", "rune1", 1);
        Rune2 = new MagicalItem("rune2", "rune2", 1);
        Rune3 = new MagicalItem("rune3", "rune3", 1);
        Rune4 = new MagicalItem("rune4", "rune4", 1);
        Rune5 = new MagicalItem("rune5", "rune5", 1);
        Rune6 = new MagicalItem("rune6", "rune6", 1);
        Rune7 = new MagicalItem("rune7", "rune7", 1);
        Rune8 = new MagicalItem("rune8", "rune8", 1);
        Rune9 = new MagicalItem("rune9", "rune9", 1);
        Rune10 = new MagicalItem("rune10", "rune10", 1);
        Alchemyore = new MagicalItem("alchemyore", "alchemyore", 1);
        Alchemystone = new MagicalItemAlchemyStone("alchemystone", "alchemystone", 1);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
