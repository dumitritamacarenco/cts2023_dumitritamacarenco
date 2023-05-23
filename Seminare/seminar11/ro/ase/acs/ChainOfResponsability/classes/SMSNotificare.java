package ro.ase.acs.ChainOfResponsability.classes;

public class SMSNotificare extends INotificare{

	public SMSNotificare(INotificare nextNotificare) {
		super(nextNotificare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		if(client.getNume() != null) {
			System.out.println("Clientul "+client.getNume()+ " ai primit sms ul "+ mesaj);
		}
		else if(super.getNextNotificare() != null) {
			super.getNextNotificare().trimiteNotificare(client, mesaj);
		}
		
	}

}
