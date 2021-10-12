package me.julie.helloplugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    // "listens" for player joining
    @EventHandler
    private void onJoin(PlayerJoinEvent event) {
        Bukkit.broadcastMessage("Player " + event.getPlayer().getName() + " joined!");
    }
}