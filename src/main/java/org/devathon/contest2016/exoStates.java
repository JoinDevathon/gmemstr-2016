package org.devathon.contest2016;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

public class exoStates {

	static Map<String, String> playersInExo = new HashMap<String, String>();
	
	public static void setPlayerInExo(Player player){
		playersInExo.put(player.getDisplayName(), "normal");
	}
	
	public static void removePlayerInExo(Player player){
		playersInExo.remove(player.getDisplayName());
	}
	
}
