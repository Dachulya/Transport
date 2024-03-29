package Transport;

import Driver.Driver;
import Transport.exceptions.TransportTypeException;
import mechanic.Mechanic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Transport.Car.DivideIntoVariants;
import static Transport.Car.divideIntoVariants;


public abstract class Transport {
    private boolean diagnosticsPassed;
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
    
    private final List<Driver> driverlist=new ArrayList<>();
    private final List<Transport> transports=new ArrayList<>();
    private final List<Mechanic> mechanics=new ArrayList<>();



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

        for (Transport transport: transports){
            transports.add(transport);
        }
        Map<Transport,List<Mechanic>> map=new HashMap<>();
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

    public void setDiagnisticsPassed(boolean diagnisticsPassed){
        this.diagnosticsPassed=diagnisticsPassed;
    }
    public boolean checkTransportNeedService(){
        try {
            passDiagnostics();}
        catch (TransportTypeException e){
                return false;}
        return true;

    }
    public boolean isDiagnosticsPassed(){return diagnosticsPassed;}
    abstract boolean passDiagnostics() throws TransportTypeException;


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
