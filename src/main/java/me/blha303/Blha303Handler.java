package me.blha303;

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
		a.getLogger().info("blha303Handler loaded! Prepare for trouble, and make it double!");
	}

}
