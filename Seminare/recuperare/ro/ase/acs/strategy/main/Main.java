package ro.ase.acs.strategy.main;

import ro.ase.acs.strategy.classes.Calator;
import ro.ase.acs.strategy.classes.PlataCardBancar;
import ro.ase.acs.strategy.classes.PlataPrinSMS;

public class Main {
 private void args() {
	 Calator calator = new Calator("Gixi");
     calator.platesteBilet(30);
 calator.setMetodaPlata(new PlataCardBancar());
 calator.platesteBilet(45);
 calator.setMetodaPlata(new PlataPrinSMS());
 calator.platesteBilet(40);

}
}
