package net.andreu.PrincesaGranota;

import java.util.ArrayList;
import java.util.List;

public class Bassa {

	private static final int N_Granotes = 1;

	private int AMPLADA_PANTALLA;
	private int ALTURA_PANTALLA;
	
	List<Personatge> personatges = new ArrayList<Personatge>();
	List<Personatge> granotesNoves = new ArrayList<Personatge>();
	
	private int codiMoviment = -1;
	private boolean pincesaTrobada = false;

	public Bassa(int AMPLADA_PANTALLA, int ALTURA_PANTALLA) {
		this.AMPLADA_PANTALLA = AMPLADA_PANTALLA;
		this.ALTURA_PANTALLA = ALTURA_PANTALLA;

		creaPersonatge();
	}

	private void creaPersonatge() {
		Personatge p = new Princep(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		personatges.add(p);

		/*Granota gp = new Granota(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		gp.setPrincesa(true);
		personatges.add(gp);*/

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
		codiMoviment = -1;
		for (Personatge p : personatges) {
			for (Personatge q : personatges) {
				if (!p.equals(q)) {
					switch (p.xoca(q)) {
					case 0:
						// no cal fer res
						break;
					case 1:
						pincesaTrobada = true;
						gameOver();
						break;
					case 2:
						Granota g = new Granota(AMPLADA_PANTALLA, ALTURA_PANTALLA);
						granotesNoves.add(g);
						p.setEsteril(true);
						q.setEsteril(true);
						break;
					}
				}
			}
		}
		for (Personatge gn : granotesNoves) {
			personatges.add(gn);
		}
	}

	public void setMouPrince(int codi) {
		codiMoviment = codi;
	}
	
	public List<Personatge> getBebes() {
		return granotesNoves;
	}

	// para el joc
	public boolean gameOver() {
		return (personatges.size() >= 20 || pincesaTrobada == true);
	}
}
