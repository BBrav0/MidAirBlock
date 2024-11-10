package com.midairblock;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class MyListener implements Listener{

    @EventHandler public void onWandSwing(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        ItemStack w = new ItemStack(Material.STICK);
        ItemMeta m = w.getItemMeta();
        m.displayName(Component.text("MAB Wand").color(NamedTextColor.AQUA));
        w.setItemMeta(m);

        if (e.getAction() ==Action.LEFT_CLICK_AIR && p.getPlayer().getInventory().getItemInMainHand().equals(w)) {
            Block b = p.getTargetBlock(null, 3);
            if (b.getType()==Material.AIR) {
                b.setType(Material.STONE);
            }
        } 
    }

}
