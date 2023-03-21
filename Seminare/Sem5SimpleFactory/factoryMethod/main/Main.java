package factoryMethod.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import factoryMethod.Factory;
import factoryMethod.FactoryAutobuz;
import factoryMethod.FactoryTroleu;
import factoryMethod.TransportVehicle;

public class Main {
	
	public static void main(String[] args) {
		Factory fAutobuze = new FactoryAutobuz();
		
		Factory fTrolebuze = new FactoryTroleu();
		
		List <TransportVehicle> mijlocTransport = new ArrayList<>();
		

		Collections.addAll(mijlocTransport, 
				fAutobuze.createObject(36),
				fTrolebuze.createObject(40),
				fAutobuze.createObject(58));
		
		for(TransportVehicle t : mijlocTransport) {
			t.showInfo();
			t.moveType();
			System.out.println();
		}
	}

}
