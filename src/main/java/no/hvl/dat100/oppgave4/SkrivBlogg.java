package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		File directory = new File(mappe);
		if(!directory.exists()) {
			boolean dirlaget = directory.mkdirs();
			if(!dirlaget) {
				System.err.println("Mappen kunne ikke lages: " + mappe);
				return false;
			}
		}
		
		File fil = new File(directory, filnavn);
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fil))){
			String innhold = samling.toString();
			writer.write(innhold);
			return true;
			}
		catch(IOException error) {
			System.err.println("Det skjedde en feil ved skriving til fil: " + fil.getAbsolutePath());
			return false;
		}
	}
}
