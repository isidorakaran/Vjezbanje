package edunova;

public class Z20 {
// Potrebno je ispisati sve troznamenkaste brojeve čiji je zbroj znamenaka 5,
// a zadnja im je znamenka 0 (znamenka jedinice). Ispis neka bude oblika:
//Troznamenkasti brojevi ciji je zbroj znamenaka 5, a zadnja im je znamenka 0 su:
	public static void main(String[] args) {
		int j, d, s, zbroj;
		for (int i = 100; i <= 999; i++) {
			j = i % 10;
			d = (i / 10) % 10;
			s = i / 100;
			zbroj = j + d + s;
			if ((zbroj == 5) && (j == 0)) {
				System.out.println(i);
			}

		}
	}

}
