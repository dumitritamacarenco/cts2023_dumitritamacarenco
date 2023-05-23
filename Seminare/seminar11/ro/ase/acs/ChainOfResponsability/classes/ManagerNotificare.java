package ro.ase.acs.ChainOfResponsability.classes;

public class ManagerNotificare extends INotificare {

	public ManagerNotificare(INotificare nextNotificare) {
		super(nextNotificare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		System.out.println("Nu avem date");
		
	}

}
