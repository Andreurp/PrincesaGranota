package net.andreu.PrincesaGranota;

import acm.program.GraphicsProgram;

public class App extends GraphicsProgram {
	
	private static final int MIDA_Altura_Finestre = 650;
	private static final int MIDA_Amplada_Finestre = 1350;
	
	public void init() {
		// mida de la pantalla i color fons
		setSize(MIDA_Amplada_Finestre, MIDA_Altura_Finestre);
		GImage fons = new GImage("fons.jpg");
		fons.setSize(MIDA_Amplada_Finestre, MIDA_Altura_Finestre);
		add(fons);
	}
	
}
