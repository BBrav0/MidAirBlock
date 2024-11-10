package com.midairblock;

import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command command,
            @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player p) {

            ItemStack wand = new ItemStack(Material.STICK);
            ItemMeta meta = wand.getItemMeta();
            meta.displayName(Component.text("MAB Wand").color(NamedTextColor.AQUA));
            wand.setItemMeta(meta);
            p.getInventory().addItem(wand);
        } else {
            sender.sendMessage("You must be a player to run this command.");
        }

        return true;
    }
}