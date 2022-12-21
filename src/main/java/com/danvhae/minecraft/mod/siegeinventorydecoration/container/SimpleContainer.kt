package com.danvhae.minecraft.mod.siegeinventorydecoration.container

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.inventory.Container
import net.minecraft.inventory.Slot

class SimpleContainer(val playerInv:InventoryPlayer): Container() {

    companion object{
        private const val X0 = 16
        private const val Y0 = 138
        private const val DX = 26
        private const val DY = 27
    }
    override fun canInteractWith(playerIn: EntityPlayer): Boolean {
        return true
    }

    init{

        //row 0 -> 3, 1 -> 0
        for(row in 0..3)
            for(col in 0..8){
                val index = col + row * 9
                val xPos = col * DX + X0
                val yPos = ((row + 3) % 4) * DY + Y0
                addSlotToContainer(Slot(playerInv, index, xPos, yPos))
            }
    }


}