package edunova;

import javax.swing.JOptionPane;

public class Z26 {
	//Treba prebrojiti koliko brojeva unutar raspona od M do N ima znamenku jedinice vrijednosti 9.
	public static void main(String[] args) {
		int brojac=0;
		int m=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		for(int i=m;i<=n;i++) {
			if(i%10==9) {
				brojac+=1;
			}
		}
		System.out.println(brojac);
	}
}
