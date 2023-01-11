package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {
		//korisnik unosi 5 brojeva
		//program ispisuje najveći
		int broj=0,b,najveci=Integer.MIN_VALUE;
		while(broj<5) {
			b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			broj++;
			if(b>najveci) {
				najveci=b;
			}
		}System.out.println(najveci);
		
		
	}

}
