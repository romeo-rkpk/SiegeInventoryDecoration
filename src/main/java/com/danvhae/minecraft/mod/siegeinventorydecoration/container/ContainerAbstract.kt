package com.danvhae.minecraft.mod.siegeinventorydecoration.container

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.inventory.Container
import net.minecraft.inventory.Slot

abstract class ContainerAbstract(val playerInv:InventoryPlayer): Container() {
    override fun canInteractWith(playerIn: EntityPlayer): Boolean {
        return true
    }

    init{
        for(row in 0..3)
            for(col in 0..8){
                val index = col + row * 9
                val xPos = col * 18 + 8
                val yPos = row * 18 + 84
                addSlotToContainer(Slot(playerInv, index, xPos, yPos))
            }
    }

}