package com.danvhae.minecraft.mod.siegeinventorydecoration.commands

import net.minecraft.command.ICommand
import net.minecraft.command.ICommandSender
import net.minecraft.server.MinecraftServer
import net.minecraft.util.math.BlockPos
import net.minecraft.util.text.TextComponentString

class TestCommand :ICommand{

    companion object{
        const val CMD_STR = "dvh-test"
    }

    override fun compareTo(other: ICommand?): Int {
        return when(other?.name){
            name -> 0
            else ->1
        }
    }

    override fun getName(): String {
        return CMD_STR
    }

    override fun getUsage(sender: ICommandSender): String {
        return "몰?.루"
    }

    override fun getAliases(): MutableList<String> {
        return arrayListOf()
    }

    override fun execute(server: MinecraftServer, sender: ICommandSender, args: Array<out String>) {
        sender.sendMessage(TextComponentString("just §atest command"))
    }

    override fun checkPermission(server: MinecraftServer, sender: ICommandSender): Boolean {
        return true
    }

    override fun getTabCompletions(
        server: MinecraftServer,
        sender: ICommandSender,
        args: Array<out String>,
        targetPos: BlockPos?
    ): MutableList<String> {
        return arrayListOf()
    }

    override fun isUsernameIndex(args: Array<out String>, index: Int): Boolean {
        return false
    }
}