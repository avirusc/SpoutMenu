package me.avirusc.SpoutMenu;

import java.util.logging.Logger;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;

public class SpoutMenu extends JavaPlugin {
	protected FileConfiguration config;

	Logger log = Logger.getLogger("Minecraft");	
	
	public void onEnable(){
		this.getConfig().set("command1", "/commandname");
		this.getConfig().set("command2", "/commandname");
		this.getConfig().set("command3", "/commandname");
		this.getConfig().set("command4", "/commandname");
		this.getConfig().set("command5", "/commandname");
		this.getConfig().set("command6", "/commandname");
		this.getConfig().set("command7", "/commandname");
		this.getConfig().set("command8", "/commandname");
		this.getConfig().set("command9", "/commandname");
		this.getConfig().set("command10", "/commandname");

		String sProp1 = this.getConfig().getString("command1","no");
		String sProp2 = this.getConfig().getString("command2","no");
		String sProp3 = this.getConfig().getString("command3","no");
		String sProp4 = this.getConfig().getString("command4","no");
		String sProp5 = this.getConfig().getString("command5","no");
		String sProp6 = this.getConfig().getString("command6","no");
		String sProp7 = this.getConfig().getString("command7","no");
		String sProp8 = this.getConfig().getString("command8","no");
		String sProp9 = this.getConfig().getString("command9","no");
		String sProp10 = this.getConfig().getString("command10","no");
		
		config = getConfig();
		
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMInputListener(), Priority.Normal, this);
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMScreenListener(), Priority.Normal, this);
		
		log.info("[SpoutMenu]Version 0.1 is enabled.");

	}
	
	public void onDisable(){
		log.info("[SpoutMenu]Version 0.1 is disabled.");
	}
	
}	

