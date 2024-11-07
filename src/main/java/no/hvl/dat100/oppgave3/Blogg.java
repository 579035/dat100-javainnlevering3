package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private int nesteledig;
	private Innlegg[] innleggtabell;

	public Blogg() {
		innleggtabell = new Innlegg[20];

	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		int antall = 0;
		for (Innlegg innlegg : innleggtabell) {
			if (innlegg != null) {
				antall++;
			}
		}
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int index = -1;
		for (int i = 0; i<innleggtabell.length;i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				index = i;
			}
		}
		return index;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i<innleggtabell.length;i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				finnes = true;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledig = true;
		if (getAntall() == innleggtabell.length) {
			ledig = false;
		}
		return ledig;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean added = false;
		
		if (finnInnlegg(innlegg) == -1) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			added = true;
		}
		return added;
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}