package singleton.ase.cts;

public class Main {
	public static void main(String[] args) {
	Papa papa1 = Papa.getInstance();
	Papa papa2 = Papa.getInstance();
	
	System.out.println(papa1);
	System.out.println(papa2);
	
	Director director1 = Director.getInstance("Victor");
	Director director2 = Director.getInstance("Stefan");
	
	System.out.println(director1.toString());
	System.out.println(director2.toString());
	
	System.out.println(papa1.toString());
	System.out.println(papa2.toString());
	
	
	}

}
