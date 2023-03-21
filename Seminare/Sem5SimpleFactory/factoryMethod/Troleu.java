package factoryMethod;

public class Troleu extends TransportVehicle {

	public Troleu(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
System.out.println("The trolley "+ super.toString());		
	}

	@Override
	public void moveType() {
System.out.println("The trolley is elecgric");		
	}

}
