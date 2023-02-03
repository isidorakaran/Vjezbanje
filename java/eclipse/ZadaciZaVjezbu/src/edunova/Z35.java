package edunova;

public class Z35 {
	//Potrebno je ispisati sve troznamenkaste brojeve koji su djeljivi sa 7, a zadnja im je znamenka 7.
public static void main(String[] args) {
	for(int i=100;i<=999;i++) {
		if(i%7==0 && i%10==7) {
			System.out.println(i);
		}
	}
}
}
