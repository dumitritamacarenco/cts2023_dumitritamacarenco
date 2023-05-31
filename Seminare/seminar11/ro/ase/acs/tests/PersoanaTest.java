package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.acs.persoana.model.NotBornYetException;
import ro.ase.acs.persoana.model.Persoana;

class PersoanaTest {

	@Test
	void testGetVarsta() {
		Persoana persoana = new Persoana("Maria", "6010911430027" );
		assertEquals(21, persoana.getVarsta());
	}
	
	@Test
	void testGetVarstaError() {
		Persoana persoana = new Persoana("Ioana", "6220524430022");
		assertThrows(NotBornYetException.class, new Executable(){

			@Override
			public void execute() throws Throwable {
				persoana.getVarsta();
				
			}
			
		});
	}
	

}
