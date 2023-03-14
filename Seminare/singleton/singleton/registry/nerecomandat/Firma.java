package singleton.registry.nerecomandat;

public class Firma {
	private String numeString;
	
	private int nrAngajati;

	protected Firma(String numeString, int nrAngajati) {
		super();
		this.numeString = numeString;
		this.nrAngajati = nrAngajati;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Firma [numeString=");
		builder.append(numeString);
		builder.append(", nrAngajati=");
		builder.append(nrAngajati);
		builder.append("]");
		return builder.toString();
	}
	
	

}
