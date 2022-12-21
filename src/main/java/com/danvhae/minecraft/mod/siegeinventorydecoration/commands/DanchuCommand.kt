package com.danvhae.minecraft.mod.siegeinventorydecoration.commands

import com.danvhae.minecraft.mod.siegeinventorydecoration.abstracts.InventoryCommandAbstract
import com.danvhae.minecraft.mod.siegeinventorydecoration.handlers.ModGUIHandler
import net.minecraft.command.ICommandSender
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.server.MinecraftServer

class DanchuCommand : InventoryCommandAbstract() {
    override fun getName(): String {
        return "danchu"
    }

    override fun execute(server: MinecraftServer, sender: ICommandSender, args: Array<out String>) {
        val player = sender as? EntityPlayer?:return
        openGUI(player, ModGUIHandler.DANCHU)

    }
}