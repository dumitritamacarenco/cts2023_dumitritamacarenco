package ro.ase.acs.command.classes;

public class CommandPlecareInCursa implements ICommand{

	private int nrLinie;
	private IAutomobil automobil;
	
	
	@Override
	public void execute() {
		automobil.plecareInCursa(this.nrLinie);
		
	}
	public CommandPlecareInCursa(int nrLinie, IAutomobil automobil) {
		super();
		this.nrLinie = nrLinie;
		this.automobil = automobil;
	}
	
	
	
}
