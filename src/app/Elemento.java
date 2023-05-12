package app;

public class Elemento {
	private long isbn;
	protected String titolo;
	protected int anno;
	private int pagine;

	public Elemento(long isbn, String titolo, int anno, int pagine) {
		this.isbn = isbn;
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getPagine() {
		return pagine;
	}

	public void setNumeroPagine(int pagine) {
		this.pagine = pagine;
	}

}
