package com.MagicalAdditions.Magic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MagicalItemAlchemyStone extends Item
{
    boolean mode;

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
        return false;
    }

    public MagicalItemAlchemyStone(final String name, final String texture, final int maxStackSize) {
        this.mode = false;
        this.canRepair = false;
        this.setUnlocalizedName(name);
        this.setTextureName("magicaladditions:" + texture);
        this.setCreativeTab(Main.tabMagicalThings);
        this.maxStackSize = maxStackSize;
        setContainerItem(this);
        GameRegistry.registerItem(this, name);
    }
}