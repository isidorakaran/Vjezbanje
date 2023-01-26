package edunova;

import javax.swing.JOptionPane;

public class Z11 {
	// Program računa srednju ocjenu uspjeha učenika. Nakon posljednje ocjene treba
	// unijeti 0. U slučaju da je bilo koja od ocjena 1, ispisuje se poruka:
	// Negativan uspjeh. Ako se unese vrijednost koja nije iz raspona od 1 do 5,
	// ispisat će se poruka: Pogrešan unos.
	// Ispis neka bude oblika: Srednja ocjena uspeja je...
	public static void main(String[] args) {
		float srednjaOcjena = 0;
		float zbrojOcjena = 0;
		int ocjena;
		int brojac = 0;
		JOptionPane.showMessageDialog(null, "Nakon posljednje ocjene treba unijeti 0.");
		boolean ind = false;
		do {
			ocjena = Integer.parseInt(JOptionPane.showInputDialog("Unesi ocjenu"));
			if (ocjena == 1) {
				JOptionPane.showMessageDialog(null, "Negativan uspjeh");
				ind = true;
				break;
			}
			if (ocjena < 0 || ocjena > 5) {
				JOptionPane.showMessageDialog(null, "Pogrešan unos.");
			}
			zbrojOcjena += ocjena;
			brojac++;
		} while (ocjena != 0);
		if (!ind) {
			brojac -= 1;
			srednjaOcjena = zbrojOcjena / brojac;
			System.out.println("Srednja ocjena uspjeha je " + srednjaOcjena);
		}

	}

}
