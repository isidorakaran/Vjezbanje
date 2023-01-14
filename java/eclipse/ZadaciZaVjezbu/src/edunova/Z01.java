package edunova;

import javax.swing.JOptionPane;

public class Z01 {
//omogući upis cijelih brojeva X i Y sve dok uslov X<Y i X>0 nije zadovoljen
//napravi sumu svih parnih brojeva iz intervala X i Y
//primjer:ako si za sve vrijednosti varijabli X i Y upisao brojeve 3 i 12, program ispisuje poruku:
	//"Suma parnih brojeva iz intervala 3 i 12 je 40"
	
	public static void main(String[] args) {
		int x,y;
		do {
		 x = Integer.parseInt(JOptionPane.showInputDialog("Upiši vrijednost za X (X>0)"));
		}while(x<=0);
		
		
		do {
			 y = Integer.parseInt(JOptionPane.showInputDialog("Upiši vrijednost za Y(X<Y)"));
			}while(x>=y);
			
	int suma=0;
	for(int i=x;i<=y;i++) {
		if(i%2==0) {
			suma+=i;
		}
		
	}System.out.println("Suma parnih brojeva intervala " + x + " i " + y + " je " + suma);
	}
}
