package factoryMethod;

public class Tramvai  extends TransportVehicle{

	public Tramvai(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		System.out.println("The tram "+ super.toString());		
		
	}

	@Override
	public void moveType() {
System.out.println("se deplaseaza pe sine");	
	}
	

}
