package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.Blade;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;

public abstract class BladePanel extends DecoratedPopupPanel {
	protected Blade myBlade;
	
	public BladePanel(Blade blade) {
		
		// PopupPanel's constructor takes 'auto-hide' as its boolean parameter.
		// If this is set, the panel closes itself automatically when the user
		// clicks outside of it.
		super(false);
		
		myBlade = blade;
		
	}
		
	public void show() {
		
		getWidget().addStyleName("blade");

		//setTitle(myBlade.getName());
		
		setVisible(true);
		setPopupPosition(-500, -500);
		super.show();
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
