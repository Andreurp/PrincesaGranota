package net.andreu.PrincesaGranota;

import acm.graphics.GImage;

public class Princep extends Personatge{

	public Princep(int midaFinestraX, int midaFinestraY) {
		super(midaFinestraX, midaFinestraY);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void generaImatge() {
		
		imatge = new GImage("cavaller.png");
		
	}

	@Override
	public void mou(int codi) {
		switch (codi) {
		//Esquerra
		case 37:
			imatge.move(-velocitat, 0);
			break;
		//Dalt
		case 38:
			imatge.move(0, -velocitat);
			break;
		//Dreta
		case 39:
			imatge.move(velocitat, 0);
			break;
		//Baix
		case 40:
			imatge.move(0, velocitat);
		}
		if (imatge.getLocation().getX() <0) {
			imatge.setLocation(0 , imatge.getLocation().getY());
		} else if (imatge.getLocation().getX()+imatge.getWidth() > midaFinestraX) {
			imatge.setLocation(midaFinestraX-imatge.getWidth() , imatge.getLocation().getY());
		}
		if (imatge.getLocation().getY() <0) {
			imatge.setLocation(imatge.getLocation().getX(),0);
		} else if (imatge.getLocation().getY()+imatge.getHeight() > midaFinestraY) {
			imatge.setLocation(imatge.getLocation().getX(),midaFinestraY-imatge.getHeight() );
		}
	}
	/**
	 * Retorna
	 * 0 - No hi ha xoc
	 * 1- Xoca amb la princesa
	 * 2- Xoca amb una granota
	 */
	public int xoca(Personatge p) {
		if(p.getClass().equals(Granota.class)){
			if (this.getPosicio().intersects(p.getPosicio())) {
				if(((Granota)p).getPrincesa()==true){
					return 1;
				}
				return 2;
			}
		}
		return 0;
	}
}