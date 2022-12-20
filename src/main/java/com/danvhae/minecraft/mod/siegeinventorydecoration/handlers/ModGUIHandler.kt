package com.danvhae.minecraft.mod.siegeinventorydecoration.handlers

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.world.World
import net.minecraftforge.fml.common.network.IGuiHandler

class ModGUIHandler : IGuiHandler{

    companion object{
        const val BORAV = 2
    }
    override fun getServerGuiElement(ID: Int, player: EntityPlayer?, world: World?, x: Int, y: Int, z: Int): Any? {
        TODO("Not yet implemented")
    }

    override fun getClientGuiElement(ID: Int, player: EntityPlayer?, world: World?, x: Int, y: Int, z: Int): Any? {
        TODO("Not yet implemented")
    }
}