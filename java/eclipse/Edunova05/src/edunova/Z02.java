package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {
		//program unosi 5 brojeva 
		//između 2 i 4
		//program ispisuje njihov umnožak
		long umnozak=1;
		int broj, brojac=0;
		while(brojac<5) {
			broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			if (broj>=2 && broj<=4) {
				umnozak*=broj;
				brojac++;
			}
			System.out.println(umnozak
					);
		}
		
		
	}

}
