package ro.ase.simpleFactory.main;

import ro.ase.simpleFactory.ITransportVehicle;

public class Subway implements ITransportVehicle{
	
	private int noSeats;
	
	

	public Subway(int noSeats) {
		this.noSeats = noSeats;
	}

	@Override
	public void showInfo() {
System.out.println("Subway has "+this.noSeats+ " seats" );		
	}

	@Override
	public void movingType() {
		System.out.println("The subway goes underground");
		
	}

}
