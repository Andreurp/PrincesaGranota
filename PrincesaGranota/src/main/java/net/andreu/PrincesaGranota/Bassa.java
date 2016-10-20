package net.andreu.PrincesaGranota;

import java.util.ArrayList;
import java.util.List;

public class Bassa {

	private static final int AMPLADA_PANTALLA = 1024;
	private static final int ALTURA_PANTALLA = 768;
	private static final int N_Granotes = 5;

	List<Personatge> personatges = new ArrayList<Personatge>();
	
	public Bassa() {
		creaPersonatge();
	}

	private void creaPersonatge() {
		Personatge p = new Princep(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		personatges.add(p);
		
		Granota gp = new Granota(AMPLADA_PANTALLA, ALTURA_PANTALLA, true);
		personatges.add(gp);
		
		for(int i=0; i<N_Granotes; i++){
			Granota g = new Granota(AMPLADA_PANTALLA, ALTURA_PANTALLA, false);
			personatges.add(g);
		}
	}

	public List<Personatge> getPersonatges() {
		return personatges;
	}
}
