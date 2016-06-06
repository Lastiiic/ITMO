package webprogramming;

import java.io.IOException;

public class Ostrich extends Bird {
	protected boolean headInSand=false;


	public Ostrich(){
		super();
	}
	public Ostrich(String inColor, int inSatiety, String inName) {
		super(inColor,inSatiety,inName);
	}
	public Ostrich(String inColor, int inSatiety, String inName, boolean here) {
		super(inColor,inSatiety,inName,here);
	}
	public Ostrich(String inColor,int inSatiety) throws IOException {
		super(inColor,inSatiety);
	}
	public void saveTheHead(){
		if(!this.headInSand){
			if (Math.random() > 0.5) {
				this.fright=true;
				this.headInSand=true;
			}
			else{
				this.satiety=(int) (this.satiety*0.5);
			}
		}
	}
}
