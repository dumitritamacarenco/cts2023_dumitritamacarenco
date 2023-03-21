package factoryMethod;
import factoryMethod.Factory;
import factoryMethod.Tramvai;
import factoryMethod.TransportVehicle;

public class FactoryTramvai implements Factory{

	@Override
	public TransportVehicle createObject(int noSeats) {
		return new Tramvai(noSeats);
	}

}
