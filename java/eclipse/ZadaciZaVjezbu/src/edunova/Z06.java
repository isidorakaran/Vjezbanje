package edunova;

import javax.swing.JOptionPane;

public class Z06 {
	// saberi sve cifre unesenog prirodnog broja
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi prirodan broj:"));
		int broj = x;
		int suma = 0;
		while (broj != 0) {
			suma += broj % 10;
			broj /= 10;
		}
		System.out.println("Suma: " + suma);
	}

}
