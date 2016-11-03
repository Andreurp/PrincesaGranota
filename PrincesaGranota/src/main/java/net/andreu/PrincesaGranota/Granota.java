package net.andreu.PrincesaGranota;

import acm.graphics.GImage;

public class Granota extends Personatge {

	private boolean esPrincesa = false;

	public Granota(int midaFinestraX, int midaFinestraY) {
		super(midaFinestraX, midaFinestraY);

		
	}
	
	public void setPrincesa(boolean esPrincesa){
		this.esPrincesa = esPrincesa;
		generaImatge();
	}
	
	public boolean getPrincesa(){
		return esPrincesa;
	}

	@Override
	protected void generaImatge() {
		String img = "";

		if (esPrincesa) {
			img = "princesa.png";
		} else {
			img = "granota.png";
		}
		imatge = new GImage(img, posicioX, posicioY);
	}

	@Override
	public void mou(int codi) {

		if (horizontal == true) {
			imatge.move(direccio * velocitat, 0);

		} else {
			imatge.move(0, direccio * velocitat);
		}

		// Quan desaparegi per un custat torna per l'oposat
		if (horizontal) {
			if (imatge.getLocation().getX() > midaFinestraX) {
				imatge.setLocation(0 - imatge.getBounds().getWidth(), posicioY);
			} else if (imatge.getLocation().getX() < 0 - imatge.getBounds()
					.getWidth()) {
				imatge.setLocation(midaFinestraX, posicioY);
			}
		} else {
			if (imatge.getLocation().getY() > midaFinestraY) {
				imatge.setLocation(posicioX, 0 - imatge.getBounds().getHeight());
			} else if (imatge.getLocation().getY() < 0 - imatge.getBounds().getHeight()) {
				imatge.setLocation(posicioX, midaFinestraY);
			}
		}
	}

	/**
	 * Retorna
	 * 0 - No hi ha xoc
	 */
	
	@Override
	public int xoca(Personatge p) {
		// TODO Auto-generated method stub
		return 0;
	}
}
