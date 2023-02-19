package Transport;

import static Transport.Car.DivideIntoVariants;
import static Transport.Car.divideIntoVariants;

public abstract class Transport {
    private String color;
    private String model;
    private String brend;
    private int maxSpeed;
    private int dateRelease;
    private String country;
    private float engineCapasity;

    public String getColor() {
        return color;
    }

    public float getEngineCapasity() {
        return engineCapasity;
    }
    public String getModel() {
        return model;
    }

    public String getBrend() {
        return brend;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public String getCountry() {
        return country;
    }

    public Transport(String color, String model,
                     String brend, int maxSpeed,
                     int dateRelease, String country,float engineCapasity) {
        this.color = divideIntoVariants(color,"white");
        this.model = divideIntoVariants(model,"default");
        this.brend = divideIntoVariants(brend,"default");
        this.maxSpeed = DivideIntoVariants(maxSpeed,0);
        this.dateRelease = DivideIntoVariants(dateRelease,2000);
        this.country = divideIntoVariants(country,"default");
        this.engineCapasity=engineCapasity;
    }

    public void setColor(String color) {
        if (color==null || color.isBlank()){
            this.color = "default";}
        else {
            this.color=color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (this.maxSpeed<maxSpeed){
            this.maxSpeed = maxSpeed;}
    }
    public void start(){
        System.out.println("Start "+"");
    }
    public  void stop(){
        System.out.println("Stop "+"");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", brend='" + brend + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", dateRelease=" + dateRelease +
                ", country='" + country + '\'' +
                "engineCapasity= "+engineCapasity+
                '}';
    }
}
