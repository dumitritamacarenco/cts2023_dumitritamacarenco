package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import models.StubPerson;
import ro.ase.acs.observer.classes.Client;
import ro.ase.acs.persoana.model.IPersoana;
import ro.ase.acs.persoana.model.PachetTuristic;
import ro.ase.acs.persoana.model.Persoana;

class TestinPachetTuristic {

	@Test
	void testPoateRezerva() {
		IPersoana persoana = new StubPerson();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Maldavia", 20.25);
		assertTrue(pachetTuristic.poateRezerva());
	}
	
	@Test
	void testMinorNuPoateRezerva() {
		IPersoana persoana = new StubPerson();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Maldavia", 20.25);
		assertFalse(pachetTuristic.poateRezerva());
	}
	
//	private int getValoare() {
//		return 10;
//	}
//	
//	private boolean getBoolean() {
//		return true;
//	}
//	
//	private List<Object> getLista(){
//		List<Object> lista = new ArrayList<Object>();
//		lista.add(new Integer(6));
//		return lista;
//	}
//	
//	
//	private List<Object> getListaNull(){
//		return null;
//	}
//	
//	
//	@Test
//	public void testDemonstrativ() {
//		assertEquals(10, getValoare());
//		assertEquals(true, getBoolean());
//		assertTrue(getBoolean());
//		assertFalse(!getBoolean());
//		assertNotNull(getLista());
//		assertNull(getListaNull());
//	}

}
