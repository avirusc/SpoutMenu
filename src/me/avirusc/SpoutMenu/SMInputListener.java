package me.avirusc.SpoutMenu;

import org.getspout.spoutapi.event.input.InputListener;
import org.getspout.spoutapi.event.input.KeyPressedEvent;
import org.getspout.spoutapi.gui.GenericButton;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.keyboard.Keyboard;

public class SMInputListener extends InputListener{
	
	@Override
	public void onKeyPressedEvent(KeyPressedEvent event) {
		if (event.getKey() == Keyboard.KEY_M) {
			event.getPlayer().sendMessage("Spout Menu");
			GenericPopup popup = new GenericPopup();
			popup.attachWidget(null, new GenericButton("Die")).setX(70).setY(102).setHeight(35).setWidth(100);
		}
	}

}
