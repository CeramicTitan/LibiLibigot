package com.drtshock.awesome;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class b implements Listener {
	
	
	@EventHandler
	public void a(ProjectileHitEvent event) {
		LivingEntity a = event.getEntity().getShooter();
		Location b = event.getEntity().getLocation();
		if(a instanceof Player) {
			Player p = (Player) a;
			b.getWorld().spawnFallingBlock(b, 52, (byte) 0);
			p.setMaxHealth(30);
			
		}
		
		if(a instanceof Skeleton) {
			b.getWorld().createExplosion(b, (float) (b.getY() / 10), true);
		}
	}
	

}
