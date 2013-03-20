package awesome.t00thpick1.libilibigot;

import libilibigot.LibiLibigot;
import libilibigot.utilzbiznatch.Handler;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.drtshock.awesome.DrtShockHandler;

public class T00thpick1Handler implements Handler {
    
    private static LibiLibigot a;

    public T00thpick1Handler(LibiLibigot libiLibigot) {
        T00thpick1Handler.a = libiLibigot;
        a();
    }
    
    public void disable() {
        
    }
}