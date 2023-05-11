package ro.ase.acs.command.main;

import ro.ase.acs.command.classes.Autobuz;
import ro.ase.acs.command.classes.CommandPlecareInCursa;
import ro.ase.acs.command.classes.IAutomobil;
import ro.ase.acs.command.classes.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		IAutomobil autobuz = new Autobuz(13);
		
		managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();


	}

}
