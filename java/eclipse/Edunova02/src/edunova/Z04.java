package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int rezultat=i%10;
		System.out.println("Rezultat =" + " " + rezultat);
		
	}

}
