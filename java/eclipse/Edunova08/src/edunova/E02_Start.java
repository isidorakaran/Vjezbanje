package edunova;

import java.util.Date;

public class E02_Start {
	public static void main(String[] args) {
		Osoba osoba=new Osoba();
		osoba.setIme(Pomocno.obavezanUnosStringa("Unesi ime:"));
		osoba.setPrezime("Perić");
		osoba.setGodine(24);
		System.out.println(osoba.getPrezime());
		
		Osoba[] osobe=new Osoba[5];
		osobe[0]=osoba;
		osoba=new Osoba();
		osoba.setIme("Marina");
		osobe[1]=osoba;
		osobe[2]=kreirajOsobu("Ana", "Anić", 20);
		osobe[3]=kreirajOsobu("Marko","Marić", 30);
		osobe[4]=kreirajOsobu("Luka","Lukić", 19);
		for(Osoba o:osobe) {
			System.out.println(o.getIme());
		}
		
		Mjesto mjesto=new Mjesto();
		Zupanija zupanija=new Zupanija();
		zupanija.setNaziv("OBŽ");
		mjesto.setZupanija(zupanija);
		System.out.println(mjesto.getZupanija().getNaziv());
		
		Grupa jp27=kreirajGrupu(1, "JP27", 20,new Date(),kreirajSmjer(1, "Java programiranje", 5999.99f, 500, true));
		Grupa pp27=kreirajGrupu(2, "PP27",20, new Date(), kreirajSmjer(2,"PHP programiranje",4999.99f,500, false));
		
		//Zadatak: ispiši jp27,pp27 i ispiši zbroj cijena oba smjera
		
		System.out.println(jp27.getNaziv());
		System.out.println(pp27.getSmjer().getNaziv());
		System.out.println(jp27.getSmjer().getCijena()+pp27.getSmjer().getCijena());
		
	}
	
	private static Osoba kreirajOsobu(String ime, String prezime,int godine) {
		Osoba osoba=new Osoba();
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		osoba.setGodine(godine);
		return osoba;
	}
	
	private static Smjer kreirajSmjer(int sifra,String naziv,float cijena,float upisnina,boolean certificiran) {
		Smjer smjer=new Smjer();
		smjer.setSifra(sifra);
		smjer.setNaziv(naziv);
		smjer.setCijena(cijena);
		smjer.setUpisnina(upisnina);
		smjer.setCertificiran(certificiran);
		return smjer;
	}
	private static Grupa kreirajGrupu(int sifra,String naziv,int maksimalnoPolaznika,Date datumPocetka,Smjer smjer) {
		Grupa grupa=new Grupa();
		grupa.setSifra(sifra);
		grupa.setNaziv(naziv);
		grupa.setMaksimalnoPolaznika(maksimalnoPolaznika);
		grupa.setDatumPocetka(datumPocetka);
		grupa.setSmjer(smjer);
		return grupa;
	}

}
