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

public class MyListener implements Listener {

    private final ItemStack wand;

    public MyListener() {
        // Initialize the wand once to avoid creating a new instance every time.
        wand = new ItemStack(Material.STICK);
        ItemMeta meta = wand.getItemMeta();
        meta.displayName(Component.text("MAB Wand").color(NamedTextColor.AQUA));
        wand.setItemMeta(meta);
    }

    @EventHandler
    public void onWandSwing(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack mainHandItem = player.getInventory().getItemInMainHand();

        // Check if the player is holding the wand
        if (e.getAction() == Action.LEFT_CLICK_AIR && mainHandItem.getType() == Material.STICK ) {

            // Get the targeted block within 3 blocks
            Block targetBlock = player.getTargetBlockExact(3);
            if (targetBlock != null && targetBlock.getType() == Material.AIR) {
                targetBlock.setType(Material.STONE);
            }
        }
    }
}