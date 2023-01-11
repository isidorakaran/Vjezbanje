package edunova;

import javax.swing.JOptionPane;

public class E01_WhilePetlja {
public static void main(String[] args) {
	while(true) {
		break;
	}
	
	boolean uvjet=false;
	while(uvjet) {
		System.out.println("Osijek");
	}
	
	for(int i=0;i<0;) {
		System.out.println("neće ući");
	}
	
	int broj=0;
	while(broj<10) {
		System.out.println(++broj);
		
	}
	
	int b=0;
	while(true) {
		b=Integer.parseInt(JOptionPane.showInputDialog("unesi broj između 1 i 10"));
		if(b>=1 && b<=10) {
			break;
		}
		System.out.println(b);
	}
	
	
}
}
