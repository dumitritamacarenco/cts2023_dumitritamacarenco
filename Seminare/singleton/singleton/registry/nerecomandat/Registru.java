package singleton.registry.nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	//eager init pentru colectii
	private static Map<String, Firma> firme = new HashMap<>(); // static ca sa se
	
	public static Firma getFirma(String nume) {
		if(!firme.containsKey(nume)) {
			firme.put(nume, new Firma(nume, 0));
		}
		return firme.get(nume);
	}

}
