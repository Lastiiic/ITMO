package webprogramming;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Eagle extends Bird {
	public Eagle() throws IOException {
		
	}
	public Eagle(String inColor,int inSatiety) throws IOException {
		
		this.color=inColor;
		this.satiety=inSatiety;
	}
	public Eagle(String inColor,int inSatiety, String inName) throws IOException {
		
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
				
			case 1:
				result[0]=2;
			case 2:
				result[0]=1;
			}
			this.fright=false;
		}
		else if (b.getClass().equals(Eagle.class)){
			this.fright=false;
			
		}
		else if (b.getClass().equals(Ostrich.class)){
			if(b.fright){
				
			} else{
				this.fright=true;
				
			}
			
		}
		return result;
	}
}
