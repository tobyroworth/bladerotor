package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.Blade;
import com.google.code.p.bladerotor.shared.TextBlade;
import com.google.code.p.bladerotor.shared.ImageBlade;
import com.google.code.p.bladerotor.shared.YouTubeBlade;

public class BladePanelFactory {

	public BladePanelFactory() {

	}

	public BladePanel getPanel(Blade blade) {

		BladePanel myPanel;
		
		if (blade instanceof ImageBlade) {
			myPanel = getPanel((ImageBlade) blade);
		} else if (blade instanceof TextBlade) {
			myPanel = getPanel((TextBlade) blade);
		} else if (blade instanceof YouTubeBlade) {
			myPanel = getPanel((YouTubeBlade) blade);
		} else {
			myPanel = null;
			//TODO throw something
		}
		
		return myPanel;

	}

	private ImageBladePanel getPanel(ImageBlade blade) {
		ImageBladePanel panel = new ImageBladePanel(blade);
		return panel;
	}

	private TextBladePanel getPanel(TextBlade blade) {
		TextBladePanel panel = new TextBladePanel(blade);
		return panel;
	}

	private YouTubeBladePanel getPanel(YouTubeBlade blade) {
		YouTubeBladePanel panel = new YouTubeBladePanel(blade);
		return panel;
	}

}
