package com.midairblock;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MyListener implements Listener {


    @EventHandler
    public void onWandSwing(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() == Action.LEFT_CLICK_AIR ) {

            // Get the targeted block within 3 blocks
            Block b = p.getTargetBlock(null, 4);
            if (b.getType() == Material.AIR && p.getInventory().getItemInMainHand().equals(Main.wand) && p.hasPermission("midairblock.use")) {
                b.setType(Material.STONE);
                p.playSound(b.getLocation(), Sound.BLOCK_STONE_PLACE, 1.0f, 0.9f);
            }
        }
    }
}