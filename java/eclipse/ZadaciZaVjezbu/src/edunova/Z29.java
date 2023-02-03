package edunova;

import javax.swing.JOptionPane;

public class Z29 {
	//Potrebno je zbrojiti N odabranih cijelih brojeva
	public static void main(String[] args) {
		int broj;
		int zbroj=0;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Upiši koliko brojeva želiš zbrajati"));
		for(int i=1;i<=n;i++) {
			broj=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
			zbroj+=broj;
		}System.out.println(zbroj);
	}
}
