package ro.ase.acs.ChainOfResponsability.classes;

public abstract class INotificare {
	private INotificare nextNotificare;
	
	public abstract void trimiteNotificare(Client client, String mesaj);

	public INotificare(INotificare nextNotificare) {
		super();
		this.nextNotificare = nextNotificare;
	}

	public INotificare getNextNotificare() {
		return nextNotificare;
	}

	public void setNextNotificare(INotificare nextNotificare) {
		this.nextNotificare = nextNotificare;
	}
	
	

}
