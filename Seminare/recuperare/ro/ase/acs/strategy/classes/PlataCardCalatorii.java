package ro.ase.acs.strategy.classes;

public class PlataCardCalatorii implements TipPlata {

	@Override
	public void plateste(double pretBilet) {
	System.out.println(String.format("Plata biletului in valoare de %f a fost efectuata cu card calatorii", pretBilet));
		
	}

}
