package app;

public class Libro extends Elemento {
	private String autore;
	private String genere;

	public Libro(long isbn, String titolo, int anno, int pagine, String autore, String genere) {
		super(isbn, titolo, anno, pagine);
		// TODO Auto-generated constructor stub
		this.autore = autore;
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Nome libro:" + " " + titolo + "Autore: " + autore + " " + "pubblicazione:" + anno + " " + "Genere:"
				+ " " + genere;

	}

}
