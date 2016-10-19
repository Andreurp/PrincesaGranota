package net.andreu.PrincesaGranota;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {

	private static final int AMPLADA_PANTALLA = 1024;
	private static final int ALTURA_PANTALLA = 768;

	/**
	 * Programa principal...
	 */
	@Override
	public final void run() {
		setSize(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		GImage fons = new GImage("fons.jpg");
		fons.setSize(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		add(fons);

		clicaPerComencar();
	}

	/**
	 * Clica per comenÃ§ar.
	 */
	private void clicaPerComencar() {
		GLabel label = new GLabel("Clica per comenÃ§ar");
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() + label.getAscent()) / 2;
		add(label, x, y);
		waitForClick();
		remove(label);
	}

}
