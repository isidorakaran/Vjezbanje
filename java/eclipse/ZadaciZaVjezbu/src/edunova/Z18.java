package edunova;

import javax.swing.JOptionPane;

public class Z18 {
	// Potrebno je prebrojiti sve prirodne brojeve djeljive sa 7 iz raspona od M do
	// N.
	// Ispis neka bude oblika:
	// Upisi pocetnu vrijednost raspona:
	// Upisi zavrsnu vrijednost raspona:
	// U rasponu od ... do ... ima ... brojeva djeljivih sa
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj od kojeg će se zbrajati"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj do kojeg će se zbrajati"));
		int brojac = 0;
		for (int i = n; i <= m; i++) {
			if (i % 7 == 0) {
				brojac += 1;
			}
		}
		System.out.println("U rasponu od " + n + " do " + m + " ima " + brojac + "brojeva deljivih sa 7");

	}
}
