package edunova;

import javax.swing.JOptionPane;

public class Z23 {
	// Treba ispisati tablicu množenja odabranog broja sa brojevima od 1 do 10. Broj
	// bira korisnik.
	public static void main(String[] args) {
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj za množenje"));
		for (int i = 1; i <= 10; i++) {

			System.out.println(broj * i);
		}
	}
}
