package karan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transakcija extends Entitet {
	private Date datum;
	private String opis;
	private String napomena;
	private Osoba osoba;
	private VrstaTransakcije vrstaTransakcije;
	private List<Pas> psi;

	public Transakcija() {
		super();
		psi=new ArrayList<>();
	}

	public Transakcija(int sifra, Date datum, String opis, String napomena, Osoba osoba,
			VrstaTransakcije vrstaTransakcije,List<Pas>psi) {
		super(sifra);
		this.datum = datum;
		this.opis = opis;
		this.napomena = napomena;
		this.osoba = osoba;
		this.vrstaTransakcije = vrstaTransakcije;
		this.psi=psi;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Osoba getOsoba() {
		return osoba;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}

	public VrstaTransakcije getVrstaTransakcije() {
		return vrstaTransakcije;
	}

	public void setVrstaTransakcije(VrstaTransakcije vrstaTransakcije) {
		this.vrstaTransakcije = vrstaTransakcije;
	}
	

	public List<Pas> getPsi() {
		return psi;
	}

	public void setPsi(List<Pas> psi) {
		this.psi = psi;
	}

	@Override
	public String toString() {
		return "Datuma " + datum + " " + osoba.toString() + ": " + opis;
	}
	
	

}
