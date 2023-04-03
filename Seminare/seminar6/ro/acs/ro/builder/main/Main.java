package ro.acs.ro.builder.main;

import ro.acs.ro.builder.AbstractBuilder;
import ro.acs.ro.builder.Builder;
import ro.acs.ro.builder.Reservation;
import ro.acs.ro.builder.model.BuilderV2;

public class Main {

	public static void main(String[] args) {
		AbstractBuilder builder = new Builder();
		builder.setAmbientalMusic(true)
		.setMusicType("Jazz");
		Reservation reservation = builder.getReservation();
		System.out.println(reservation.toString());
		
		Reservation reservation1 = new Builder().setAmbientalMusic(true)
				.setMusicType("Ceva")
				.getReservation();
		System.out.println(reservation1.toString());
		
//		reservation.setMusicType("Rock");
//		System.out.println(reservation.toString());

		
		//Reservation reservation2 = builder.getReservation();
		
		AbstractBuilder builder2 = new BuilderV2();
		Reservation reservation2 = builder2.setAmbientalMusic(true)
				.setMusicType("Rock")
				.getReservation();
		System.out.println(reservation2.toString());
		

		Reservation reservation3 = builder2.setMusicType("Rock")
				.getReservation();
		System.out.println(reservation2.toString());
		
		
		
	}

}
