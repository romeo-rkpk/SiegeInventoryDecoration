package com.danvhae.minecraft.mod.siegeinventorydecoration.abstracts

import net.minecraft.command.ICommand
import net.minecraft.command.ICommandSender
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.server.MinecraftServer
import net.minecraft.util.math.BlockPos

abstract class InventoryCommandAbstract : ICommand {

    override fun compareTo(other: ICommand?): Int {
        other?:return 1
        return if(other.name == name)0 else 1
    }

    override fun getUsage(sender: ICommandSender): String {
        return ""
    }

    override fun getAliases(): MutableList<String> {
        return arrayListOf()
    }

    override fun checkPermission(server: MinecraftServer, sender: ICommandSender): Boolean {
        return sender is EntityPlayer
    }

    override fun isUsernameIndex(args: Array<out String>, index: Int): Boolean {
        return false
    }

    override fun getTabCompletions(
        server: MinecraftServer,
        sender: ICommandSender,
        args: Array<out String>,
        targetPos: BlockPos?
    ): MutableList<String> {
        return arrayListOf()
    }
}