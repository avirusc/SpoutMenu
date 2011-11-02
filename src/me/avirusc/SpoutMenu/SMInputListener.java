package me.avirusc.SpoutMenu;

import org.getspout.spoutapi.event.input.InputListener;
import org.getspout.spoutapi.event.input.KeyPressedEvent;
import org.getspout.spoutapi.gui.GenericButton;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.keyboard.Keyboard;
import org.getspout.spoutapi.player.SpoutPlayer;

public class SMInputListener extends InputListener{
	
	@Override
	public void onKeyPressedEvent(KeyPressedEvent event) {
		if (event.getKey() == Keyboard.KEY_M) {
			
			GenericPopup spmenu = new GenericPopup();
//Button 1
//			GenericButton button1 = new GenericButton("Die");
//			button1.setColor(new Color(1.0F, 1.0F, 0, 1.0F));
//			button1.setX(20).setY(20);
//			button1.setWidth(125).setHeight(25);
//Attach Button 1 to popup
//			spmenu.attachWidget(null, button1);
			
			spmenu.attachWidget(null, new GenericButton("Die").setX(20).setY(20).setWidth(125).setHeight(25));
			spmenu.attachWidget(null, new GenericButton("Test").setX(150).setY(20).setWidth(125).setHeight(25));
			spmenu.attachWidget(null, new GenericLabel("SpoutMenu 0.1 by AVirusC").setX(130).setY(230).setHeight(600).setWidth(800));
			
			((SpoutPlayer) event.getPlayer()).getMainScreen().attachPopupScreen(spmenu);
		}
	}

}
