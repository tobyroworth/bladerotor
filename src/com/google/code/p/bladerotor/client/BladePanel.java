package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.Blade;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;

public class BladePanel extends DecoratedPopupPanel {
	private Blade myBlade;
	
	public BladePanel(Blade blade) {
		
		
		
		// PopupPanel's constructor takes 'auto-hide' as its boolean parameter.
		// If this is set, the panel closes itself automatically when the user
		// clicks outside of it.
		super(false);
		
		myBlade = blade;
		
		setWidget(new Label(myBlade.getName()));
		
		getWidget().addStyleName("blade");

		setTitle(myBlade.getName());
		
		setPopupPosition(0, 0);
		setVisible(true);
		show();
	}
	
	public int getCenterXOffset() {
		int x = getOffsetWidth();
		x = x/2;
		return x;
	}
	
	public int getCenterYOffset() {
		int y = getOffsetHeight();
		y = y/2;
		return y;
	}
	
	public void setPopupPosition(int x, int y) {
		super.setPopupPosition(x, y);
	}
}
