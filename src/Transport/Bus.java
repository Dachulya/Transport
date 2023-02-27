package Transport;

import Transport.Enim.BodyType;
import Transport.Enim.PassengerCapacityBus;
import Transport.Enim.PassengerCapacityBus;
import Transport.exceptions.TransportTypeException;

public class Bus extends Transport implements Competing{

    private  final PassengerCapacityBus passengerCapacityBus;

    public Bus(String color, String model, String brend, int maxSpeed, int dateRelease, String country, float engineCapasity,
               PassengerCapacityBus passengerCapacityBus) {
        super(color, model, brend, maxSpeed, dateRelease, country,engineCapasity);
        this.passengerCapacityBus=passengerCapacityBus;
    }

    @Override
    boolean passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("автобусы диагностике не подлежат");
    }

    @Override
    public String toString() {
        return "Bus{"  +super.toString()+

                "passengerCapacityBus=" + passengerCapacityBus +
                '}';
    }

    @Override
    public void PitStop() {
        System.out.println("Pit-Stop ");
    }
    @Override
    public void Stop() {
        System.out.println("Stopped ");
    }@Override
    public void Start() {
        System.out.println("Started ");

    }
}
