package org.devathon.contest2016;

import org.bukkit.plugin.java.JavaPlugin;

public class DevathonPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new SkeletonHandler(this), this);
        getLogger().info("Ex0 Suits Engaged");
    }

    @Override
    public void onDisable() {
        getLogger().info("Ex0 Suits Disengaged.");
    }
}

