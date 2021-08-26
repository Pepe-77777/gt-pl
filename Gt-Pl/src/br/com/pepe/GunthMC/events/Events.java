package br.com.pepe.GunthMC.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class Events implements Listener {
	
	@EventHandler
	public void aoEntrar(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage(null);
		
		if (p.hasPermission("nte.owner")) {
			for(Player p2 : Bukkit.getOnlinePlayers()){
			    if(p2.getWorld().getName().equals("lobby")){
			        p2.sendMessage(ChatColor.GRAY + "O dono " + ChatColor.RED + p2.getName() + ChatColor.GRAY + " entrou no lobby!");
			    }
			}
		}
		

	}
	
	@EventHandler
	public void aoSair(PlayerQuitEvent e) {
		e.setQuitMessage(null);
	}
	
}
