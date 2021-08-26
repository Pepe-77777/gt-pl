package br.com.pepe.GunthMC;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class GunthMC {

	public static void gunthmc (Player p) {
		p.sendMessage(ChatColor.GOLD + "Sejá bem vindo ao " + ChatColor.RED + "" + ChatColor.BOLD + "GunthMC" + ChatColor.RESET + "" + ChatColor.GOLD + "!");
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/gt " + ChatColor.RESET + "" + ChatColor.GOLD + "Vejá os comandos.");
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/tag [player] [tag] " + ChatColor.RESET + "" + ChatColor.GOLD + "Sete uma tag [requer admin para cima.]");
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/gm [número do gamemode] " + ChatColor.RESET + "" + ChatColor.GOLD + "Shortcut de GAMEMODE [requer ajudante para cima.]");
		p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "/serverinfo " + ChatColor.RESET + "" + ChatColor.GOLD + "Vejá as informações do server");
		p.sendMessage(ChatColor.GRAY +""+ ChatColor.ITALIC + "Plugin criado por " + ChatColor.BOLD + "" + ChatColor.RED +""+ ChatColor.ITALIC + "Pepe_Java" + ChatColor.GRAY +""+ ChatColor.ITALIC + ", Pessoas que ajudaram a criar: "+ChatColor.RED+""+ChatColor.ITALIC+"zZHenrique_, e_obraia");
	}
	
}
