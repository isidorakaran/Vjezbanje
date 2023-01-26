package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	/*
	 * Napravi program koji omogućava izračun prosječne visine (cm) učenika nekog
	 * razreda. Program ispisuje koliko ima učenika viših od 180 cm.
	 */
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj učenika"));
		float visina;
		float suma = 0;
		int brojac = 0;
		for (int i = 1; i <= n; i++) {
			visina = Float.parseFloat(JOptionPane.showInputDialog("Upiši visinu u cm"));
			suma += visina;
			if (visina > 180) {
				brojac++;
			}
		}
		float prosjek = suma / n;
		System.out.println("Broj učenika viših od 180 je " + brojac);
		System.out.println("Prosečna visina učenika je " + prosjek + " cm");

	}

}
