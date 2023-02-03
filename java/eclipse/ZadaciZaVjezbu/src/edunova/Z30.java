package edunova;

import javax.swing.JOptionPane;

public class Z30 {
	//Potrebno je ispisati i zbrojiti sve prirodne brojeve djeljive s 3 iz raspona od 1 do N.
	public static void main(String[] args) {
		int zbroj=0;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Upiši završnu vrijednost"));
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				zbroj+=i;
			}
		}System.out.println(zbroj);
	}

}
