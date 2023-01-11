package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	// Korisnik unosi dva cijela broja
	 // Program ispisuje 
	 // zbroj svih parnih brojeva
	 // između dva unesena broja
	public static void main(String[] args) {
		int x=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	int zbroj=0;
	for(int i=x;i<=y;i++) {
		if(i%2==0) {
			zbroj+=i;
		}
		
	}
	System.out.println(zbroj);
	}
	

}
