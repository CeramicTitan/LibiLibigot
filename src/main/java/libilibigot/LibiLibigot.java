package awesome.t00thpick1.libilibigot;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import awesome.drtshock.DrtShockHandler;

public class LibiLibigot extends JavaPlugin {
    
    public static Plugin plugin;
    public static LibiLibigot libiLibigot;
    public static DrtShockHandler drtshockHandler;
    public void onEnable() {
        LibiLibigot.libiLibigot = this;
        LibiLibigot.plugin = libiLibigot;
        LibiLibigot.drtshockHandler = new DrtShockHandler();
    }
}