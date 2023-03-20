package Transport;

import Transport.Enim.CarriageCapacity;
import mechanic.Mechanic;

public class Truck extends Transport implements Competing{
    private  final CarriageCapacity carriageCapacity;
    private final Mechanic mechanic;
    public Truck(String color, String model, String brend, int maxSpeed, int dateRelease, String country,
                 float engineCapasity, CarriageCapacity carriageCapacity, Mechanic mechanic) {
        super(color, model, brend, maxSpeed, dateRelease, country, engineCapasity);
        this.carriageCapacity=carriageCapacity;
        this.mechanic=mechanic;
    }
    @Override
    boolean passDiagnostics() {
        return this.isDiagnosticsPassed();
    }
    @Override
    public String toString() {
        return "Truck{"
                +super.toString()+
                "CarriageCapacity="  +carriageCapacity+","+mechanic+
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
