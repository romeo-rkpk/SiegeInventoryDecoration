package com.danvhae.minecraft.mod.siegeinventorydecoration.commands

import com.danvhae.minecraft.mod.siegeinventorydecoration.SiegeInventoryDecoration
import com.danvhae.minecraft.mod.siegeinventorydecoration.abstracts.InventoryCommandAbstract
import com.danvhae.minecraft.mod.siegeinventorydecoration.handlers.ModGUIHandler
import net.minecraft.command.ICommandSender
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.server.MinecraftServer

class BoravCommand : InventoryCommandAbstract() {
    override fun getName(): String {
        return "borav"
    }

    override fun execute(server: MinecraftServer, sender: ICommandSender, args: Array<out String>) {
        val player = sender as? EntityPlayer ?:return
        player.openGui(SiegeInventoryDecoration.INSTANCE, ModGUIHandler.BORAV,
            player.world, player.posX.toInt(), player.posY.toInt(), player.posZ.toInt()
        )
    }
}