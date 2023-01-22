package edunova;

import javax.swing.JOptionPane;

public class Z10 {
	//Korisnik unosi prirodne brojeve.Nakon posljednjeg broja upisuje 0.Program ispisuje najveći uneseni broj.
	//Ispis neka bude oblika: 
	//Upisi prirodni broj:
	//...
	//Najveći prirodni broj je...
	public static void main(String[] args) {
		int n;
		int max=0;
		JOptionPane.showMessageDialog(null, "Nakon posljednjeg broja upiši 0!");
		do {
			n=Integer.parseInt(JOptionPane.showInputDialog("Upisi prirodni broj:"));
			if(n>max) {
				max=n;
			}
		}while(n!=0);
		
		System.out.println(max);
	}

}
