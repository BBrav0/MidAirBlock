package com.midairblock;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command command,
            @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player p) {
            p.getInventory().addItem(Main.wand);
        } else {
            sender.sendMessage("You must be a player to run this command.");
        }

        return true;
    }
}