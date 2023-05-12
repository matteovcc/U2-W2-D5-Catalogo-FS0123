package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LIBRI");
		List<Libro> libri = new ArrayList<>();
		Libro l1 = new Libro(978888L, "Harry Potter I", 2002, 187, "J.K.Rowling", "Fantasy");
		Libro l2 = new Libro(123332L, "Game Of Thrones", 2005, 345, "George Martin", "Fantasy");
		Libro l3 = new Libro(34344309L, "Una fortuna pericolosa", 2010, 456, "Ken Follet", "Thriller");
		Libro l4 = new Libro(9896627461823L, "Death Note", 2002, 689, "Takeshi Obata", "Mystery");

		libri.add(l1);
		libri.add(l2);
		libri.add(l3);
		libri.add(l4);

		for (Libro libro : libri) {
			System.out.println("Titolo:" + " " + libro.getTitolo() + "||" + "Autore:" + " " + libro.getAutore());
		}

		System.out.println("RIVISTE");

		List<Rivista> riviste = new ArrayList<>();
		Rivista r1 = new Rivista(234553434656L, "Giallo Zafferano", 2017, 50, "Mensile");
		Rivista r2 = new Rivista(123445555666L, "La settimana enigmistica", 2000, 30, "Settimanale");
		Rivista r3 = new Rivista(428772304248L, "Ciak Magazine", 2010, 50, "Semestrale");
		riviste.add(r3);
		riviste.add(r2);
		riviste.add(r1);

		for (Rivista rivista : riviste) {
			System.out.println(
					"Titolo:" + " " + rivista.getTitolo() + "||" + "Periodicità:" + " " + rivista.getPeriodicità());
		}

		// Exercise 1
		List<Libro> nuoviLibri = libri.stream().filter(libro -> !String.valueOf(libro.getIsbn()).equals("978888")) // <----HarryPotter

				.toList();
		System.out.println("LIBRI SENZA CODICE 978888 (HARRY POTTER)");
		for (Libro libro : nuoviLibri) {
			System.out.println("Titolo:" + " " + libro.getTitolo() + "||" + "Autore" + " " + libro.getAutore() + " "
					+ "ISBN:" + " " + libro.getIsbn());
		}

		System.out.println("RIVISTE SENZA CODICE 234553434656L (GIALLO ZAFFERANO)");

		List<Rivista> nuoveRiviste = riviste.stream()
				.filter(rivista -> !String.valueOf(rivista.getIsbn()).equals("234553434656")).toList();
		for (Rivista rivista : nuoveRiviste) {
			System.out.println("Titolo:" + " " + rivista.getTitolo() + "||" + "Periodicità" + " "
					+ rivista.getPeriodicità() + " " + "ISBN:" + rivista.getIsbn());
		}
		// Exercise 2
		System.out.println("RICERCA PER ESBN");
		List<Libro> ricercaPerIsbn = libri.stream().filter(libro -> libro.getIsbn() == 123332L).toList();
		for (Libro libro : ricercaPerIsbn) {
			System.out.println("Il libro che cercavi è:" + " " + libro.getTitolo() + " " + "Codice:" + libro.getIsbn());
		}

		// Exercise 3
		System.out.println("RICERCA PER ANNO");
		List<Libro> ricercaPerAnno = libri.stream().filter(libro -> libro.getAnno() == 2002).toList();

		if (!ricercaPerAnno.isEmpty()) {

			for (Libro libro : ricercaPerAnno) {
				System.out.println("I libri che cercavi sono:" + " " + libro.getTitolo() + "||"
						+ "Anno di pubblicazione :" + " " + libro.getAnno());
			}
		} else {
			System.out.println("Nessun libro trovato nell'anno che stai cercando");
		}
		// Exercise 4
		System.out.println("RICERCA PER AUTORE");
		List<Libro> ricercaPerAutore = libri.stream().map(libro -> (Libro) libro)
				.filter(libro -> libro.getAutore().equals("J.K.Rowling")).toList();
		for (Libro libro : ricercaPerAutore) {
			System.out.println("L'autore che cercavi è: " + " " + libro.getAutore());
		}

	}

}
