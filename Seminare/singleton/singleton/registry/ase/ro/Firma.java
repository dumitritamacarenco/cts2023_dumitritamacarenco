package singleton.registry.ase.ro;

import java.util.HashMap;
import java.util.Map;

public class Firma {
	
	private String nume;
	
	private int cifraAfaceri;
	
	private int numarAngajati;
	
	//private static  Map<String, Firma> firme= null; // lazy initialization
	private static  Map<String, Firma> firme= new HashMap<>();

	private Firma(String nume, int cifraAfaceri, int numarAngajati) {
		super();
		this.nume = nume;
		this.cifraAfaceri = cifraAfaceri;
		this.numarAngajati = numarAngajati;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Firma [nume=");
		builder.append(nume);
		builder.append(", cifraAfaceri=");
		builder.append(cifraAfaceri);
		builder.append(", numarAngajati=");
		builder.append(numarAngajati);
		builder.append("]");
		return builder.toString();
	}



	public void angajare() {
		this.numarAngajati++;
	}
	
	
	
	public synchronized static Firma getFirma(String numeFirma) {
		if(!firme.containsKey(numeFirma)) {
			Firma firma = new Firma(numeFirma, 0, 0);
			firme.put(numeFirma, firma);
		}
		return firme.get(numeFirma);
	}

}
