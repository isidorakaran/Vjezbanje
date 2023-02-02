package edunova;

import javax.swing.JOptionPane;

public class Z12 {
//Treba unijeti realni broj pa provjeriti da li je >=0. 
//Ako nije, treba izračunati apsolutnu vrijednost unesenog broja. 
//Dobiveni broj, koji je sigurno pozitivan, treba zaokružiti na prvi manji cijeli broj.
//Potom treba provjeriti da li je broj paran. 
//Ako je paran treba izračunati i ispisati njegovu treću potenciju,
//a ako nije treba ispisati: Broj je neparan.
	public static void main(String[] args) {
		double a;
		a = Double.parseDouble(JOptionPane.showInputDialog("Unesi realni broj"));
		if (a < 0) {
			a = Math.abs(a);
		}
		System.out.println(a);
		a=Math.floor(a);
		System.out.println("Prvi manji cijeli broj je: "+a);
		double rezultat;
		if(a%2==0) {
			rezultat=Math.pow(a, 3);
			System.out.println(rezultat);
		}else
			System.out.println("Broj je neparan");
	}

}
