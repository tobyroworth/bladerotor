package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.ImageBlade;
import com.google.code.p.bladerotor.shared.TextBlade;
import com.google.gwt.user.client.ui.Label;

public class TextBladePanel extends BladePanel {
	
	protected TextBlade myTextBlade;
	
	public TextBladePanel(TextBlade blade) {
		
		
		
		// PopupPanel's constructor takes 'auto-hide' as its boolean parameter.
		// If this is set, the panel closes itself automatically when the user
		// clicks outside of it.
		super(blade);
		
		myTextBlade = (TextBlade) myBlade;
		
		setWidget(new Label(myTextBlade.getName()));
		
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
