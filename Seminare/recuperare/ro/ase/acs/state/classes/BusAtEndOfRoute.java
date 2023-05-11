package ro.ase.acs.state.classes;

public class BusAtEndOfRoute implements IBusState {

	@Override
	public void changeState(Bus bus) {
		if(bus.getState() instanceof BusInRoute ||  bus.getState() instanceof BusInService) {
			System.out.println("The bus " + bus.getLicensePlate() +" has reached end of line");
			bus.setState(this);
		}
		else {
			System.out.println("The bus " + bus.getLicensePlate() +" cannot reach the end of the line");
		}
		
	}

}
