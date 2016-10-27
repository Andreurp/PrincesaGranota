package net.andreu.PrincesaGranota;

import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public abstract class Personatge {

	protected GImage imatge;
	protected int posicioX;
	protected int posicioY;
	protected int midaFinestraX;
	protected int midaFinestraY;
	protected boolean horizontal;
	protected int direccio;
	protected int velocitat;

	protected Random rand = new Random();

	public Personatge(int midaFinestraX, int midaFinestraY) {
		this.midaFinestraX = midaFinestraX;
		this.midaFinestraY = midaFinestraY;
		posicioX = rand.nextInt(midaFinestraX - 100);
		posicioY = rand.nextInt(midaFinestraY - 100);
		horizontal=rand.nextBoolean();
		velocitat = rand.nextInt(11) + 5;

		if (rand.nextBoolean() == true) {
			direccio = 1;
		} else {
			direccio = -1;
		}
		generaImatge();
	}

	protected abstract void generaImatge();

	public abstract void mou(int codi);

	public GImage getImatge() {
		return imatge;
	}

	public GRectangle getPosicio() {
		return imatge.getBounds();
	}
}
