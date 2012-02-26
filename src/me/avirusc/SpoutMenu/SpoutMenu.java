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
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.event.input.KeyPressedEvent;
import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.gui.ContainerType;
import org.getspout.spoutapi.gui.GenericButton;
import org.getspout.spoutapi.gui.GenericContainer;
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
		getServer().getPluginManager().registerEvents(new SMInputListener(), this);
		getServer().getPluginManager().registerEvents(new SMScreenListener(), this);
		this.getConfig().options().copyDefaults(true);
	        saveConfig();	      
	    log.info("[SpoutMenu] Version 0.7 is enabled.");
	}
	
	public void onDisable(){
		log.info("[SpoutMenu] Version 0.7 is disabled.");
	}
	
	public class SMInputListener implements Listener{
		private SpoutMenu plugin;
		
		@EventHandler
		public void onKeyPressedEvent(KeyPressedEvent event) {
			
			if (event.getPlayer().getActiveScreen() != ScreenType.SIGN_SCREEN) {
			if (event.getPlayer().getActiveScreen() != ScreenType.CHAT_SCREEN) {
			SpoutPlayer player = (SpoutPlayer) event.getPlayer();
			if (player.hasPermission("spoutmenu.allow")) {	
			if (event.getKey() == getKeyInConfig("SpoutMenu.Key", "M")) {				
				player.getMainScreen().attachPopupScreen(new SpoutMenuGUI(plugin, player));
				player.closeActiveWindow();
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
	
	public class SMScreenListener implements Listener {
		private SpoutMenu plugin;
		
		@EventHandler	
		public void onButtonClick(ButtonClickEvent event) {
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu1.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu1.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu2.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu2.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu3.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu3.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu4.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu4.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu5.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu5.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu6.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu6.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu7.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu7.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu8.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu8.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu9.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu9.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button1.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button1.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button2.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button2.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button3.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button3.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button4.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button4.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button5.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button5.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button6.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button6.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button7.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button7.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button8.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button8.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button9.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button9.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button10.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button10.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button11.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button11.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button12.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button12.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button13.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button13.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button14.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button14.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button15.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button15.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button16.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button16.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button17.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button17.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button18.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button18.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button19.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button19.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button20.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button20.Command"));	
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button21.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button21.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button22.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button22.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button23.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button23.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button24.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button24.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button25.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button25.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button26.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button26.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals(getConfig().getString("SpoutMenu.Menu10.Button27.Name"))) {				
				event.getPlayer().chat(getConfig().getString("SpoutMenu.Menu10.Button27.Command"));
			}
			if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("1")) {				
			    SpoutPlayer player = event.getPlayer();
			    player.getMainScreen().closePopup();
		    	player.getMainScreen().attachPopupScreen(new SpoutMenuGUI(plugin, player));
			}		 
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("2")) {
		    	SpoutPlayer player = event.getPlayer();
		    	player.getMainScreen().closePopup();
		    	player.getMainScreen().attachPopupScreen(new SpoutMenuGUI2(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("3")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI3(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("4")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI4(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("5")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI5(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("6")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI6(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("7")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI7(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("8")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI8(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("9")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI9(plugin, player));
		    }
		    if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("10")) {
	    		SpoutPlayer player = event.getPlayer();
	    		player.getMainScreen().closePopup();
	    		player.getMainScreen().attachPopupScreen(new SpoutMenuGUI10(plugin, player));
		    }
		}		
	}

	public class SpoutMenuGUI extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu1;
		private GenericContainer sptitle1;
		private GenericContainer splabel;
		private GenericContainer spnav;
		public SpoutMenuGUI(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;	
		// Generate Containers
		spmenu1 = new spmenu1(plugin);
		sptitle1 = new sptitle1(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle1, spmenu1, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI2 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu2;
		private GenericContainer sptitle2;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI2(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu2 = new spmenu2(plugin);
		sptitle2 = new sptitle2(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle2, spmenu2, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI3 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu3;
		private GenericContainer sptitle3;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI3(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu3 = new spmenu3(plugin);
		sptitle3 = new sptitle3(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle3, spmenu3, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI4 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu4;
		private GenericContainer sptitle4;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI4(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu4 = new spmenu4(plugin);
		sptitle4 = new sptitle4(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle4, spmenu4, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI5 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu5;
		private GenericContainer sptitle5;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI5(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu5 = new spmenu5(plugin);
		sptitle5 = new sptitle5(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle5, spmenu5, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI6 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu6;
		private GenericContainer sptitle6;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI6(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu6 = new spmenu6(plugin);
		sptitle6 = new sptitle6(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle6, spmenu6, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI7 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu7;
		private GenericContainer sptitle7;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI7(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu7 = new spmenu7(plugin);
		sptitle7 = new sptitle7(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle7, spmenu7, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI8 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu8;
		private GenericContainer sptitle8;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI8(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu8 = new spmenu8(plugin);
		sptitle8 = new sptitle8(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle8, spmenu8, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI9 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu9;
		private GenericContainer sptitle9;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI9(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu9 = new spmenu9(plugin);
		sptitle9 = new sptitle9(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle9, spmenu9, splabel, spnav);
	    }
	}
	public class SpoutMenuGUI10 extends GenericPopup {
		public SpoutMenu plugin;
		private GenericContainer spmenu10;
		private GenericContainer sptitle10;
		private GenericContainer splabel;
		private GenericContainer spnav;		
		public SpoutMenuGUI10(SpoutMenu plugin, SpoutPlayer player) {
			this.plugin = plugin;		
		// Generate Containers
		spmenu10 = new spmenu10(plugin);
		sptitle10 = new sptitle10(plugin);
		splabel = new splabel(plugin);
		spnav = new spnav(plugin, player);
		this.attachWidgets(plugin, sptitle10, spmenu10, splabel, spnav);
	    }
	}
	public class spnav extends GenericContainer {	
		public spnav(SpoutMenu plugin, SpoutPlayer player) {
	
	setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setX(130).setY(227).setWidth(180).setHeight(20).setMargin(2,2,2,2);
	
	//Navigation buttons
	if (getConfig().getBoolean("SpoutMenu.Menu2.Enabled", true) == (true)) {
	this.addChild(new GenericButton("1")).setFixed(true);
	}
	if (player.hasPermission("spoutmenu.menu2")) {
	if (getConfig().getBoolean("SpoutMenu.Menu2.Enabled", true) == (true)) {
	this.addChild(new GenericButton("2")).setFixed(true);
	}
	}
	if (player.hasPermission("spoutmenu.menu3")) {
	if (getConfig().getBoolean("SpoutMenu.Menu3.Enabled", true) == (true)) {
	this.addChild(new GenericButton("3")).setFixed(true);
	}
	}
	if (player.hasPermission("spoutmenu.menu4")) {
	if (getConfig().getBoolean("SpoutMenu.Menu4.Enabled", true) == (true)) {
	this.addChild(new GenericButton("4")).setFixed(true);
	}
	}
	if (player.hasPermission("spoutmenu.menu5")) {
	if (getConfig().getBoolean("SpoutMenu.Menu5.Enabled", true) == (true)) {
	this.addChild(new GenericButton("5")).setFixed(true);
	}
	}
	if (player.hasPermission("spoutmenu.menu6")) {
	if (getConfig().getBoolean("SpoutMenu.Menu6.Enabled", true) == (true)) {
	this.addChild(new GenericButton("6")).setFixed(true);	
	}
	}
	if (player.hasPermission("spoutmenu.menu7")) {
	if (getConfig().getBoolean("SpoutMenu.Menu7.Enabled", true) == (true)) {
	this.addChild(new GenericButton("7")).setFixed(true);
	}
	}
	if (player.hasPermission("spoutmenu.menu8")) {
	if (getConfig().getBoolean("SpoutMenu.Menu8.Enabled", true) == (true)) {
	this.addChild(new GenericButton("8")).setFixed(true);
	}
	}
	if (player.hasPermission("spoutmenu.menu9")) {
	if (getConfig().getBoolean("SpoutMenu.Menu9.Enabled", true) == (true)) {
	this.addChild(new GenericButton("9")).setFixed(true);
	}
	}
	if (player.hasPermission("spoutmenu.menu10")) {
	if (getConfig().getBoolean("SpoutMenu.Menu10.Enabled", true) == (true)) {
	this.addChild(new GenericButton("10")).setFixed(true);
	}
	}
		}
	}
	
	public class splabel extends GenericContainer {	
		public splabel(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT).setX(322).setY(236);
			this.addChild(new GenericLabel("SpoutMenu by " + ChatColor.RED + "AVirusC").setMargin(2,2,2,2)); 
		}
	}
	public class sptitle1 extends GenericContainer {	
		public sptitle1(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu1.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle2 extends GenericContainer {	
		public sptitle2(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu2.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle3 extends GenericContainer {	
		public sptitle3(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu3.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle4 extends GenericContainer {	
		public sptitle4(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu4.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle5 extends GenericContainer {	
		public sptitle5(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu5.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle6 extends GenericContainer {	
		public sptitle6(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu6.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle7 extends GenericContainer {	
		public sptitle7(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu7.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle8 extends GenericContainer {	
		public sptitle8(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu8.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle9 extends GenericContainer {	
		public sptitle9(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu9.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class sptitle10 extends GenericContainer {	
		public sptitle10(SpoutMenu plugin) {
			this.setLayout(ContainerType.VERTICAL).setAnchor(WidgetAnchor.TOP_LEFT);
			this.addChild(new GenericLabel(getConfig().getString("SpoutMenu.Menu10.Title")).setWidth(2).setHeight(2).setMargin(6,0,0,31));	
		}
	}
	public class spmenu1 extends GenericContainer {	
		public spmenu1(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL1 = new GenericContainer(); 
			smContainerL1.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC1 = new GenericContainer();
			smContainerC1.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR1 = new GenericContainer();
			smContainerR1.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button1.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button2.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button3.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button4.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button5.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button6.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button7.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button8.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button9.Enabled", true) == (true)) {		
			smContainerL1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button10.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button11.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button12.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button13.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button14.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button15.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button16.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button17.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button18.Enabled", true) == (true)) {		
			smContainerC1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button19.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button20.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button21.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button22.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button23.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button24.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button25.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button26.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu1.Button27.Enabled", true) == (true)) {		
			smContainerR1.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu1.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL1, smContainerC1, smContainerR1);
		}
	}
	public class spmenu2 extends GenericContainer {	
		public spmenu2(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL2 = new GenericContainer(); 
			smContainerL2.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC2 = new GenericContainer();
			smContainerC2.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR2 = new GenericContainer();
			smContainerR2.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button1.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button2.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button3.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button4.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button5.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button6.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button7.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button8.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button9.Enabled", true) == (true)) {		
			smContainerL2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button10.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button11.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button12.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button13.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button14.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button15.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button16.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button17.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button18.Enabled", true) == (true)) {		
			smContainerC2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button19.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button20.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button21.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button22.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button23.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button24.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button25.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button26.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu2.Button27.Enabled", true) == (true)) {		
			smContainerR2.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu2.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL2, smContainerC2, smContainerR2);
		}
	}
	public class spmenu3 extends GenericContainer {	
		public spmenu3(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL3 = new GenericContainer(); 
			smContainerL3.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC3 = new GenericContainer();
			smContainerC3.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR3 = new GenericContainer();
			smContainerR3.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button1.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button2.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button3.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button4.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button5.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button6.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button7.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button8.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button9.Enabled", true) == (true)) {		
			smContainerL3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button10.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button11.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button12.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button13.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button14.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button15.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button16.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button17.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button18.Enabled", true) == (true)) {		
			smContainerC3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button19.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button20.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button21.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button22.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button23.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button24.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button25.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button26.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu3.Button27.Enabled", true) == (true)) {		
			smContainerR3.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu3.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL3, smContainerC3, smContainerR3);
		}
	}
	public class spmenu4 extends GenericContainer {	
		public spmenu4(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL4 = new GenericContainer(); 
			smContainerL4.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC4 = new GenericContainer();
			smContainerC4.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR4 = new GenericContainer();
			smContainerR4.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button1.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button2.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button3.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button4.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button5.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button6.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button7.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button8.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button9.Enabled", true) == (true)) {		
			smContainerL4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button10.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button11.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button12.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button13.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button14.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button15.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button16.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button17.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button18.Enabled", true) == (true)) {		
			smContainerC4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button19.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button20.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button21.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button22.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button23.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button24.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button25.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button26.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu4.Button27.Enabled", true) == (true)) {		
			smContainerR4.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu4.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL4, smContainerC4, smContainerR4);
		}
	}
	public class spmenu5 extends GenericContainer {	
		public spmenu5(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL5 = new GenericContainer(); 
			smContainerL5.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC5 = new GenericContainer();
			smContainerC5.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR5 = new GenericContainer();
			smContainerR5.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button1.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button2.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button3.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button4.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button5.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button6.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button7.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button8.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button9.Enabled", true) == (true)) {		
			smContainerL5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button10.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button11.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button12.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button13.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button14.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button15.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button16.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button17.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button18.Enabled", true) == (true)) {		
			smContainerC5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button19.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button20.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button21.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button22.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button23.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button24.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button25.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button26.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu5.Button27.Enabled", true) == (true)) {		
			smContainerR5.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu5.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL5, smContainerC5, smContainerR5);
		}
	}
	public class spmenu6 extends GenericContainer {	
		public spmenu6(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL6 = new GenericContainer(); 
			smContainerL6.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC6 = new GenericContainer();
			smContainerC6.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR6 = new GenericContainer();
			smContainerR6.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button1.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button2.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button3.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button4.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button5.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button6.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button7.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button8.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button9.Enabled", true) == (true)) {		
			smContainerL6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button10.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button11.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button12.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button13.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button14.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button15.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button16.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button17.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button18.Enabled", true) == (true)) {		
			smContainerC6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button19.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button20.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button21.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button22.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button23.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button24.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button25.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button26.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu6.Button27.Enabled", true) == (true)) {		
			smContainerR6.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu6.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL6, smContainerC6, smContainerR6);
		}
	}
	public class spmenu7 extends GenericContainer {	
		public spmenu7(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL7 = new GenericContainer(); 
			smContainerL7.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC7 = new GenericContainer();
			smContainerC7.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR7 = new GenericContainer();
			smContainerR7.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button1.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button2.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button3.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button4.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button5.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button6.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button7.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button8.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button9.Enabled", true) == (true)) {		
			smContainerL7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button10.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button11.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button12.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button13.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button14.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button15.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button16.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button17.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button18.Enabled", true) == (true)) {		
			smContainerC7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button19.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button20.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button21.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button22.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button23.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button24.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button25.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button26.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu7.Button27.Enabled", true) == (true)) {		
			smContainerR7.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu7.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL7, smContainerC7, smContainerR7);
		}
	}
	public class spmenu8 extends GenericContainer {	
		public spmenu8(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL8 = new GenericContainer(); 
			smContainerL8.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC8 = new GenericContainer();
			smContainerC8.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR8 = new GenericContainer();
			smContainerR8.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button1.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button2.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button3.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button4.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button5.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button6.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button7.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button8.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button9.Enabled", true) == (true)) {		
			smContainerL8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button10.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button11.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button12.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button13.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button14.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button15.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button16.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button17.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button18.Enabled", true) == (true)) {		
			smContainerC8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button19.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button20.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button21.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button22.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button23.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button24.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button25.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button26.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu8.Button27.Enabled", true) == (true)) {		
			smContainerR8.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu8.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL8, smContainerC8, smContainerR8);
		}
	}
	public class spmenu9 extends GenericContainer {	
		public spmenu9(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL9 = new GenericContainer(); 
			smContainerL9.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC9 = new GenericContainer();
			smContainerC9.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR9 = new GenericContainer();
			smContainerR9.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button1.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button2.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button3.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button4.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button5.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button6.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button7.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button8.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button9.Enabled", true) == (true)) {		
			smContainerL9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button10.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button11.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button12.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button13.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button14.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button15.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button16.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button17.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button18.Enabled", true) == (true)) {		
			smContainerC9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button19.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button20.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button21.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button22.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button23.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button24.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button25.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button26.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu9.Button27.Enabled", true) == (true)) {		
			smContainerR9.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu9.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL9, smContainerC9, smContainerR9);
		}
	}
	public class spmenu10 extends GenericContainer {	
		public spmenu10(SpoutMenu plugin) {
			setLayout(ContainerType.HORIZONTAL).setAnchor(WidgetAnchor.TOP_LEFT).setWidth(700).setHeight(700);
			GenericContainer smContainerL10 = new GenericContainer(); 
			smContainerL10.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_LEFT).setHeight(225).setWidth(225).setMargin(16,0,34,30);
			GenericContainer smContainerC10 = new GenericContainer();
			smContainerC10.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_CENTER).setHeight(225).setWidth(225).setMargin(16,0,34,0);
			GenericContainer smContainerR10 = new GenericContainer();
			smContainerR10.setLayout(ContainerType.VERTICAL).setAlign(WidgetAnchor.CENTER_RIGHT).setHeight(225).setWidth(225).setMargin(16,30,34,0);
			//Menu 1 Buttons
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button1.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button1.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));	
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button2.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button2.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button3.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button3.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}				
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button4.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button4.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button5.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button5.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button6.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button6.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button7.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button7.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button8.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button8.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button9.Enabled", true) == (true)) {		
			smContainerL10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button9.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button10.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button10.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button11.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button11.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button12.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button12.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button13.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button13.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button14.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button14.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));			
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button15.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button15.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button16.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button16.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button17.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button17.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button18.Enabled", true) == (true)) {		
			smContainerC10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button18.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button19.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button19.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button20.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button20.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button21.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button21.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button22.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button22.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button23.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button23.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button24.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button24.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button25.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button25.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button26.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button26.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}
			if (getConfig().getBoolean("SpoutMenu.Menu10.Button27.Enabled", true) == (true)) {		
			smContainerR10.addChild(new GenericButton(getConfig().getString("SpoutMenu.Menu10.Button27.Name")).setWidth(125).setHeight(21).setFixed(true).setMargin(1,1,1,1));		
			}				
			this.addChildren(smContainerL10, smContainerC10, smContainerR10);
		}
	}
}


