package edunova;

public class Polaznik extends Osoba {
	private String brojUgovora;

	public Polaznik() {
		System.out.println("Konstruktor Polaznik");
	}

	public Polaznik(String ime, String prezime, String brojUgovora) {
		super(ime, prezime);
		this.brojUgovora = brojUgovora;
	}

	public String getBrojUgovora() {
		status=1;
		broj=2;
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
		// pristup javnim i zaštićenim varijablama i metodama u svim nadklasama
				super.brojUgovora="fiksno";
				// broj je varijabla u nad klasi
				broj=3;
	}
	@Override
public String pozdravi() {
		
		return "Polazniče "+super.pozdravi();
	}

}
