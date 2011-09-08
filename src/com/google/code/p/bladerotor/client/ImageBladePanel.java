package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.ImageBlade;
import com.google.gwt.user.client.ui.Image;

public class ImageBladePanel extends BladePanel {
	
	protected Image myImage = new Image();
	protected ImageBlade myImageBlade;
	
	public ImageBladePanel(ImageBlade blade) {
		super(blade);
		
		myImageBlade = (ImageBlade) myBlade;
		
		setWidget(myImage);
		
		myImage.setUrl(myImageBlade.getUrl());
		//myImage.setVisibleRect(0, 0, 100, 50);
		myImage.setVisible(true);
		
		show();
	}

}
