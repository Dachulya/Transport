package Transport;

public class Truck extends Transport implements Competing{
    public Truck(String color, String model, String brend, int maxSpeed, int dateRelease, String country, float engineCapasity) {
        super(color, model, brend, maxSpeed, dateRelease, country, engineCapasity);
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
