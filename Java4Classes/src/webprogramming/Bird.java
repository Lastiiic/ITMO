package webprogramming;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Bird {

	public String color;
	public boolean fright;
	
	public int satiety;
	public Image myPhoto;
	public String name;
	public Bird() {
		
		this.color="Default";
		this.satiety=100;
		this.name="Yet another simple bird";
	}
	public ArrayList<ArrayList<Bird>> fly(ArrayList<Bird> inold, ArrayList<Bird> inl){
		ArrayList<Bird> old=inold;
		ArrayList<Bird> newLocation=inl;
		int[] outputMeet;
		newLocation.add(this);
		Bird b;
		old.remove(this);
		Iterator<Bird> s=newLocation.iterator();
		if(this.getClass().equals(Parrot.class)){
			
		}
		while(s.hasNext()){
			b=s.next();
			outputMeet=this.meet(3,b);
			switch(outputMeet[0]){
			case 1:
				newLocation.remove(b);
				break;
			case 2:
				newLocation.remove(this);
				break;
				default:
					break;
			}
		}
		ArrayList<ArrayList<Bird>> a = new ArrayList<ArrayList<Bird>>();
		a.add(old);
		a.add(newLocation);
		return a;
		
	}
	public ArrayList<ArrayList<Bird>> run(ArrayList<Bird> inold, ArrayList<Bird> inl){
		ArrayList<Bird> old=inold;
		ArrayList<Bird> newLocation=inl;
		int[] outputMeet;
		newLocation.add(this);
		Bird b;
		old.remove(this);
		Iterator<Bird> s=newLocation.iterator();
		if(this.getClass().equals(Parrot.class)){
			
		}
		while(s.hasNext()){
			b=s.next();
			outputMeet=this.meet(3,b);
			switch(outputMeet[0]){
			case 1:
				newLocation.remove(b);
				break;
			case 2:
				newLocation.remove(this);
				break;
				default:
					break;
			}
		}
		ArrayList<ArrayList<Bird>> a = new ArrayList<ArrayList<Bird>>();
		a.add(old);
		a.add(newLocation);
		return a;
		
	}
	public ArrayList<ArrayList<Bird>> jump(ArrayList<Bird> inold, ArrayList<Bird> inl){
		ArrayList<Bird> old=inold;
		int[] outputMeet;
		ArrayList<Bird> newLocation=inl;
		newLocation.add(this);
		Bird b;
		old.remove(this);
		Iterator<Bird> s=newLocation.iterator();
		if(this.getClass().equals(Parrot.class)){
			
		}
		while(s.hasNext()){
			b=s.next();
			outputMeet=this.meet(3,b);
			switch(outputMeet[0]){
			case 1:
				newLocation.remove(b);
				break;
			case 2:
				newLocation.remove(this);
				break;
				default:
					break;
			}
		}
		ArrayList<ArrayList<Bird>> a = new ArrayList<ArrayList<Bird>>();
		a.add(old);
		a.add(newLocation);
		return a;
		
	}
	public abstract int[] meet(int i, Bird b);
}
