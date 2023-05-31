package models;

import ro.ase.acs.persoana.model.IPersoana;

public class FakePerson implements IPersoana {
	
	private String getSexValue;
	private int getVarstaValue;
	private boolean getCNPValue;
	
	

	public void setGetSexValue(String getSexValue) {
		this.getSexValue = getSexValue;
	}

	public void setGetVarstaValue(int getVarstaValue) {
		this.getVarstaValue = getVarstaValue;
	}

	public void setGetCNPValue(boolean getCNPValue) {
		this.getCNPValue = getCNPValue;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return getSexValue;
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}

}
