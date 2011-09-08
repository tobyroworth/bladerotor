package com.google.code.p.bladerotor.shared;

public class YouTubeBlade extends Blade {
	
	protected String myUrl;
	
	public YouTubeBlade(String url) {
		setUrl(url);
	}
	
	public YouTubeBlade(String name, String url) {
		setName(name);
		setUrl(url);
	}

	public String getUrl() {
		return myUrl;
	}

	public void setUrl(String myUrl) {
		this.myUrl = myUrl;
	}

}
