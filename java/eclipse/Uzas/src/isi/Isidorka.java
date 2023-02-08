package isi;

public class Isidorka {
	private boolean kuka=true;
	private String ime;
	private int godine;
	public Isidorka() {
		
		this(false,"Isi",25);
	}
	
	public Isidorka(boolean kuka, String ime, int godine) {
		super();
		this.kuka = kuka;
		this.ime = ime;
		this.godine = godine;
	}

	public boolean isKuka() {
		return kuka;
	}
	public void setKuka(boolean kuka) {
		this.kuka = kuka;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	@Override
	public String toString() {
		return kuka+" "+ime+godine;
	}
	
	

}
