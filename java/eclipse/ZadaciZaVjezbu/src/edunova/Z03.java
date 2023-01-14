package edunova;

public class Z03 {
	//Prebrojite sve prirodne brojeve deljive s 3 iz raspona od 1 do 9999.Ispis neka bude oblika:
	//U intervalu od 1 do 9999 ima ... brojeva deljivih sa 3
	
	public static void main(String[] args) {
		int brojac=0;
		for(int i=1;i<=9999;i++) {
			if(i%3==0) {
				brojac++;
				
			}
		}
		System.out.println("U intervalu od 1 do 9999 ima " + brojac + " brojeva deljivih sa 3");
	}

}
