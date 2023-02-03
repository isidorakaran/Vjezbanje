package edunova;

import javax.swing.JOptionPane;

public class Z32 {
//Potrebno je provjeriti da li je odabrani prirodni broj savršen
//(broj je savršen ako je jednak zbroju svih svojih djelitelja, osim njega samog).
	public static void main(String[] args) {
		int zbroj = 0;
		int savrsenBr = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		for (int i = 1; i <= (savrsenBr - 1); i++) {
			if (savrsenBr % i == 0) {
				zbroj += i;
			}
		}
		if (zbroj == savrsenBr) {
			System.out.println("Broj je savršen");
		} else {
			System.out.println("Broj nije savršen");
		}

	}
}
