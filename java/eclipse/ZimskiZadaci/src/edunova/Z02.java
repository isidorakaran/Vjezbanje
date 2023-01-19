package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	//Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između njih.
	
	public static void main(String[] args) {
		
		int x=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int y=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int brojac=0;
		
		for(int i=x;i<=y;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					brojac++;
				}
			}
			if(brojac<=2) {
				System.out.println(i); 
				
			}
			brojac=0;
		}
		
	}

}
