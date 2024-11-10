package com.midairblock;

import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;


public class Main extends JavaPlugin{

    @Override
    public void onLoad() {
        getLogger().info("Mid air block has been loaded");
    }

    @Override
    public void onEnable() {
        getLogger().info("Mid air block has been enabled");
        getServer().getPluginManager().registerEvents(new MyListener(), this);

        getCommand("midairblock").setExecutor(new Command());

        
    }

    @Override
    public void onDisable() {
        getLogger().info("Mid air block has been disabled");
    }
}