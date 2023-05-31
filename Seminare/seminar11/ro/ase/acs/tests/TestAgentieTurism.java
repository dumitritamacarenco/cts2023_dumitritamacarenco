package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.FakePachet;
import ro.ase.acs.persoana.model.AgentieTurism;

class TestAgentieTurism {
	

	@Test
	void expectedPriceHappyScenario() {
		
		
		AgentieTurism agentie=new AgentieTurism();
		FakePachet pachet=new FakePachet();
		pachet.setSpecialPrice(100.0);;
		
		FakePachet pachet2=new FakePachet();
		pachet2.setSpecialPrice(200.0);
		
		FakePachet pachet3=new FakePachet();
		pachet3.setSpecialPrice(60.0);
		
		agentie.adaugaPachet(pachet);
		agentie.adaugaPachet(pachet2);
		agentie.adaugaPachet(pachet3);
		
		assertEquals(360.00, agentie.calculareSumaTotalaPachete());
		
		
	}

}
