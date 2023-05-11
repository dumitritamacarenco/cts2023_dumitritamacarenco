package ro.ase.acs.state.classes;

public class Bus  {
	private IBusState state;
	private String licensePlate;
	
	public IBusState getState() {
		return state;
	}
	
	protected void setState(IBusState state) {
		this.state = state;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public Bus(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
		this.state = new BusAtEndOfRoute();
	}
	
	public void leaveForRoute() {
		IBusState route = new BusInRoute();
		route.changeState(this);
	}
	
	public void goInService() {
		IBusState service =  new BusInService();
		service.changeState(this);
	}
	
	public void arriveAtTheEndOfTheRoute() {
		IBusState end = new BusAtEndOfRoute();
		end.changeState(this);
	}

}
