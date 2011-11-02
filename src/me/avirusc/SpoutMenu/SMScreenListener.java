package me.avirusc.SpoutMenu;

import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.event.screen.ScreenListener;
import org.getspout.spoutapi.gui.GenericButton;

public class SMScreenListener extends ScreenListener {

	@Override
	public void onButtonClick(ButtonClickEvent event) {
		if (event.getButton() instanceof GenericButton && event.getButton().getText().equals("Die")) {				
			event.getPlayer().sendMessage("You have been killed!");
			event.getPlayer().chat("/die");
		}
	}
}