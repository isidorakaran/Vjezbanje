package karan.obrada;

import java.util.List;

import karan.Pomocno;
import karan.Start;
import karan.model.Pas;

public class Psi {
	private List<Pas> psi;
	private Start start;
	public Psi(Start start) {
		super();
		this.start = start;
	}
	public Psi(List<Pas> psi, Start start) {
		super();
		this.psi = psi;
		this.start = start;
	}
	private void testPodaci() {
		if(Pomocno.DEV) {
			psi.add(new Pas(1, false, "Bobi", "muški", 7,15.2f));
			psi.add(new Pas(2, true, "Max", "muški", 2,17.1f));
			psi.add(new Pas(3, true, "Lea", "ženski", 4,7.5f));

		}
	}
	
	public void izbornik() {
		System.out.println("");
		System.out.println("Pas izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1.Pregled svih pasa");
		System.out.println("2.Unos novog psa");
		System.out.println("3.Promjena postojećeg psa");
		System.out.println("4.Brisanje psa");
		System.out.println("5.Povratak na glavni izbornik");
		odabirIzbornika();
	}
	private void odabirIzbornika() {
		switch(Pomocno.unosBrojRaspon("Odaberi opciju", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unosNovog();
			break;
		case 3:
			if(psi.size()==0) {
				System.out.println("Nema pasa koje " + "bi mjenjali!");
				izbornik();
			}else
				promjena();
		case 4:
			if(psi.size()==0) {
				System.out.println("Nema pasa" + "koje"+"bi brisali");
			}
		}
		
	}
	

}
