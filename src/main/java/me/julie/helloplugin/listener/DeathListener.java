package me.julie.helloplugin.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
    @EventHandler
    private void onDeath(PlayerDeathEvent event) {
        event.getEntity().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "YOU SUCK HAHA TRY AGAIN L");
    }
}