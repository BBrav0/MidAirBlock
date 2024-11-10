package com.midairblock;

import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;

public class Command implements CommandExecutor{


    @Override
    public boolean onCommand(@NotNull CommandSender arg0, org.bukkit.command.@NotNull Command arg1,
            @NotNull String arg2, @NotNull String[] arg3) {

                if (arg0 instanceof Player p) {
                    ItemStack wand = new ItemStack(Material.STICK);
                    ItemMeta m = wand.getItemMeta();
                    m.displayName(Component.text("MAB Wand").color(NamedTextColor.AQUA));
                    wand.setItemMeta(m);
                    p.getInventory().addItem(wand);
                }
                else {
                    arg0.sendMessage("You must be a player to run this command.");
                }

                return true;
    }

    private @Nullable ItemMeta displayName(TextComponent color) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayName'");
    }

    

}
