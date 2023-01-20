package edunova;

public class Z07 {
	// Ispišite sve četveroznamenkaste brojeve čiji je umnožak znamenaka 100. Ispis
	// neka bude oblika:
	// Brojevi čiji je umnožak znamenaka 100 su:
	public static void main(String[] args) {
		int j, d, s, t;
		System.out.println("Brojevi čiji je umnožak znamenaka 100 su:");
		for (int i = 1000; i < 10000; i++) {
			j = i % 10;
			d = (i / 10) % 10;
			s = (i / 100) % 10;
			t = (i / 1000) % 10;
			if (j * d * s * t == 100) {
				System.out.println(i);
			}
		}
	}

}
