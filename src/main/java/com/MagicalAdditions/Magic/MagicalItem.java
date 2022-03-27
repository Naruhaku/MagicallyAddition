package com.MagicalAdditions.Magic;

import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;

public class MagicalItem extends Item
{
    boolean mode;
    
    public MagicalItem(final String name, final String texture, final int maxStackSize) {
        this.mode = false;
        this.canRepair = false;
        this.setUnlocalizedName(name);
        this.setTextureName("magicaladditions:" + texture);
        this.setCreativeTab(Main.tabMagicalThings);
        this.maxStackSize = maxStackSize;
        GameRegistry.registerItem(this, name);
    }
}
