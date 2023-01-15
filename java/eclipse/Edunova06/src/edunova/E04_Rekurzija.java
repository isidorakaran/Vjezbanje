package edunova;

public class E04_Rekurzija {
	public static void stackoverflow() {
		stackoverflow();
	}

	public static int zbroj(int broj) {
		if (broj == 1) {
			return 1;
		}

		return broj + zbroj(broj - 1);
	}
}
