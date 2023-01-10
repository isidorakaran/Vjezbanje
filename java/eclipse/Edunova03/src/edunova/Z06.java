package edunova;

import javax.swing.JOptionPane;

public class Z06 {
	// program unosi broj između 
		// 1 i 999
		// U slučaju da je izvan tog raspona
		// ispisati grešku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 greška
		// 1067 greška
		// 456 4
		// 6 6
		// 89 8
	public static void main(String[] args) {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 999"));
		if(i>0 && i<9) {
			System.out.println(i + " " + i);
		}else if (i>9 && i <100) {
			System.out.println(i + " " + (i/10));
		
		}
		else if(i>99 && i<1000) {
			System.out.println(i + " " + (i/100));
		}
		else {
			System.out.println("Greska");
		}
		
	
	}

}
