package edunova;

import javax.swing.JOptionPane;

public class Z36 {
	// Treba unijeti N realnih brojeva pa izračunati njihovu srednju vrijednost.
	// Unos brojeva traje sve dok korisnik ne upiše 0. Primjer riješiti do-while
	// petljom.
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Nakon posljednjeg broja unesi 0");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int broj = 0;
		do {
			n = n / 10;
			broj += 1;
		} while (n > 0);
		System.out.println(broj);
	}
}
