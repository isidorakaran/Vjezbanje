package edunova;

import javax.swing.JOptionPane;

public class E02_Program {
	public static void main(String[] args) {

		// Treba unijeti od korisnika
		// 5 brojeva i ispisati njihov zbroj
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			suma += Pomocno.ucitajCijeliBroj();
		}
		System.out.println(suma);

	}
}
