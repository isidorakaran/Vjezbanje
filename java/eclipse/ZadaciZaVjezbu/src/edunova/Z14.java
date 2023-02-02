package edunova;

import javax.swing.JOptionPane;

public class Z14 {
	// Treba unijeti koeficijente kvadratne jednadžbe,
	// pa ovisno o njihovim vrijednostima izračunati i ispisati rješenja.
	// Važno je provjeriti vrijednost koeficijenta a, ako je a=0, jednadžba nije
	// kvadratna.
	// Treba provjeriti predznak diskriminante jer on određuje hoće li rješenja
	// kvadratne
	// jednadžbe bit realni ili kompleksni brojevi.
	public static void main(String[] args) {
		double a=Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi broj"));
		double b=Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi broj"));
		double c=Double.parseDouble(JOptionPane.showInputDialog("Unesi treći broj"));
		double x1,x2,broj;
		broj=(b*b)-(4*a*c);
		if(a==0) {
			System.out.println("Jednačina nije kvadratna");
		}else if((b*b)<(4*a*c)){
			
			System.out.println("Rješenja kvadratne jednačine su kompleksna");
		}else {
			x1=(-b+Math.sqrt(broj))/2*a;
			x2=(-b-Math.sqrt(broj))/2*a;
			System.out.println("Rješenja su realni brojevi x1="+x1+" i x2="+x2);
		}
			

	}
}
