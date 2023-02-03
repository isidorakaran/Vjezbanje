package edunova;

import javax.swing.JOptionPane;

public class Z27 {
	//Treba provjeriti djeljivost brojeva iz odabranog raspona od M do N sa zadanim brojem B. 
public static void main(String[] args) {
	int m=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	int brojac=0;
	for(int i=m;i<=n;i++) {
		if(i%b==0) {
			brojac++;
		}
			
		
	}System.out.println(brojac);

}
}
