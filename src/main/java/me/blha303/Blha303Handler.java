package me.blha303;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import libilibigot.LibiLibigot;
import libilibigot.utilzbiznatch.Handler;

public class Blha303Handler implements Handler {
	
	private static LibiLibigot a;

	public Blha303Handler(LibiLibigot libiLibigot) {
		Blha303Handler.a = libiLibigot;
		a();
	}

	public void disable() {
		a.getLogger().info("Stop... all the clocks...");
		a.getLogger().info("FAATHEEEEERRRRRRRRRRRR!");
	}
	
	public void a() {
		a.getConfig().addDefault("blha303.destroyEverything", false);
		a.getConfig().addDefault("blha303.keyYourCar", false);
		a.getConfig().addDefault("blha303.secretMessage", "Psssst. You're hot.");
		a.getLogger().info("blha303Handler loaded! Prepare for trouble, and make it double!");
		String c = b(a.getConfig().getString("blha303.secretMessage"));
		for (Player p : a.getServer().getOnlinePlayers()) {
			p.sendMessage("Hey there, this is blha303, just whispering in your ear.");
			p.sendMessage("I'll be here all day, so stay tuned for helpful hints, like " + ChatColor.AQUA + c);
		}
	}

	private String b(String message) {
		return c(message);
	}
	
	private String c(String message) {
		return d(message);
	}
	
	private String d(String message) {
		return e(message);
	}
	
	private String e(String message) {
		return f(message);
	}
	
	private String f(String message) {
		return g(message);
	}
	
	private String g(String message) {
		message.replaceAll(".*?", "hey babe ur so hawt");
		return message;
	}

}
