package edunova;

public class Z02 {
	// Program ispisuje brojeve od 100 do 1
		// u istom redu odvojeno zarezom
	public static void main(String[] args) {
		for( int i=100;i>0;i--) {
			if(i==1) {
				System.out.println(i);
			}else {
			System.out.print(i + ",");
			}
		}
	}

}
