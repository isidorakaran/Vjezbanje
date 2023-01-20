package edunova;

import javax.swing.JOptionPane;

public class Z09 {
	//Unesite n realnih brojeva pa izračunajte njihovu srednju vrijednost
	//Unos brojeva traje sve dok korisnik ne upiše 0
	//Ispis neka bude ovog oblika. 
	//Nakon posljednjeg broja unesi 0
	//Unesi broj:
	//...
	//Uneseno je..brojeva. Srednja vrijednost je...
	public static void main(String[] args) {
		int n;
		int brojac=0;
		int zbroj=0;
		float srednjaVrijednost=0;
		JOptionPane.showMessageDialog(null,"Nakon posljednjeg broja unesi 0!");
		do {
			n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));	
			zbroj+=n;
			brojac++;
		}while(n!=0);
		
		srednjaVrijednost=zbroj/brojac;
		System.out.println("Unešeno je "+brojac+" brojeva. Srednja vrijednost je "+ srednjaVrijednost);
		
	}

}
