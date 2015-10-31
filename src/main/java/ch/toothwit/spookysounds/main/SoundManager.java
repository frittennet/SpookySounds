package ch.toothwit.spookysounds.main;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class SoundManager extends BukkitRunnable {
	private static Sound[] sounds = new Sound[]{Sound.AMBIENCE_CAVE, Sound.DONKEY_DEATH, Sound.ENDERDRAGON_GROWL, Sound.WOLF_GROWL, Sound.GHAST_MOAN, Sound.ZOMBIE_IDLE, Sound.WITHER_DEATH, Sound.WITHER_IDLE}; 
	
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		int num = (int)(Math.random()*sounds.length);
		Sound sfx = sounds[num];
		for(Player p : SpookySounds.get().getServer().getOnlinePlayers()){ 
			p.playSound(p.getLocation(), sfx, 0.5f, 1f);
		} 
		
		SpookySounds.get().getServer().getScheduler().runTaskLater(SpookySounds.get(), this, (long)(Math.random()*20+10) * 20L);  
		
	}
	
}
