package models;

import ro.ase.acs.persoana.model.IPachet;

public class FakePachet implements IPachet {
	private double specialPrice;

	@Override
	public boolean poateRezerva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getPret() {
		// TODO Auto-generated method stub
		return specialPrice;
	}

	public void setSpecialPrice(double specialPrice) {
		this.specialPrice = specialPrice;
	}
	
	
	

}
