package edunova;

import javax.swing.JOptionPane;

public class Z19 {
	//Potrebno je ispisati djelitelje odabranog prirodnog broja.
	//Po unosu broja treba provjeriti da li je uneseni broj prirodan,
	//ako nije valja ponoviti unos.
	public static void main(String[] args) {
		int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi prirodan broj"));
		System.out.println("Djeljitelji broja "+broj+" su: ");
		if(broj<=0) {
			broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi prirodan broj"));
		}
		for(int i=1;i<=broj;i++) {
			if(broj%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
