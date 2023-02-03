package edunova;

import javax.swing.JOptionPane;

public class Z31 {
	// Potrebno je provjeriti da li je odabrani prirodni broj prost
	public static void main(String[] args) {
		int brojac=0;
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prirodan broj"));
		for (int i = 1; i <=broj; i++) {
			if (broj % i == 0) {
				brojac++;
			}
		}
		if(brojac==2) {
			System.out.println("Broj je prost");
		}else {
			System.out.println("Broj nije prost");
		}


	}
}