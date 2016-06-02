package webprogramming;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;

public class Parrot extends Bird{
	private boolean hidden=false;
	public Parrot() throws IOException {
		
	}
	public Parrot(String inColor,int inSatiety) throws IOException {
		
		this.color=inColor;
		this.satiety=inSatiety;
	}
	public Parrot(String inColor,int inSatiety, String inName) throws IOException {
		
		this.color=inColor;
		this.satiety=inSatiety;
		this.name=inName;
	}

	public int[] meet(int i, Bird b){
		int[] result={0,0};
		if (b.getClass().equals(Parrot.class)){
			this.fright=false;
			this.hidden=false;
		}
		else if (b.getClass().equals(Eagle.class)){
			if(this.hidden||b.fright==true){
			}
			else{
				if(i==1){
				if(Math.random()*b.satiety/100>0.5){
					result[0]=1;
				}
				else{
					this.hidden=true;
				}
				
			} else{

				if(Math.random()*b.satiety/100>0.2){
					result[0]=1;
				}
				else{
					this.hidden=true;
				}
			}
				}
		}
		else if (b.getClass().equals(Ostrich.class)){
			if(this.hidden){
			} else{
				result[1]=1;
			}
			
		}
		return result;
	}

}
