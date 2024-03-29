package edunova;

import java.util.Scanner;

import edunova.obrada.Grupe;
import edunova.obrada.Polaznici;
import edunova.obrada.Predavaci;
import edunova.obrada.Smjerovi;

public class Start {

	private Smjerovi smjerovi;
	private Polaznici polaznici;
	private Predavaci predavaci;
	private Grupe grupe;

	public Start() {

		Pomocno.ulaz = new Scanner(System.in);
		smjerovi = new Smjerovi(this);
		polaznici = new Polaznici(this);
		predavaci = new Predavaci(this);
		grupe = new Grupe(this);
		pozdravnaPoruka();
		glavniIzbornik();
	}

	public void glavniIzbornik() {
		System.out.println("");
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("Dostupne opcije");
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predavači");
		System.out.println("5. Izlaz iz programa");

		odabirGlavnogIzbornika();
	}

	private void odabirGlavnogIzbornika() {
		switch (Pomocno.unosBrojRaspon("Odabrana opcija: ", 1, 5)) {
		case 1:
			smjerovi.izbornik();
			break;
		case 2:
			grupe.izbornik();
			break;
		case 3:
			polaznici.izbornik();
			break;
		case 5:
			System.out.println("Doviđenja!");
		}

	}

	private void pozdravnaPoruka() {
		System.out.println("Dobrodošli u Edunova terminal aplikaciju");

	}

	public Polaznici getPolaznici() {
		return polaznici;
	}

	public Smjerovi getSmjerovi() {
		return smjerovi;
	}

	public static void main(String[] args) {
		if (args.length == 1) {
			Pomocno.DEV = true;
		} else {
			Pomocno.DEV = false;
		}
		new Start();
	}
}