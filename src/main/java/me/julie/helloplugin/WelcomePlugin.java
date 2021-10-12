package me.julie.helloplugin;

import me.julie.helloplugin.command.ByeCommand;
import me.julie.helloplugin.command.HelloCommand;
import me.julie.helloplugin.listener.DeathListener;
import me.julie.helloplugin.listener.JoinListener;
import me.julie.helloplugin.listener.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class WelcomePlugin extends JavaPlugin {
    @SuppressWarnings("ConstantConditions")
    @Override
    public void onEnable() {
        getCommand("hello").setExecutor(new HelloCommand());
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new QuitListener(), this);
        Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
        getCommand("bye").setExecutor(new ByeCommand());
    }
}