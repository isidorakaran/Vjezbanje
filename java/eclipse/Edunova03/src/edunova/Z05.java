package edunova;

import javax.swing.JOptionPane;

public class Z05 {
	// Za upisana 3 cijela broja
		// program ispisuje najveći
	public static void main(String[] args) {
		
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		if(i>j && i>k) {
			System.out.println(i);
		}else if (j>i && j>k) {
			System.out.println(j);
		}else {
			System.out.println(k);
		}
		
		}

}

