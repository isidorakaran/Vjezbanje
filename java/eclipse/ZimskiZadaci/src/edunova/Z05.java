package edunova;

public class Z05 {
//	Kreiraj program koji će koristeći for petlje automatizirati ispis tablice množenja u ovom obliku:
//	-------------------------------
//	: : :  TABLICA  MNOZENJA  : : :
//	-------------------------------
//	 * |  1  2  3  4  5  6  7  8  9
//	-------------------------------
//	 1 |  1  2  3  4  5  6  7  8  9
//	 2 |  2  4  6  8 10 12 14 16 18
//	 3 |  3  6  9 12 15 18 21 24 27
//	 4 |  4  8 12 16 20 24 28 32 36
//	 5 |  5 10 15 20 25 30 35 40 45
//	 6 |  6 12 18 24 30 36 42 48 54
//	 7 |  7 14 21 28 35 42 49 56 63
//	 8 |  8 16 24 32 40 48 56 64 72
//	 9 |  9 18 27 36 45 54 63 72 81
//	-------------------------------
//	:  :  :  :  :  :   :by Tomislav
//	-------------------------------
//	Umjesto "Ime" treba ispisati ime uneseno s konzole i pri tome pripaziti da zadnje slovo imena bude poravnato s desnim rubom tablice.
	public static void main(String[] args) {
		for (int i = 1; i <= 31; i++) {
			System.out.print("-");

		}
		System.out.println();
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		for (int i = 1; i <= 31; i++) {
			System.out.print("-");

		}
		System.out.println();
		System.out.printf(" * |  1  2  3  4  5  6  7  8  9");

		System.out.println();
		for (int i = 1; i <= 31; i++) {
			System.out.print("-");

		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if (j == 1) {
					System.out.print(" " + i + " | ");
				}

				System.out.printf("%2d ", i * j);

			}
			System.out.println();

		}
		for (int i = 1; i <= 31; i++) {
			System.out.print("-");

		}
		System.out.println();
		System.out.println(":  :  :  :  :  :    :by Isidora");
		for (int i = 1; i <= 31; i++) {
			System.out.print("-");

		}
	}

}
