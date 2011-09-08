package com.google.code.p.bladerotor.shared;

public class ImageBlade extends Blade {
	
	protected String myUrl;
	
	public ImageBlade(String url) {
		setUrl(url);
	}
	
	public ImageBlade(String name, String url) {
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
