package edunova;

import javax.swing.JOptionPane;

public class Z13 {
	//Treba unijeti dva realna broja pa izračunati i ispisati njihov
	//cjelobrojni kvocijent i ostatak dijeljenja. 
	//Potrebno je načiniti i provjeru. 
	//Ako je djelitelj 0 treba ispisati odgovarajuću poruku.
public static void main(String[] args) {
	double a=Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi realni broj"));
	double b=Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi realni broj"));
	double rezultat;
	double ostatak;
	if(b==0) {
		System.out.println("Ne može se dijeliti sa 0");
	}else {
		rezultat=a/b;
		rezultat=Math.floor(rezultat);
		ostatak=a%b;
		System.out.println("Rezultat dijeljenja je "+rezultat+" , a ostatak je "+ostatak);
		System.out.println("Provjera: " + ((rezultat*b)+ostatak) );
		
	}

}
}
