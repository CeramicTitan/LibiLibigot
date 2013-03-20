package libilibigot;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.drtshock.awesome.DrtShockHandler;
import awesome.gj.GJHandler;
import awesome.t00thpick1.libilibigot.T00thpick1Handler;
import libilibigot.utilzbiznath.Handler;


public class LibiLibigot extends JavaPlugin {
    
    public static Plugin plugin;
    public static LibiLibigot libiLibigot;
    public static DrtShockHandler drtshockHandler;
    public static GJHandler gjHandler;
    public List<Handler> handlers = new ArrayList<Handler>();
    public void onEnable() {
        LibiLibigot.libiLibigot = this;
        LibiLibigot.plugin = libiLibigot;
        LibiLibigot.drtshockHandler = new DrtShockHandler(this);
        LibiLibigot.gjHandler = new GJHandler(this);
        LibiLibigot.t00thHandler = new T00thpick1Handler(this);
        handlers.add(LibiLibigot.t00thHandler);
        handlers.add(LibiLibigot.drtshockHandler);
        handlers.add(LibiLibigot.gjHandler);
    }
    public void onDisable() {
        for(Handler handle: handlers) {
            handle.disable();
        }
    }
}