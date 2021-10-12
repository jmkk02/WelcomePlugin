package me.julie.helloplugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {
    // "listens" for player leaving
    @EventHandler
    private void onLeave(PlayerQuitEvent event) {
        Bukkit.broadcastMessage(event.getPlayer().getDisplayName() + "has left the server. rip.");
    }
}
