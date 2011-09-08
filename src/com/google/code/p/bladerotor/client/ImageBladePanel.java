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
		
		//TODO find an actual way of getting offset width to be correct
		myImage.setVisibleRect(0, 0, 200, 100);
		myImage.setVisible(true);
		
		show();
	}

}
