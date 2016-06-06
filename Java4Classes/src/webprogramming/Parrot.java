package webprogramming;

import java.io.IOException;

public class Parrot extends Bird{
	protected boolean hidden=false;
	public void hide(){
		this.hidden=true;
	}
	public Parrot(){
		super();
	}
	public Parrot(String inColor, int inSatiety, String inName) {
		super(inColor,inSatiety,inName);
	}
	public Parrot(String inColor, int inSatiety, String inName, boolean here) {
		super(inColor,inSatiety,inName,here);
	}
	public Parrot(String inColor,int inSatiety) throws IOException {
		super(inColor,inSatiety);
	}
	public boolean find(Parrot p){
		if(p.hidden){
			if (Math.random() > 0.5) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

}
