package webprogramming;

import java.io.IOException;

public abstract class Bird {

	protected String color;
	protected boolean fright;
	protected boolean here=true;
	
	
	protected int satiety;
	protected String name;
	public Bird() {
		this.color="Default";
		this.satiety=100;
		this.name="Yet another simple bird";
		this.here=true;
	}
	public Bird(String inColor, int inSatiety, String inName) {
		
		this.color=inColor;
		this.satiety=inSatiety;
		this.name=inName;
		this.here=true;
	}
	public Bird(String inColor, int inSatiety, String inName, boolean here) {
		
		this.color=inColor;
		this.satiety=inSatiety;
		this.name=inName;
		this.here=here;
	}
	public Bird(String inColor,int inSatiety) throws IOException {
		
		this.color=inColor;
		this.satiety=inSatiety;
		this.name="Yet another simple bird";
		this.here=true;
	}
	public void flyAway(){
		this.here=false;
	}
	public void flyHere(){
		this.here=true;
	}
}
