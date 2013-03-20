package libilibigot;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.drtshock.awesome.DrtShockHandler;
import awesome.gj.GJHandler;


public class LibiLibigot extends JavaPlugin {
    
    public static Plugin plugin;
    public static LibiLibigot libiLibigot;
    public static DrtShockHandler drtshockHandler;
    public static GJHandler gjHandler;
    public void onEnable() {
        LibiLibigot.libiLibigot = this;
        LibiLibigot.plugin = libiLibigot;
        LibiLibigot.drtshockHandler = new DrtShockHandler(this);
        LibiLibigot.gjHandler = new GJHandler(this);
    }
}