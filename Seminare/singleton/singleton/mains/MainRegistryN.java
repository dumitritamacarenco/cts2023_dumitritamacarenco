package singleton.mains;

import singleton.registry.nerecomandat.Firma;
import singleton.registry.nerecomandat.Registru;

public class MainRegistryN {

	public static void main(String[] args) {
		Firma firma = Registru.getFirma("SC Ceva SRL");
		
	}
}
