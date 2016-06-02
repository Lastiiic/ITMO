package webprogramming;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ostrich extends Bird {
	public boolean headInSand;
	public Ostrich() throws IOException {
	}
	public Ostrich(String inColor,int inSatiety) throws IOException {
		this.color=inColor;
		this.satiety=inSatiety;
	}
	public Ostrich(String inColor,int inSatiety, String inName) throws IOException {
		this.color=inColor;
		this.satiety=inSatiety;
		this.name=inName;
	}

	public int[] meet(int i, Bird b){
		int[] result={0,0};
		int[] outputMeet;
		if (b.getClass().equals(Parrot.class)){

			outputMeet=b.meet(i, b);
			switch(outputMeet[0]){
			case 0:
				this.fright=false;
				
			case 1:
				result[0]=2;
			case 2:
				this.fright=false;
				result[0]=1;
			}
			if(outputMeet[1]==1){
				this.fright=true;
			}
		}
		else if (b.getClass().equals(Eagle.class)){
			outputMeet=b.meet(i, b);
			switch(outputMeet[0]){
			case 0:
				this.fright=false;
				
			case 1:
				result[0]=2;
			case 2:
				this.fright=false;
				result[0]=1;
			}
		}
		else if (b.getClass().equals(Ostrich.class)){
				this.fright=false;
				
		}
		return result;
	}
}
