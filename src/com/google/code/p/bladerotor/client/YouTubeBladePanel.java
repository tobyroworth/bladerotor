package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.YouTubeBlade;
import com.google.gwt.user.client.ui.HTML;

public class YouTubeBladePanel extends BladePanel {
	
	protected YouTubeBlade myYouTubeBlade;
	protected HTML myEmbed = new HTML();
	
	public YouTubeBladePanel(YouTubeBlade blade) {
		super(blade);
		
		myYouTubeBlade = (YouTubeBlade) myBlade;
		
		setWidget(myEmbed);
		
		myEmbed.setHTML("<iframe width='200' height='150' src='" + myYouTubeBlade.getUrl() + "' frameborder='0'></iframe>");
		
		show();
	}

}
