package com.midairblock;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;




public class Main extends JavaPlugin{

    public static ItemStack wand;

    @Override
    public void onLoad() {
        getLogger().info("Mid air block has been loaded");
    }

    @Override
    public void onEnable() {
        wand = new ItemStack(Material.STICK);
        ItemMeta meta = wand.getItemMeta();
        meta.displayName(Component.text("MAB Wand").color(NamedTextColor.AQUA));
        meta.addEnchant(Enchantment.UNBREAKING, 10, true);
        wand.setItemMeta(meta);


        getLogger().info("Mid air block has been enabled");
        getServer().getPluginManager().registerEvents(new MyListener(), this);
        getCommand("midairblock").setExecutor(new Command());

        
        
    }

    @Override
    public void onDisable() {
        getLogger().info("Mid air block has been disabled");
    }
}