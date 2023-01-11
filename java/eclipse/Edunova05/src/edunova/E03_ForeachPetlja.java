package edunova;

public class E03_ForeachPetlja {
	public static void main(String[] args) {
		int[] niz= {2,2,3,4,5,3};
		for(int i=0;i<niz.length;i++) {
		System.out.println(niz[i]);
	}
		for(int v: niz) {
			System.out.println(v);
		}
				
		for(int i=niz.length-1;i>-1;i--) {
			System.out.println(niz[i]);
		}
		}

}
