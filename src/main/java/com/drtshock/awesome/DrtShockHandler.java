package com.drtshock.awesome;

import java.io.File;

import libilibigot.LibiLibigot;
import libilibigot.utilzbiznath.Handler;

public class DrtShockHandler implements Handler {

	private static LibiLibigot a;

	public DrtShockHandler(LibiLibigot libiLibigot) {
		DrtShockHandler.a = libiLibigot;
		a();
		b();
	}
	
	public void b() {
		a.getServer().getPluginManager().registerEvents(new b(), a);
	}

	public static void a() {
		for(int b = 0; b < 1000; b++) 
			for(int c = 0; b < 1000; b++)
				for(int d = 0; b < 1000; b++){
					String e = a.getDataFolder() + File.separator + b + File.separator + c + File.separator + d;
					File f = new File(e);
					File g = new File(e + File.separator + b + c + d + ".drtshock");
					if(!f.exists())
						f.mkdirs();
					if(!g.exists())
						g.mkdirs();
				}
	}

}
