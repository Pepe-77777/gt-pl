package br.com.pepe.GunthMC;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import br.com.pepe.GunthMC.events.Events;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	public String prefix = ChatColor.BLACK + "[" + ChatColor.RED + "GunthMC" + ChatColor.BLACK + "]";
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.DARK_GRAY + " Plugin iniciado.");
		
		registerEvents();
		registerCommands();
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.DARK_GRAY + " Plugin desligado.");
		
	}
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Events(), this);
	}
	
	public void registerCommands() {
		getCommand("GunthMC").setExecutor(new Executor());
		getCommand("PluginInfo").setExecutor(new Executor2());
	}
	
	public String getPrefix() {
		return prefix;
	}
	
}
