package edunova;

import java.util.Date;

public class Zadaci_Start {
	public static void main(String[] args) {
		Racunalo r1=kreirajRacunalo("Dell","crna", "Windows 10",2.80f, false);
		Racunalo r2=kreirajRacunalo("Samsung","siva","Windows 11 Pro", 2.80f, true);
		System.out.println(r1.getNaziv());
		
		Racun[] racuni=new Racun[3];
		racuni[0]=kreirajRacun(new Date(), 299.99f,kreirajKupca("Ana","Vukovarska 21" ));
		racuni[1]=kreirajRacun(new Date(), 456.99f, kreirajKupca("Iva","Zagrebačka 54"));
		racuni[2]=kreirajRacun(new Date(),999.99f, kreirajKupca("Matej", "Borovska 13"));
		for(Racun r:racuni) {
			System.out.println(r.getKupac().getAdresa());
		}
		
		
		
		
	}
private static Racunalo kreirajRacunalo(String naziv,String boja,String operativniSustav,float procesor,boolean touchscreen) {
	Racunalo r=new Racunalo();
	r.setNaziv(naziv);
	r.setBoja(boja);
	r.setOperativniSustav(operativniSustav);
	r.setProcesor(procesor);
	r.setTouchscreen(touchscreen);
	return r;
}
private static Racun kreirajRacun(Date datum,float iznos,Kupac kupac) {
	Racun ra=new Racun();
	ra.setDatum(datum);
	ra.setIznos(iznos);
	ra.setKupac(kupac);
	return ra;
}
private static Kupac kreirajKupca(String naziv,String adresa) {
	Kupac k=new Kupac();
	k.setNaziv(naziv);
	k.setAdresa(adresa);
	return k;
}
}
