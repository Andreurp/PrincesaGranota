package net.andreu.PrincesaGranota;

import java.util.ArrayList;
import java.util.List;

public class Bassa {

	private static final int N_Granotes = 5;

	private int AMPLADA_PANTALLA;
	private int ALTURA_PANTALLA;
	List<Personatge> personatges = new ArrayList<Personatge>();
	private int codiMoviment = -1;
	
	public Bassa(int AMPLADA_PANTALLA, int ALTURA_PANTALLA) {
		creaPersonatge();
		this.AMPLADA_PANTALLA = AMPLADA_PANTALLA;
		this.ALTURA_PANTALLA =ALTURA_PANTALLA;
	}

	private void creaPersonatge() {
		Personatge p = new Princep(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		personatges.add(p);

		Granota gp = new Granota(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		gp.setPrincesa(true);
		personatges.add(gp);

		for (int i = 0; i < N_Granotes; i++) {
			Granota g = new Granota(AMPLADA_PANTALLA, ALTURA_PANTALLA);
			personatges.add(g);
		}
	}

	public List<Personatge> getPersonatges() {
		return personatges;
	}

	public void mou() {
		for (Personatge p : personatges) {
			p.mou(codiMoviment);
		}
		codiMoviment=-1;
	}

	public void setMouPrince(int codi) {
		codiMoviment=codi;
	}
	
	
}
