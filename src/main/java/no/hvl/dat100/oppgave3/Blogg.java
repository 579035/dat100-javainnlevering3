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
			if(innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
				index = i;
			}
		}
		return index;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i<innleggtabell.length;i++) {
			if(innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
				finnes = true;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledig = true;
		if (nesteledig == innleggtabell.length) {
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
		String string = "\n";
		for(int i = 0; i<innleggtabell.length; i++) {
			if(innleggtabell[i] != null) {
				string += innleggtabell[i].toString();
			}
		}
		return nesteledig + string;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] utvidet = new Innlegg[innleggtabell.length*2];
		System.arraycopy(innleggtabell, 0, utvidet, 0, innleggtabell.length);
		innleggtabell = utvidet;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		boolean added = false;
		if (ledigPlass() == true) {
			leggTil(innlegg);
			added = true;
		} else {
			utvid();
			leggTil(innlegg);
			added = true;
		}
		return added;
	}
	
	public boolean slett(Innlegg innlegg) {
		
		boolean slettet = false;
		for (int i = 0; i<innleggtabell.length;i++) {
			if (innleggtabell[i].erLik(innlegg) && innleggtabell[i] != null) {
				innleggtabell[i] = null;
				slettet = true;
			}
		}
		return slettet;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}