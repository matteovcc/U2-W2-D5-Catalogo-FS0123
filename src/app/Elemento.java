package app;

import java.time.LocalDate;

public class Elemento {
	private long isbn;
	private String titolo;
	private LocalDate anno;
	private int pagine;

	public Elemento(long isbn, String titolo, LocalDate anno, int pagine) {
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

	public LocalDate anno() {
		return anno;
	}

	public void setAnno(LocalDate anno) {
		this.anno = anno;
	}

	public int getPagine() {
		return pagine;
	}

	public void setNumeroPagine(int pagine) {
		this.pagine = pagine;
	}

}
