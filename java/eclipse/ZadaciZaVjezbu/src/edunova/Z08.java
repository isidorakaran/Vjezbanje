package edunova;

public class Z08 {
	// Potražite pa ispišite brojeve djeljive sa 7 iz raspona od 200 do 300
	// ispis neka bude oblika:
	// Brojevi djeljivi sa 7 iz raspona 200 do 300 su:
	// -----
	public static void main(String[] args) {
		System.out.println("Brojevi djeljivi sa 7 iz raspona 200 do 300 su:");
		for (int i = 200; i <= 300; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
