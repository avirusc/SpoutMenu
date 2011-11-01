package me.avirusc.SpoutMenu;

import java.util.logging.Logger;
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

		string sProp = this.getconfig().getString("command1","no");
		string sProp = this.getconfig().getString("command2","no");
		string sProp = this.getconfig().getString("command3","no");
		string sProp = this.getconfig().getString("command4","no");
		string sProp = this.getconfig().getString("command5","no");
		string sProp = this.getconfig().getString("command6","no");
		string sProp = this.getconfig().getString("command7","no");
		string sProp = this.getconfig().getString("command8","no");
		string sProp = this.getconfig().getString("command9","no");
		string sProp = this.getconfig().getString("command10","no");
		
		config = getConfig();
		
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMInputListener(), Priority.Normal, this);
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMScreenListener(), Priority.Normal, this);
		
		log.info("[SpoutMenu]Version 0.1 is enabled.");

	}
	
	public void onDisable(){
		log.info("[SpoutMenu]Version 0.1 is disabled.");
	}
	
}	

