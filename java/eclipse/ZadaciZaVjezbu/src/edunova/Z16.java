package edunova;

import javax.swing.JOptionPane;

public class Z16 {
	//Program na osnovu unesenog rednog broja mjeseca ispisuje koliko taj mjesec ima dana.
	//U slučaju unosa broja koji nije iz raspona od 1 do 12 treba ispisati upozorenje.
	//Ispis neka bude oblika:
	public static void main(String[] args) {
		int mjesec=Integer.parseInt(JOptionPane.showInputDialog("Unesi redni broj mjeseca"));
		switch(mjesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Mjesec ima 31 dan");
			break;
		case 2:
			System.out.println("Mjesec ima 28 dana, kada je prestupna godina 29.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Mjesec ima 30 dana");
			break;
		default:
			System.out.println("Upozorenje broj nije u rasponu");
			break;
		}
			
		}
	}


