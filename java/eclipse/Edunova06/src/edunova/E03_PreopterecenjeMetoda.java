package edunova;

public class E03_PreopterecenjeMetoda {
	public static int zbroji(int a,int b) {
		return a+b;
	}
	
	public static int zbroji(float a,float b) {
		return (int)(a+b);
	}
	
	public static int zbroji(int a, int b, int c) {
		return zbroji(a,b)+c;
	}
	
	public static int zbroji(int[] brojevi) {
		
		int zbroj=0;
		for(int i: brojevi) {
			zbroj+=i;
		}
		return zbroj;
	}
}
