package Transport;

import Transport.Enim.CarriageCapacity;
import Transport.Enim.PassengerCapacityBus;
import Transport.exceptions.TransportTypeException;

public class Truck extends Transport implements Competing{
    private  final CarriageCapacity carriageCapacity;
    public Truck(String color, String model, String brend, int maxSpeed, int dateRelease, String country,
                 float engineCapasity, CarriageCapacity carriageCapacity) {
        super(color, model, brend, maxSpeed, dateRelease, country, engineCapasity);
        this.carriageCapacity=carriageCapacity;
    }
    @Override
    boolean passDiagnostics() {
        return this.isDiagnosticsPassed();
    }
    @Override
    public String toString() {
        return "Truck{"
                +super.toString()+
                "CarriageCapacity="  +carriageCapacity+
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
