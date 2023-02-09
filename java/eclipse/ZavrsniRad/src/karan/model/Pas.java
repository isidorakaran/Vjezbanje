package karan.model;

public class Pas extends Entitet{
	private boolean mjesavina;
	private String ime;
	private String pol;
	private int dob;
	private float kilaza;
	
	public Pas() {
		super();
	}
	public Pas(int sifra, boolean mjesavina, String ime, String pol, int dob, float kilaza) {
		super(sifra);
		this.mjesavina = mjesavina;
		this.ime = ime;
		this.pol = pol;
		this.dob = dob;
		this.kilaza = kilaza;
	}
	public boolean getMjesavina() {
		return mjesavina;
	}
	public void setMjesavina(boolean mjesavina) {
		this.mjesavina = mjesavina;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public float getKilaza() {
		return kilaza;
	}
	public void setKilaza(float kilaza) {
		this.kilaza = kilaza;
	}
	
	@Override
	public String toString() {
		return ime + " ima " + dob  + " godina.";
	}
	
	public static String lajanje() {
		return "av av";
	}

}
