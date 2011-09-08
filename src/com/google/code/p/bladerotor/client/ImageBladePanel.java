package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.ImageBlade;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class ImageBladePanel extends BladePanel {
	
	private Image myImage = new Image();
	private ImageBlade myBlade;
	
	public ImageBladePanel(ImageBlade blade) {
		super(blade);
		
		setWidget(myImage);
		
		myImage.setUrl(myBlade.getUrl());
		myImage.setVisibleRect(0, 0, 100, 50);
		myImage.setVisible(true);
		
		show();
	}

}
