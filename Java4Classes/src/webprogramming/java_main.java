package webprogramming;

import java.io.IOException;
import java.util.ArrayList;

public class java_main {
	public static void main(String[] args) throws IOException {
		ArrayList<Bird> tundra=new ArrayList<Bird>();
		tundra.add(new Parrot("red",100));
		tundra.add(new Parrot("pink",100));
		tundra.add(new Parrot("yellow",100));
		tundra.add(new Eagle("yellow",100));
	}
}