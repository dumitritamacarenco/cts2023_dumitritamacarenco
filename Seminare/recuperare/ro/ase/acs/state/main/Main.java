package ro.ase.acs.state.main;

import ro.ase.acs.state.classes.Bus;
import ro.ase.acs.state.classes.IBusState;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus("B102");
		bus.goInService();
		bus.arriveAtTheEndOfTheRoute();
		bus.leaveForRoute();
		bus.goInService();
		bus.arriveAtTheEndOfTheRoute();

	}

}
