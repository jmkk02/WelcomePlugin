package me.julie.helloplugin.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HelloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                             @NotNull String label, @NotNull String[] args) {
        // /give julie iron
        // label = give
        // args = julie, iron
        if (sender instanceof Player) {
            // if player wrote command
            final Player player = (Player) sender;
            sender.sendMessage("hello " + player.getName() + "! You are in GroovyMoon's " + player.getWorld().getName());
            return true; // stop code
        }
        // if non-player wrote command
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "This is GroovyMoon from Minecraft.");
        return true;
    }
}