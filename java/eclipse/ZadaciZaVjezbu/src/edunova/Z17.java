package edunova;

import javax.swing.JOptionPane;

public class Z17 {

	//Potrebno je zbrojiti prvih N prirodnih brojeva. Ispis neka bude oblika:
	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj do kojeg će se zbrajati"));
		int zbroj=0;
		for(int i=0;i<=n;i++) {
			zbroj=zbroj+i;
			
		}System.out.println("Zbroj je "+zbroj);
	}
}
