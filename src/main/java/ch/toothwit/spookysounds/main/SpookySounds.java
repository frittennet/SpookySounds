package ch.toothwit.spookysounds.main;

import org.bukkit.plugin.java.JavaPlugin;
public class SpookySounds extends JavaPlugin { 
	private static SpookySounds instance; 
	private SoundManager manager;
	@Override
    public void onDisable() {
        super.onDisable();
        getLogger().info(this.getName() + "disabled successfully!");
    }

    @Override
    public void onEnable() {
    	
    	instance = this; 
    	
        super.onEnable();
        getLogger().info(this.getName() + "enabled successfully!"); 
        manager = new SoundManager(); 
        
        manager.runTaskLater(this, 5 * 20L ); 
       
    } 
    
    public static SpookySounds get(){ 
    	return instance; 
    }
}
