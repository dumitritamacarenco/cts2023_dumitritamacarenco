package singleton.ase.cts;

public class Director {
	private String nume;
	
	private int varsta;
	
	private static Director instanta = null;
	
	public Director(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
	// only one thread can execute this at a time
	//synchronized method to control simultaneous access
	public synchronized static Director getInstance(String nume) {
		if(instanta == null) {
			
			instanta = new Director(nume, 30);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Director [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	

}
