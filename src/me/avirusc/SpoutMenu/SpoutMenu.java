package me.avirusc.SpoutMenu;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.event.input.InputListener;
import org.getspout.spoutapi.event.input.KeyPressedEvent;
import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.event.screen.ScreenListener;
import org.getspout.spoutapi.gui.GenericButton;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.keyboard.Keyboard;
import org.getspout.spoutapi.player.SpoutPlayer;

public class SpoutMenu extends JavaPlugin {
	protected FileConfiguration config;

	Logger log = Logger.getLogger("Minecraft");	
	
	public void onEnable(){
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMInputListener(), Priority.Normal, this);
		getServer().getPluginManager().registerEvent(Type.CUSTOM_EVENT, new SMScreenListener(), Priority.Normal, this);
		
		this.getConfig().options().copyDefaults(true);
	        saveConfig();	      

	    log.info("[SpoutMenu]Version 0.1 is enabled.");

	}
	
	public void onDisable(){
		log.info("[SpoutMenu]Version 0.1 is disabled.");
	}
	
	public class SMInputListener extends InputListener{
		
		@Override
		public void onKeyPressedEvent(KeyPressedEvent event) {
			if (event.getKey() == Keyboard.KEY_M) {
				
				GenericPopup spmenu = new GenericPopup();
				
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("desc1")).setX(20).setY(20).setWidth(125).setHeight(25));			
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("desc2")).setX(150).setY(20).setWidth(125).setHeight(25));
				spmenu.attachWidget(null, new GenericLabel("SpoutMenu 0.1 by AVirusC").setX(130).setY(230).setHeight(600).setWidth(800));
				
				((SpoutPlayer) event.getPlayer()).getMainScreen().attachPopupScreen(spmenu);
			}
		}
	
	}
	public class SMScreenListener extends ScreenListener {

		@Override
		public void onButtonClick(ButtonClickEvent event) {
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("desc1"))) {				
				event.getPlayer().chat(getConfig().getString("command1"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("desc2"))) {				
				event.getPlayer().chat(getConfig().getString("command2"));	
			}
		}
	
	
	}	
}
