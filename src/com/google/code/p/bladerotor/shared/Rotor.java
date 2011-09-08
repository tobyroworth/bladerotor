package com.google.code.p.bladerotor.shared;

import java.util.ArrayList;

public class Rotor {

	private ArrayList<Blade> myBlades = new ArrayList<Blade>();

	public Rotor() {

	}
	
	public int size() {
		return myBlades.size();
	}
	
	public Blade getBlade(int pos) {
		return myBlades.get(pos);
	}
	
	public boolean addBlade(Blade newBlade) {
		boolean success = false;
		
		int endPos = myBlades.size();
		
		success = addBlade(newBlade, endPos);
		
		return success;
	}
	
	public boolean addBlade(Blade newBlade, int position) {
		boolean success = false;

		myBlades.add(position, newBlade);

		return success; 
	}
	
	// TODO add update notification signal
}
