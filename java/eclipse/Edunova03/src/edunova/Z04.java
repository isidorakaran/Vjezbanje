package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	// Za unesena dva cijela broj
		// program ispisuje veći
		// 3 i 5 -> 5
		// 5 i 3 -> 3
		// 5 i 5 ->
	public static void main(String[] args) {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		if(i>j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}
		
	}

}
