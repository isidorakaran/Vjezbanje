package edunova;

import javax.swing.JOptionPane;

public class Z22 {
	//Treba unijeti N realnih brojeva (N nije unaprijed poznat!) pa izračunati i prikazati 
	//njihovu srednju vrijednost (brojeve upisuje korisnik). 
	//Nakon posljednjeg broja treba unijeti nulu. Ispis neka bude oblika:
public static void main(String[] args) {
	
	int brojac = 0;
	float zbroj = 0;
	JOptionPane.showMessageDialog(null, "Nakon posljednjeg broja unesi 0!");
	int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
	zbroj += n;

	while(n!=0) {
		n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
		zbroj += n;
		brojac++;
	} 
	System.out.println("Srednja vrijednost je "+(zbroj/brojac));

}
}
