package ro.acs.ro.builder;

public interface  AbstractBuilder {
	
	public abstract Reservation getReservation();
	
	
	public AbstractBuilder setterIsWindowPosition(boolean isWindowPosition) ;
	
	
	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable) ;



	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic) ;
	

	public AbstractBuilder setMusicType(String musicType) ;
}
