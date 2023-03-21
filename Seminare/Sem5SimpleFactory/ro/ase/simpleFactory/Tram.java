package ro.ase.simpleFactory;

public class Tram implements ITransportVehicle{

	private int noSeats;
	
	protected Tram(int noSeats)
	{
		this.noSeats = noSeats;
	}
	
	public void showInfo() {
		System.out.println("The tram has: "+ this.noSeats+"seats");
		
	}

	@Override
	public void movingType() {
		System.out.println("The tram is moving electrically");
		
	}

	

}
