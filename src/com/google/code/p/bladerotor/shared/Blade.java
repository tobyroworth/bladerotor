package com.google.code.p.bladerotor.shared;

public abstract class Blade {

	protected String myName = new String();

	public Blade() {
		
	}

	public Blade(String name) {
		setName(name);
	}
	
	public String getName() {
		return myName;
	}

	public void setName(String myName) {
		this.myName = myName;
	}
	
}
