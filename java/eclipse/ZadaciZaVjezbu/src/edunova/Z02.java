package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	//Zbrojite N članova niza:
	//(1 +1/2+1/3+1/4+1/5+...+1/n). Ispis neka bude oblika:
	//Upiši željeni broj članova niza:
	//Zbroj...članova niz iznosi...
	public static void main(String[] args) {
		
	int n=Integer.parseInt(JOptionPane.showInputDialog("Upiši željeni broj članova niza:"));
	double suma=0;
	for(int i=1;i<=n;i++) {
	
			suma+=(double)1/i;
		}
	
	System.out.println("Zbroj " + n + " članova niza iznosi " + suma);
	}
}


