package ro.acs.ro.builder.model;

import ro.acs.ro.builder.AbstractBuilder;
import ro.acs.ro.builder.Builder;
import ro.acs.ro.builder.Reservation;

public class BuilderV2 implements AbstractBuilder{
	
	private boolean isWindowPosition;
	private boolean isErgoChairs;
	private boolean isDecoratedTable;
	private boolean isAmbientalMusic;
	private String musicType;
	
	
	

	@Override
	public Reservation getReservation() {
		return new Reservation(isWindowPosition, isErgoChairs, isDecoratedTable, isAmbientalMusic, musicType);
	}

	
	public BuilderV2() {
		isWindowPosition = false;
		isErgoChairs = false;
		isDecoratedTable = false;
		isAmbientalMusic = false;
		musicType = null;
	}
	
	@Override
	public BuilderV2 setterIsWindowPosition(boolean isWindowPosition) {
		this.isWindowPosition = isWindowPosition;
		return this;
	}

	@Override
	public BuilderV2 setDecoratedTable(boolean isDecoratedTable) {
		this.isDecoratedTable = isDecoratedTable;
		return this;
	}

	@Override
	public BuilderV2 setAmbientalMusic(boolean isAmbientalMusic) {
		this.isAmbientalMusic = isAmbientalMusic;
		return this;
	}

	@Override
	public BuilderV2 setMusicType(String musicType) {
		this.musicType= musicType;
		return this;
	}

}
