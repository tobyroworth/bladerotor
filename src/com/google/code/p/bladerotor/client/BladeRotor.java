package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.TextBlade;
import com.google.code.p.bladerotor.shared.ImageBlade;
import com.google.code.p.bladerotor.shared.Rotor;
import com.google.code.p.bladerotor.shared.YouTubeBlade;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class BladeRotor implements EntryPoint {


	interface Binder extends UiBinder<DockLayoutPanel, BladeRotor> { }
	private static final Binder binder = GWT.create(Binder.class);

	private YouTubeBlade blade1 = new YouTubeBlade("YouTube Pirates", "http://www.youtube.com/embed/HlLbwB2gIDk");
	private ImageBlade blade2 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private YouTubeBlade blade3 = new YouTubeBlade("YouTube Bethany", "http://www.youtube.com/embed/S1HCT1UHmmQ");
	private ImageBlade blade4 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private ImageBlade blade5 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private ImageBlade blade6 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private ImageBlade blade7 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private ImageBlade blade8 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private ImageBlade blade9 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private TextBlade blade10 = new TextBlade("Test blade 7");
	private TextBlade blade11 = new TextBlade("Test blade 8");
	
	private Rotor myRotor = new Rotor();
	
	private RotorPanel mainRotor = new RotorPanel();;

	/**
	 * This method constructs the application user interface by instantiating
	 * controls and hooking up event handler.
	 */
	
	public BladeRotor() {
		myRotor.addBlade(blade1);
		myRotor.addBlade(blade2);
		myRotor.addBlade(blade3);
		myRotor.addBlade(blade4);
		myRotor.addBlade(blade5);
		myRotor.addBlade(blade6);
		myRotor.addBlade(blade7);
		myRotor.addBlade(blade8);
		myRotor.addBlade(blade9);
		myRotor.addBlade(blade10);
		myRotor.addBlade(blade11);
		
	}
	
	public void onModuleLoad() {
		DockLayoutPanel outer = binder.createAndBindUi(this);

		// Get rid of scrollbars, and clear out the window's built-in margin,
		// because we want to take advantage of the entire client area.
		Window.enableScrolling(false);
		Window.setMargin("0px");
		
		mainRotor.setRotor(myRotor);
		
		// Add the outer panel to the RootLayoutPanel, so that it will be
		// displayed.
		RootLayoutPanel root = RootLayoutPanel.get();
		
		
		
		root.add(outer);
		root.forceLayout();
		mainRotor.moveBlades();
	}

}
