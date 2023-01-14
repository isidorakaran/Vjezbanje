package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	//Unesenom prirodnom broju ispišite vrijednosti pojedinih znamenaka počevši
	//od znamenke najmanje težinske vrijednosti
	//Ispis neka bude oblika: unesi prirodni broj
	public static void main(String[] args) {
		int x=Integer.parseInt(JOptionPane.showInputDialog("Unesi prirodni broj"));
		int broj =x;
		while(broj!=0) {
			System.out.println(broj%10);
			broj/=10;
		}
	}

}
