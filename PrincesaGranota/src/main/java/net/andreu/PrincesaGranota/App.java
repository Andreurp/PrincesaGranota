package net.andreu.PrincesaGranota;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class App extends GraphicsProgram implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int AMPLADA_PANTALLA = 1024;
	private static final int ALTURA_PANTALLA = 600;
	
	private Bassa baseta;

	public void init() {
		baseta = new Bassa(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		setSize(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		GImage fons = new GImage("fons.jpg");
		fons.setSize(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		add(fons);
	    addKeyListeners();
	}
	/**
	 * Programa principal...
	 */
	@Override
	public final void run() {
		
		clicaPerComencar();
		
		List<Personatge> personatges = baseta.getPersonatges();
		for(Personatge p: personatges){
			add(p.getImatge());
		}
		
		while(true){
			baseta.mou();
			
			pause(100);
		}
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
	
	//Event
	public void keyPressed(KeyEvent e) {
		
        baseta.setMouPrince(e.getKeyCode());
        
    }

}
