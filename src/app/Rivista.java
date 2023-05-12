package app;

import java.time.LocalDate;

public class Rivista extends Elemento {
	private String periodicità;

	public Rivista(long isbn, String titolo, LocalDate anno, int pagine, String periodicità) {
		super(isbn, titolo, anno, pagine);
		// TODO Auto-generated constructor stub
		this.periodicità = periodicità;
	}

	public String getPeriodicità() {
		return periodicità;
	}

	public void setPeriodicità(String periodicità) {
		this.periodicità = periodicità;
	}

}
