package webprogramming;

import java.io.IOException;

public class Eagle extends Bird {

	public Eagle() {
		super();
	}

	public Eagle(String inColor, int inSatiety, String inName) {
		super(inColor, inSatiety, inName);
	}

	public Eagle(String inColor, int inSatiety, String inName, boolean here) {
		super(inColor, inSatiety, inName, here);
	}

	public Eagle(String inColor, int inSatiety) throws IOException {
		super(inColor, inSatiety);
	}

	public boolean hunt(Bird s) {
		if (s.getClass().equals(Parrot.class)) {
			Parrot p = (Parrot) s;
			if (p.hidden || this.fright == true) {
				return false;
			} else {
				if (Math.random() * this.satiety / 100 > 0.5) {
					this.satiety = 100;
					return true;
				} else {
					return false;
				}

			}
		}
		else{
			return false;
		}

	}
}
