package edunova;

import javax.swing.JOptionPane;

public class Z24 {
	//Potrebno je ispisati prvih N neparnih brojeva. Ispis neka bude oblika:
public static void main(String[] args) {
	int i;
	int n=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
	System.out.println("Prvih " + n + " neparnih brojeva su: ");
	for(i=0;i<=n;i++) {
		if(i%2==1) {
			if(i!=n) {
				System.out.print(i + ", ");
			}else {
				System.out.print(i);
			}
			
	}				

}}
}
