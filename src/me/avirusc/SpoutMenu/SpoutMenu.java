//    SpoutMenu: Give your players a simple menu with Spout.
//    Copyright (C) 2011 AVirusC
	  
//This program is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.

//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
//GNU General Public License for more details.

//You should have received a copy of the GNU General Public License
//along with this program. If not, see <http://www.gnu.org/licenses/>.

// Special thanks to skawke and SpoutEssentials for inspiring me to make this.
// Special thanks to NeatMonster for his custom key code used in SpoutBackpack.

package me.avirusc.SpoutMenu;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
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
import org.getspout.spoutapi.gui.ScreenType;
import org.getspout.spoutapi.gui.WidgetAnchor;
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
	    log.info("[SpoutMenu] Version 0.5 is enabled.");
	}
	
	public void onDisable(){
		log.info("[SpoutMenu] Version 0.5 is disabled.");
	}
	
	public class SMInputListener extends InputListener{
		@Override
		public void onKeyPressedEvent(KeyPressedEvent event) {
			if (event.getPlayer().getActiveScreen() != ScreenType.SIGN_SCREEN) {
			if (event.getPlayer().getActiveScreen() != ScreenType.CHAT_SCREEN) {
			Player player = event.getPlayer();
			if (player.hasPermission("spoutmenu.allow")) {	
			if (event.getKey() == getKeyInConfig("SpoutMenu.Key", "M")) {
				GenericPopup spmenu = new GenericPopup();
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name1")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(23).setY(10).setWidth(125).setHeight(21));	
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name2")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(23).setY(40).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name3")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(23).setY(70).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name4")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(23).setY(100).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name5")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(23).setY(130).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name6")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(23).setY(160).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name7")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(23).setY(190).setWidth(125).setHeight(21));			
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name8")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(153).setY(10).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name9")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(153).setY(40).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name10")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(153).setY(70).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name11")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(153).setY(100).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name12")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(153).setY(130).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name13")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(153).setY(160).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name14")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(153).setY(190).setWidth(125).setHeight(21));			
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name15")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(283).setY(10).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name16")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(283).setY(40).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name17")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(283).setY(70).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name18")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(283).setY(100).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name19")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(283).setY(130).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name20")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(283).setY(160).setWidth(125).setHeight(21));
				spmenu.attachWidget(null, new GenericButton(getConfig().getString("name21")).setAlign(WidgetAnchor.TOP_LEFT).setAnchor(WidgetAnchor.TOP_LEFT).setX(283).setY(190).setWidth(125).setHeight(21));		
				spmenu.attachWidget(null, new GenericLabel("SpoutMenu by " + ChatColor.RED + "AVirusC").setAlign(WidgetAnchor.BOTTOM_CENTER).setAnchor(WidgetAnchor.BOTTOM_CENTER));
				((SpoutPlayer) event.getPlayer()).getMainScreen().attachPopupScreen(spmenu); 
				((SpoutPlayer) event.getPlayer()).closeActiveWindow();
			}
			}else{
				player.sendMessage(ChatColor.RED + "SpoutMenu wants to open, but you don't have access. :(");		
			}					
			}							
		}				
	}
		private Keyboard getKeyInConfig(String configProperty, String configDefault) {
			String keyInConfig = getConfig().getString(configProperty, configDefault);
			saveConfig();
			Keyboard key = Keyboard.KEY_M;
			if (keyInConfig.equalsIgnoreCase("A")) {
				key = Keyboard.KEY_A;
			} else if (keyInConfig.equalsIgnoreCase("B")) {
				key = Keyboard.KEY_B;
			} else if (keyInConfig.equalsIgnoreCase("C")) {
				key = Keyboard.KEY_C;
			} else if (keyInConfig.equalsIgnoreCase("D")) {
				key = Keyboard.KEY_D;
			} else if (keyInConfig.equalsIgnoreCase("E")) {
				key = Keyboard.KEY_E;
			} else if (keyInConfig.equalsIgnoreCase("F")) {
				key = Keyboard.KEY_F;
			} else if (keyInConfig.equalsIgnoreCase("G")) {
				key = Keyboard.KEY_G;
			} else if (keyInConfig.equalsIgnoreCase("H")) {
				key = Keyboard.KEY_H;
			} else if (keyInConfig.equalsIgnoreCase("I")) {
				key = Keyboard.KEY_I;
			} else if (keyInConfig.equalsIgnoreCase("J")) {
				key = Keyboard.KEY_J;
			} else if (keyInConfig.equalsIgnoreCase("K")) {
				key = Keyboard.KEY_K;
			} else if (keyInConfig.equalsIgnoreCase("L")) {
				key = Keyboard.KEY_L;
			} else if (keyInConfig.equalsIgnoreCase("M")) {
				key = Keyboard.KEY_M;
			} else if (keyInConfig.equalsIgnoreCase("N")) {
				key = Keyboard.KEY_N;
			} else if (keyInConfig.equalsIgnoreCase("O")) {
				key = Keyboard.KEY_O;
			} else if (keyInConfig.equalsIgnoreCase("P")) {
				key = Keyboard.KEY_P;
			} else if (keyInConfig.equalsIgnoreCase("Q")) {
				key = Keyboard.KEY_Q;
			} else if (keyInConfig.equalsIgnoreCase("R")) {
				key = Keyboard.KEY_R;
			} else if (keyInConfig.equalsIgnoreCase("S")) {
				key = Keyboard.KEY_S;
			} else if (keyInConfig.equalsIgnoreCase("T")) {
				key = Keyboard.KEY_T;
			} else if (keyInConfig.equalsIgnoreCase("U")) {
				key = Keyboard.KEY_U;
			} else if (keyInConfig.equalsIgnoreCase("V")) {
				key = Keyboard.KEY_V;
			} else if (keyInConfig.equalsIgnoreCase("W")) {
				key = Keyboard.KEY_W;
			} else if (keyInConfig.equalsIgnoreCase("X")) {
				key = Keyboard.KEY_X;
			} else if (keyInConfig.equalsIgnoreCase("Y")) {
				key = Keyboard.KEY_Y;
			} else if (keyInConfig.equalsIgnoreCase("Z")) {
				key = Keyboard.KEY_Z;
			} else if (keyInConfig.equalsIgnoreCase("0")) {
				key = Keyboard.KEY_0;
			} else if (keyInConfig.equalsIgnoreCase("1")) {
				key = Keyboard.KEY_1;
			} else if (keyInConfig.equalsIgnoreCase("2")) {
				key = Keyboard.KEY_2;
			} else if (keyInConfig.equalsIgnoreCase("3")) {
				key = Keyboard.KEY_3;
			} else if (keyInConfig.equalsIgnoreCase("4")) {
				key = Keyboard.KEY_4;
			} else if (keyInConfig.equalsIgnoreCase("5")) {
				key = Keyboard.KEY_5;
			} else if (keyInConfig.equalsIgnoreCase("6")) {
				key = Keyboard.KEY_6;
			} else if (keyInConfig.equalsIgnoreCase("7")) {
				key = Keyboard.KEY_7;
			} else if (keyInConfig.equalsIgnoreCase("8")) {
				key = Keyboard.KEY_8;
			} else if (keyInConfig.equalsIgnoreCase("9")) {
				key = Keyboard.KEY_9;
			} else if (keyInConfig.equalsIgnoreCase("NONE")) {
				key = Keyboard.KEY_NONE;
			} else if (keyInConfig.equalsIgnoreCase("ESCAPE")) {
				key = Keyboard.KEY_ESCAPE;
			} else if (keyInConfig.equalsIgnoreCase("MINUS")) {
				key = Keyboard.KEY_MINUS;
			} else if (keyInConfig.equalsIgnoreCase("EQUALS")) {
				key = Keyboard.KEY_EQUALS;
			} else if (keyInConfig.equalsIgnoreCase("BACK")) {
				key = Keyboard.KEY_BACK;
			} else if (keyInConfig.equalsIgnoreCase("TAB")) {
				key = Keyboard.KEY_TAB;
			} else if (keyInConfig.equalsIgnoreCase("LBRACKET")) {
				key = Keyboard.KEY_LBRACKET;
			} else if (keyInConfig.equalsIgnoreCase("RBRACKET")) {
				key = Keyboard.KEY_RBRACKET;
			} else if (keyInConfig.equalsIgnoreCase("RETURN")) {
				key = Keyboard.KEY_RETURN;
			} else if (keyInConfig.equalsIgnoreCase("LCONTROL")) {
				key = Keyboard.KEY_LCONTROL;
			} else if (keyInConfig.equalsIgnoreCase("SEMICOLON")) {
				key = Keyboard.KEY_SEMICOLON;
			} else if (keyInConfig.equalsIgnoreCase("APOSTROPHE")) {
				key = Keyboard.KEY_APOSTROPHE;
			} else if (keyInConfig.equalsIgnoreCase("GRAVE")) {
				key = Keyboard.KEY_GRAVE;
			} else if (keyInConfig.equalsIgnoreCase("LSHIFT")) {
				key = Keyboard.KEY_LSHIFT;
			} else if (keyInConfig.equalsIgnoreCase("BACKSLASH")) {
				key = Keyboard.KEY_BACKSLASH;
			} else if (keyInConfig.equalsIgnoreCase("COMMA")) {
				key = Keyboard.KEY_COMMA;
			} else if (keyInConfig.equalsIgnoreCase("PERIOD")) {
				key = Keyboard.KEY_PERIOD;
			} else if (keyInConfig.equalsIgnoreCase("SLASH")) {
				key = Keyboard.KEY_SLASH;
			} else if (keyInConfig.equalsIgnoreCase("RSHIFT")) {
				key = Keyboard.KEY_RSHIFT;
			} else if (keyInConfig.equalsIgnoreCase("MULTIPLY")) {
				key = Keyboard.KEY_MULTIPLY;
			} else if (keyInConfig.equalsIgnoreCase("LMENU")) {
				key = Keyboard.KEY_LMENU;
			} else if (keyInConfig.equalsIgnoreCase("SPACE")) {
				key = Keyboard.KEY_SPACE;
			} else if (keyInConfig.equalsIgnoreCase("F1")) {
				key = Keyboard.KEY_F1;
			} else if (keyInConfig.equalsIgnoreCase("F2")) {
				key = Keyboard.KEY_F2;
			} else if (keyInConfig.equalsIgnoreCase("F3")) {
				key = Keyboard.KEY_F3;
			} else if (keyInConfig.equalsIgnoreCase("F4")) {
				key = Keyboard.KEY_F4;
			} else if (keyInConfig.equalsIgnoreCase("F5")) {
				key = Keyboard.KEY_F5;
			} else if (keyInConfig.equalsIgnoreCase("F6")) {
				key = Keyboard.KEY_F6;
			} else if (keyInConfig.equalsIgnoreCase("F7")) {
				key = Keyboard.KEY_F7;
			} else if (keyInConfig.equalsIgnoreCase("F8")) {
				key = Keyboard.KEY_F8;
			} else if (keyInConfig.equalsIgnoreCase("F9")) {
				key = Keyboard.KEY_F9;
			} else if (keyInConfig.equalsIgnoreCase("F10")) {
				key = Keyboard.KEY_F10;
			} else if (keyInConfig.equalsIgnoreCase("NUMLOCK")) {
				key = Keyboard.KEY_NUMLOCK;
			} else if (keyInConfig.equalsIgnoreCase("SCROLL")) {
				key = Keyboard.KEY_SCROLL;
			} else if (keyInConfig.equalsIgnoreCase("SUBTRACT")) {
				key = Keyboard.KEY_SUBTRACT;
			} else if (keyInConfig.equalsIgnoreCase("ADD")) {
				key = Keyboard.KEY_ADD;
			} else if (keyInConfig.equalsIgnoreCase("DECIMAL")) {
				key = Keyboard.KEY_DECIMAL;
			} else if (keyInConfig.equalsIgnoreCase("F11")) {
				key = Keyboard.KEY_F11;
			} else if (keyInConfig.equalsIgnoreCase("F12")) {
				key = Keyboard.KEY_F12;
			} else if (keyInConfig.equalsIgnoreCase("F13")) {
				key = Keyboard.KEY_F13;
			} else if (keyInConfig.equalsIgnoreCase("F14")) {
				key = Keyboard.KEY_F14;
			} else if (keyInConfig.equalsIgnoreCase("F15")) {
				key = Keyboard.KEY_F15;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD0")) {
				key = Keyboard.KEY_NUMPAD0;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD1")) {
				key = Keyboard.KEY_NUMPAD1;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD2")) {
				key = Keyboard.KEY_NUMPAD2;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD3")) {
				key = Keyboard.KEY_NUMPAD3;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD4")) {
				key = Keyboard.KEY_NUMPAD4;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD5")) {
				key = Keyboard.KEY_NUMPAD5;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD6")) {
				key = Keyboard.KEY_NUMPAD6;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD7")) {
				key = Keyboard.KEY_NUMPAD7;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD8")) {
				key = Keyboard.KEY_NUMPAD8;
			} else if (keyInConfig.equalsIgnoreCase("NUMPAD9")) {
				key = Keyboard.KEY_NUMPAD9;
			} else if (keyInConfig.equalsIgnoreCase("KANA")) {
				key = Keyboard.KEY_KANA;
			} else if (keyInConfig.equalsIgnoreCase("CONVERT")) {
				key = Keyboard.KEY_CONVERT;
			} else if (keyInConfig.equalsIgnoreCase("NOCONVERT")) {
				key = Keyboard.KEY_NOCONVERT;
			} else if (keyInConfig.equalsIgnoreCase("YEN")) {
				key = Keyboard.KEY_YEN;
			} else if (keyInConfig.equalsIgnoreCase("NUMPADEQUALS")) {
				key = Keyboard.KEY_NUMPADEQUALS;
			} else if (keyInConfig.equalsIgnoreCase("CIRCUMFLEX")) {
				key = Keyboard.KEY_CIRCUMFLEX;
			} else if (keyInConfig.equalsIgnoreCase("AT")) {
				key = Keyboard.KEY_AT;
			} else if (keyInConfig.equalsIgnoreCase("COLON")) {
				key = Keyboard.KEY_COLON;
			} else if (keyInConfig.equalsIgnoreCase("UNDERLINE")) {
				key = Keyboard.KEY_UNDERLINE;
			} else if (keyInConfig.equalsIgnoreCase("KANJI")) {
				key = Keyboard.KEY_KANJI;
			} else if (keyInConfig.equalsIgnoreCase("STOP")) {
				key = Keyboard.KEY_STOP;
			} else if (keyInConfig.equalsIgnoreCase("AX")) {
				key = Keyboard.KEY_AX;
			} else if (keyInConfig.equalsIgnoreCase("UNLABELED")) {
				key = Keyboard.KEY_UNLABELED;
			} else if (keyInConfig.equalsIgnoreCase("NUMPADENTER")) {
				key = Keyboard.KEY_NUMPADENTER;
			} else if (keyInConfig.equalsIgnoreCase("RCONTROL")) {
				key = Keyboard.KEY_RCONTROL;
			} else if (keyInConfig.equalsIgnoreCase("NUMPADCOMMA")) {
				key = Keyboard.KEY_NUMPADCOMMA;
			} else if (keyInConfig.equalsIgnoreCase("DIVIDE")) {
				key = Keyboard.KEY_DIVIDE;
			} else if (keyInConfig.equalsIgnoreCase("SYSRQ")) {
				key = Keyboard.KEY_SYSRQ;
			} else if (keyInConfig.equalsIgnoreCase("RMENU")) {
				key = Keyboard.KEY_RMENU;
			} else if (keyInConfig.equalsIgnoreCase("PAUSE")) {
				key = Keyboard.KEY_PAUSE;
			} else if (keyInConfig.equalsIgnoreCase("HOME")) {
				key = Keyboard.KEY_HOME;
			} else if (keyInConfig.equalsIgnoreCase("UP")) {
				key = Keyboard.KEY_UP;
			} else if (keyInConfig.equalsIgnoreCase("PRIOR")) {
				key = Keyboard.KEY_PRIOR;
			} else if (keyInConfig.equalsIgnoreCase("LEFT")) {
				key = Keyboard.KEY_LEFT;
			} else if (keyInConfig.equalsIgnoreCase("RIGHT")) {
				key = Keyboard.KEY_RIGHT;
			} else if (keyInConfig.equalsIgnoreCase("END")) {
				key = Keyboard.KEY_END;
			} else if (keyInConfig.equalsIgnoreCase("DOWN")) {
				key = Keyboard.KEY_DOWN;
			} else if (keyInConfig.equalsIgnoreCase("NEXT")) {
				key = Keyboard.KEY_NEXT;
			} else if (keyInConfig.equalsIgnoreCase("INSERT")) {
				key = Keyboard.KEY_INSERT;
			} else if (keyInConfig.equalsIgnoreCase("DELETE")) {
				key = Keyboard.KEY_DELETE;
			} else if (keyInConfig.equalsIgnoreCase("LMETA")) {
				key = Keyboard.KEY_LMETA;
			} else if (keyInConfig.equalsIgnoreCase("LWIN")) {
				key = Keyboard.KEY_LWIN;
			} else if (keyInConfig.equalsIgnoreCase("RMETA")) {
				key = Keyboard.KEY_RMETA;
			} else if (keyInConfig.equalsIgnoreCase("RWIN")) {
				key = Keyboard.KEY_RWIN;
			} else if (keyInConfig.equalsIgnoreCase("APPS")) {
				key = Keyboard.KEY_APPS;
			} else if (keyInConfig.equalsIgnoreCase("POWER")) {
				key = Keyboard.KEY_POWER;
			} else if (keyInConfig.equalsIgnoreCase("SLEEP")) {
				key = Keyboard.KEY_SLEEP;
			}
			return key;
		}
	}	
	public class SMScreenListener extends ScreenListener {
		@Override
		public void onButtonClick(ButtonClickEvent event) {
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name1"))) {				
				event.getPlayer().chat(getConfig().getString("command1"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name2"))) {				
				event.getPlayer().chat(getConfig().getString("command2"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name3"))) {				
				event.getPlayer().chat(getConfig().getString("command3"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name4"))) {				
				event.getPlayer().chat(getConfig().getString("command4"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name5"))) {				
				event.getPlayer().chat(getConfig().getString("command5"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name6"))) {				
				event.getPlayer().chat(getConfig().getString("command6"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name7"))) {				
				event.getPlayer().chat(getConfig().getString("command7"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name8"))) {				
				event.getPlayer().chat(getConfig().getString("command8"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name9"))) {				
				event.getPlayer().chat(getConfig().getString("command9"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name10"))) {				
				event.getPlayer().chat(getConfig().getString("command10"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name11"))) {				
				event.getPlayer().chat(getConfig().getString("command11"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name12"))) {				
				event.getPlayer().chat(getConfig().getString("command12"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name13"))) {				
				event.getPlayer().chat(getConfig().getString("command13"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name14"))) {				
				event.getPlayer().chat(getConfig().getString("command14"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name15"))) {				
				event.getPlayer().chat(getConfig().getString("command15"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name16"))) {				
				event.getPlayer().chat(getConfig().getString("command16"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name17"))) {				
				event.getPlayer().chat(getConfig().getString("command17"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name18"))) {				
				event.getPlayer().chat(getConfig().getString("command18"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name19"))) {				
				event.getPlayer().chat(getConfig().getString("command19"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name20"))) {				
				event.getPlayer().chat(getConfig().getString("command20"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("name21"))) {				
				event.getPlayer().chat(getConfig().getString("command21"));
			}
		}	
	}
}