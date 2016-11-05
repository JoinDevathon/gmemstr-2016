/*
 * SkeletonHandler.java
 * 
 * Handles basic equipment and functions of Ex0 armor suit
 */

package org.devathon.contest2016;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;


public class SkeletonHandler implements Listener {
	
	DevathonPlugin plugin;
	
	ItemStack[] exoSuit = new ItemStack[] {
				new ItemStack(Material.CHAINMAIL_BOOTS), // Ex0 Suit ItemStack
				new ItemStack(Material.CHAINMAIL_LEGGINGS),
				new ItemStack(Material.CHAINMAIL_CHESTPLATE),
				new ItemStack(Material.CHAINMAIL_HELMET)
			};
	
	public SkeletonHandler(DevathonPlugin passedPlugin){
		this.plugin = passedPlugin;
	}
	
	/*
	 * When the player right clicks with the Elytra named "Ex0 Deploy",
	 * give them full chain armor and put them into "Ex0 Mode"
	 * 
	 * Could optionally add listener if player equips all the chainmail
	 * but I can't use public code and I only have *checks time* 21 hours
	 * 
	 * TODO: Failsafe hidden lore to counter counterfeits on Elytra
	 */
	@EventHandler
	public void onExoEquip(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		if(player.getInventory().getItemInMainHand().getType() == Material.ELYTRA &&
				player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() == "Ex0 Deploy"){
			plugin.getLogger().info(player.getDisplayName());
			
			player.getInventory().setArmorContents(exoSuit);
			exoStates.setPlayerInExo(player);
			player.sendMessage("Ex0 Suit Equipped");
		}
	}
	
}
