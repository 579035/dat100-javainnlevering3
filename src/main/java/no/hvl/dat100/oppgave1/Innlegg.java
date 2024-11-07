package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
 
 	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato= dato;
		likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
	}
	
	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		//Implementer metoden public boolean erLik(Innlegg innlegg) som returnerer true 
		//hvis og kun hvis innlegget har samme id som innlegget innlegg git med som parameter.
		Boolean verdi = false;
		Integer innleggid = Integer.valueOf(innlegg.id);
		Integer thisid = Integer.valueOf(this.id);
		if(innleggid.equals(thisid)) {
			verdi = true;
		}
		return verdi;

	}
	
	@Override
	public String toString() {
		String id_string = Integer.toString(this.id);
		String likes_string = Integer.toString(likes);
		
		return id_string + "\n" + bruker + "\n" + dato + "\n" + likes_string + "\n" ;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
