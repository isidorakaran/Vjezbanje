package edunova;

public class E05_UlazniParametri {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("Obavezno dva parametra");
			return;
		}
		
		System.out.println("Izvodim program");
		
		
		System.out.println(args[0]);
		
	}
}
