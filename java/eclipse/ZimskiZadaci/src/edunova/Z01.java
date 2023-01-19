package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	//Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i  najveći uneseni broj.
	public static void main(String[] args) {
		
		int zbroj=0;
		int x=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int min=x;
		int max=x;
		
		for(int i=1;i<24;i++) {
			zbroj+=x;
			x=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
						
			if(x<min)
				min=x;
			if(x>max)
				max=x;
			
		}
	
		System.out.println("Zbroj unesenih brojeva je " + zbroj);
		System.out.println("Najmanji uneseni broj je " + min);
		System.out.println("Najveći uneseni broj je " + max);
	}

}
