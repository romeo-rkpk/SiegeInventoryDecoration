package com.danvhae.minecraft.mod.siegeinventorydecoration.handlers

import com.danvhae.minecraft.mod.siegeinventorydecoration.container.BoravGUIContainer
import com.danvhae.minecraft.mod.siegeinventorydecoration.container.SimpleContainer
import net.minecraft.client.gui.inventory.GuiContainer
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.inventory.Container
import net.minecraft.world.World
import net.minecraftforge.fml.common.network.IGuiHandler

class ModGUIHandler : IGuiHandler{

    companion object{
        const val BORAV = 2
    }
    override fun getServerGuiElement(ID: Int, player: EntityPlayer?, world: World?, x: Int, y: Int, z: Int): Container? {
        return when(ID){
            BORAV -> SimpleContainer(player?.inventory?:return null, 0.1)
            else -> null
        }
    }

    override fun getClientGuiElement(ID: Int, player: EntityPlayer?, world: World?, x: Int, y: Int, z: Int): GuiContainer? {
        return when(ID){
            BORAV -> BoravGUIContainer(getServerGuiElement(ID, player, world, x, y, z)!!)
            else -> null
        }
    }
}