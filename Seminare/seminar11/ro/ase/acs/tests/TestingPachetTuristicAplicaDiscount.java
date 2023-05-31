package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.FakePerson;
import ro.ase.acs.persoana.model.PachetTuristic;
import ro.ase.acs.persoana.model.Persoana;

class TestingPachetTuristicAplicaDiscount {

	@Test
	void shouldApplyDiscountforSeniorCitizen() {
		FakePerson fakePerson = new FakePerson();
		fakePerson.setGetVarstaValue(66);
		fakePerson.setGetSexValue("M");
		PachetTuristic pachetTuristic = new PachetTuristic(fakePerson, "Miami", 1000.0);
		pachetTuristic.aplicaDiscountVarstnici(15);
		assertEquals(850, pachetTuristic.getPret());
	}
	
	@Test
	void shouldNotApplyDiscount() {
		FakePerson fakePerson = new FakePerson();
		fakePerson.setGetVarstaValue(50);
		fakePerson.setGetSexValue("M");
		PachetTuristic pachetTuristic = new PachetTuristic(fakePerson, "Bali", 1000.0);
		pachetTuristic.aplicaDiscountVarstnici(25);
		assertEquals(1000, pachetTuristic.getPret());
	}

}
