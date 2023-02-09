package karan.model;

public class Osoba extends Entitet{
	private String ime;
	private String prezime;
	private String email;
	private String broj_telefona;
	
	public Osoba() {
		super();
	}
	public Osoba(int sifra, String ime, String prezime, String email, String broj_telefona) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.broj_telefona = broj_telefona;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBroj_telefona() {
		return broj_telefona;
	}
	public void setBroj_telefona(String broj_telefona) {
		this.broj_telefona = broj_telefona;
	}
	@Override
	public String toString() {
		return ime + " " + prezime;
	}
	

}
