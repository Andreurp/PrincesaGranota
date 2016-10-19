package net.andreu.PrincesaGranota;

import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public abstract class Bassa {

	protected boolean horizontal;
	protected GImage imatge;
	protected int posicioX;
	protected int posicioY;
	protected int midaFinestraX;
	protected int midaFinestraY;
	protected int velocitat;

	protected Random rand = new Random();

	public Bassa(int midaFinestraX, int midaFinestraY) {
		this.midaFinestraX = midaFinestraX;
		this.midaFinestraY = midaFinestraY;
		horizontal = rand.nextBoolean();
		posicioX = rand.nextInt(midaFinestraX - 100);
		posicioY = rand.nextInt(midaFinestraY - 100);
		velocitat = rand.nextInt(11) + 5;
	}

	protected abstract void generaImatge();

	// Mou peix
	public abstract void mou();

	public GImage getImatge() {
		return imatge;
	}

	public GRectangle getPosicio() {
		return imatge.getBounds();
	}
	
	public abstract int xoca(Bassa p);

}
