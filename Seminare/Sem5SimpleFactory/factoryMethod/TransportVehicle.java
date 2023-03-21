package factoryMethod;

public abstract class TransportVehicle {
	
	public int noSeats;

	public TransportVehicle(int noSeats) {
		this.noSeats = noSeats;
	}
	
	public abstract void showInfo();
	
	public abstract void moveType();

	@Override
	public String toString() {
		return "has" + this.noSeats + " seats";
	}
	
	

}
