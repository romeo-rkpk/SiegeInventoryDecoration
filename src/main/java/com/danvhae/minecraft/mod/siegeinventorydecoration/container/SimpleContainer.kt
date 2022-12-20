package com.danvhae.minecraft.mod.siegeinventorydecoration.container

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.inventory.Container
import net.minecraft.inventory.Slot

class SimpleContainer(val playerInv:InventoryPlayer, ratio:Double=1.0): Container() {
    override fun canInteractWith(playerIn: EntityPlayer): Boolean {
        return true
    }

    init{

        //row 0 -> 3, 1 -> 0
        for(row in 0..3)
            for(col in 0..8){
                val index = col + row * 9
                val xPos = (col + 2) * 18 + 8
                val yPos = ((row + 3) % 4 + 4) * 18 + 84
                addSlotToContainer(Slot(playerInv, index, xPos, yPos))
            }
    }


}