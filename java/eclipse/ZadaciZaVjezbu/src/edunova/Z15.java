package edunova;

import javax.swing.JOptionPane;

public class Z15 {
	// Treba unijeti tri realna broja pa pronaći i ispisati najmanji.
	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi broj"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi broj"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Unesi treći broj"));
		double min = a;
		if (b < min) {
			b = min;
		}
		if (c < min) {
			c = min;
		}

		System.out.println("Najmanji broj od " + a + ", " + b + ", " + c + " je " + min);
	}

}
