package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		super.tekst = tekst;
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super.id = id;
		super.bruker = bruker;
		super.dato = dato;
		super.likes = likes;
		super.tekst = tekst;
		this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		//BILDE\n1\nOle Olsen\n23-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
		String string = "BILDE\n"+String.valueOf(id)+"\n"+bruker+"\n"+dato+"\n"+String.valueOf(likes)+"\n"+tekst+"\n"+url+"\n";
		return string;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
