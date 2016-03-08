package Biblioteka.interfejs;

import java.util.LinkedList;

import Biblioteka.Autor;
import Biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga knjiga);
	public void obrisi(Knjiga knjiga);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(
			Autor autor, long ISBN, String naslov, String izdavac);
	
}
