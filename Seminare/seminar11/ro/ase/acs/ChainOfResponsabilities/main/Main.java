package ro.ase.acs.ChainOfResponsabilities.main;

import ro.ase.acs.ChainOfResponsability.classes.Client;
import ro.ase.acs.ChainOfResponsability.classes.INotificare;
import ro.ase.acs.ChainOfResponsability.classes.ManagerNotificare;
import ro.ase.acs.ChainOfResponsability.classes.SMSNotificare;
import ro.ase.acs.ChainOfResponsability.classes.eMailNotificare;

public class Main {

	public static void main(String[] args) {
		INotificare sms = new SMSNotificare(null);
		INotificare email = new eMailNotificare(null);
		INotificare manager = new ManagerNotificare(null);
		
		sms.setNextNotificare(email);
		email.setNextNotificare(manager);
		
		Client client1 = new Client("Gixi", null, "gixi@gmail,com");
		Client client2 = new Client("Jimmy", "0724842364", "jimmy@com");
		Client client3 = new Client("Palarie", "0752836254", null);
		Client client4 = new Client("Vasile", null, null);
		
		sms.trimiteNotificare(client1, "ciao");
		sms.trimiteNotificare(client2, "salut");
		sms.trimiteNotificare(client3, "buna dziua");
		email.trimiteNotificare(client4, "new email");
		manager.trimiteNotificare(client4, "cf");
		email.trimiteNotificare(client3, "cmf");
				
				

	}

}
