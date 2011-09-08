package com.google.code.p.bladerotor.client;

import com.google.code.p.bladerotor.shared.Blade;
import com.google.code.p.bladerotor.shared.ImageBlade;
import com.google.code.p.bladerotor.shared.Rotor;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class BladeRotor implements EntryPoint {


	interface Binder extends UiBinder<DockLayoutPanel, BladeRotor> { }
	private static final Binder binder = GWT.create(Binder.class);

	private Blade blade1 = new Blade("Test blade 1");
	private Blade blade2 = new Blade("Test blade 2");
	private ImageBlade blade3 = new ImageBlade("Image test", "http://www.google.com/images/logo.gif");
	private Blade blade4 = new Blade("Test blade 4");
	private Blade blade5 = new Blade("Test blade 5");
	private Blade blade6 = new Blade("Test blade 6");
	private Blade blade7 = new Blade("Test blade 7");
	private Blade blade8 = new Blade("Test blade 8");
	
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
