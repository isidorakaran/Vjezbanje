package edunova;

public class E03OmotaciPrimitivnihTipova {
	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE + 1);

		int i = Integer.parseInt("3");
		System.out.println(i);

		boolean b = Boolean.parseBoolean("true");
		short s = Short.parseShort("45");
		byte y = Byte.parseByte("47");
		long l = Long.parseLong("34567");
		double d = Double.parseDouble("22");
		float f = Float.parseFloat("5.12");
		char c = Character.valueOf('Z');

		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		System.out.println(y);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

	}

}
