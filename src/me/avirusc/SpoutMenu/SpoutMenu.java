package me.avirusc.SpoutMenu;

import java.util.logging.Logger;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;

public class SpoutMenu extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");	
	
	public void onEnable(){
		
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMInputListener(), Priority.Normal, this);
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMScreenListener(), Priority.Normal, this);
		
		log.info("[SpoutMenu]Version 0.1 is enabled.");

	}
	
	public void onDisable(){
		log.info("[SpoutMenu]Version 0.1 is disabled.");
	}
	
}	

