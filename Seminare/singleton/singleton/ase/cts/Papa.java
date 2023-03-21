package singleton.ase.cts;

public class Papa {
	private String nume;
	private int nrAniFunctie;
	private int alCatalea;
	private static Papa papa = new Papa("Benedict" , 2, 276);
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrAniFunctie() {
		return nrAniFunctie;
	}
	public void setNrAniFunctie(int nrAniFunctie) {
		this.nrAniFunctie = nrAniFunctie;
	}
	public int getAlCatalea() {
		return alCatalea;
	}
	public void setAlCatalea(int alCatalea) {
		this.alCatalea = alCatalea;
	}
	private Papa(String nume, int nrAniFunctie, int alCatalea) { // trb sa fie private ca sa l facem singleton
		super();
		this.nume = nume;
		this.nrAniFunctie = nrAniFunctie;
		this.alCatalea = alCatalea;
	}
	
	//static - apartine clasei nu obj
	//
	public static Papa getInstance() { 
		return papa; // eager initialization
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Papa [nume=");
		builder.append(nume);
		builder.append(", nrAniFunctie=");
		builder.append(nrAniFunctie);
		builder.append(", alCatalea=");
		builder.append(alCatalea);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
