package net.andreu.PrincesaGranota;

import acm.graphics.GImage;

public class Granota extends Personatge{
	
	private boolean esPrincesa;

	public Granota(int midaFinestraX, int midaFinestraY, boolean esPrincesa) {
		super(midaFinestraX, midaFinestraY);
		
		this.esPrincesa = esPrincesa;
		
	}

	@Override
	protected void generaImatge() {
		String img = "";
		
		if(esPrincesa){
			img = "princesa.png";
		}else{
			img = "granota.png";
		}
		imatge = new GImage(img, posicioX, posicioY);
	}

	@Override
	public void mou() {
		// TODO Auto-generated method stub
		
	}
}
