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
	public void mou() {
		// TODO Auto-generated method stub
		
	}

	public int xoca(Personatge p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
