package webprogramming;

import java.io.IOException;

public class java_main {
	public static void main(String[] args) throws IOException {

		Parrot n1 = new Parrot("red",100);
		Parrot n2 = new Parrot("pink",100);
		Parrot n3 = new Parrot("yellow",100);
		Eagle m7 = new Eagle("violet",0);
		Ostrich Max = new Ostrich("green",100);
		if(m7.hunt(n1)){
			n1=null;
		}
		n2.hide();
		if(
		n3.find(n2)){
			n2.flyAway();
			n3.flyAway();
			Max.saveTheHead();
		}
	}
}