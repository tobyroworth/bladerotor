package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.Blade;
import com.google.code.p.bladerotor.shared.ImageBlade;

public class BladePanelFactory {

	public BladePanelFactory() {
		
	}
	
	public ImageBladePanel getPanel(ImageBlade blade) {
		ImageBladePanel panel = new ImageBladePanel(blade);
		return panel;
	}
	
	public BladePanel getPanel(Blade blade) {
		BladePanel panel = new BladePanel(blade);
		return panel;
	}
	
}
