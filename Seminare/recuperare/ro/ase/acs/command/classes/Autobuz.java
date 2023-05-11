package ro.ase.acs.command.classes;

public class Autobuz  implements IAutomobil{
	private int numar;

	
	
	public Autobuz(int numar) {
		super();
		this.numar = numar;
	}



	@Override
	public void plecareInCursa(int nrLinie) {
		System.out.println("Autobuzul cu nr "+  this.numar + " a plecat in cursa pe linia " +nrLinie);
		
	}

}
