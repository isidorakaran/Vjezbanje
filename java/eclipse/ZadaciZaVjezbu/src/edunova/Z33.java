package edunova;

public class Z33 {
	// Potrebno je ispisati sve savršene prirodne brojeve iz raspona od 1 do 3000.
	public static void main(String[] args) {
		int zbroj;
		for (int i = 1; i <= 3000; i++) {
			zbroj = 0;
			for (int j = 1; j <= (i - 1); j++) {
				if (i % j == 0) {
					zbroj += j;
				}

			}
			if (zbroj == i) {
				System.out.println(i);
			}

		}
	}

}
