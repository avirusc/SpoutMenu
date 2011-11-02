package me.avirusc.SpoutMenu;

import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.event.screen.ScreenListener;
import org.getspout.spoutapi.gui.GenericButton;

public class SMScreenListener extends ScreenListener {

	@Override
	public void onButtonClick(ButtonClickEvent event) {
		if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("Die")) {				
			event.getPlayer().chat("/die");
		}
		if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("Test")) {				
			event.getPlayer().sendMessage("You are testing!");
			event.getPlayer().chat("/list");	
		}
	}
}