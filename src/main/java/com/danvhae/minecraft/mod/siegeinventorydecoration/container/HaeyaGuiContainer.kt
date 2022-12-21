package com.danvhae.minecraft.mod.siegeinventorydecoration.container

import com.danvhae.minecraft.mod.siegeinventorydecoration.SiegeInventoryDecoration
import com.danvhae.minecraft.mod.siegeinventorydecoration.abstracts.ContainerGUIAbstract
import net.minecraft.inventory.Container
import net.minecraft.util.ResourceLocation

class HaeyaGuiContainer(inventorySlotsIn: Container) : ContainerGUIAbstract(inventorySlotsIn) {
    override fun texture(): ResourceLocation {
        return ResourceLocation(SiegeInventoryDecoration.MOD_ID, "haeya.png")
    }

}