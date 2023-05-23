package ro.ase.acs.ChainOfResponsability.classes;

public class eMailNotificare extends INotificare {

	public eMailNotificare(INotificare nextNotificare) {
		super(nextNotificare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		if(client.getEmail() != null) {
			System.out.println("Clientul "+client.getNume()+ " ai primit email ul "+ mesaj);
		}
		else if(super.getNextNotificare() != null) {
			super.getNextNotificare().trimiteNotificare(client, mesaj);
		}
		
	}

}
