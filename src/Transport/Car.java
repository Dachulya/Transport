package Transport;

import Driver.Driver;
import Transport.Enim.BodyType;
import Transport.exceptions.TransportTypeException;


public class Car extends Transport implements Competing {

    private  final BodyType bodyType;
    private float engineVolume;
    private boolean transmission;
    private String transmis;

    private int registrationNumber;
    private int numberOfSeats;
    private boolean typeOfRubber;
    private String rubber;




    public float getEngineVolume() {
        return engineVolume;
    }
    public String getTransmis() {
        return transmis;
    }



    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRubber() {
        return rubber;
    }



    public void setEngineVolume(float engineVolume) {
        if (engineVolume<=0){
            this.engineVolume=getEngineVolume();
        }else {
            this.engineVolume=engineVolume;
        }
    }

    public void setTransmission(boolean transmission) {
        this.transmission = transmission;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }
    public static class Key{
        private static boolean remoteEngineStart;
        private static boolean notKeyAccess;

        public Key(boolean remoteEngineStart, boolean notKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.notKeyAccess = notKeyAccess;
        }

        public static boolean getIsRemoteEngineStart() {
            return remoteEngineStart;
        }

        public static boolean getIsNotKeyAccess() {
            return notKeyAccess;
        }
    }

    public Car(String color, String model, String brend, float engineVolume, int dateRelease, String country,
               Boolean transmission, int registrationNumber, int numberOfSeats,
               boolean typeOfRubber,Key key,int maxSpeed,float engineCapasity,BodyType bodyType) {
        super(color, model, brend,maxSpeed, dateRelease, country,engineCapasity);

        if (engineVolume<=0){
            engineVolume=1.5f;
        }else {
            this.engineVolume=engineVolume;
        }
        if (this.transmission=true){
            this.transmis="avtomat";}
        else{
            this.transmis="mex";
            }

        this.registrationNumber = DivideIntoVariants(registrationNumber,0000);
        this.numberOfSeats = DivideIntoVariants(numberOfSeats,4);;
        if (this.typeOfRubber=true){
            this.rubber="summer";}
        else{
            this.rubber="winter";
        }
        this.bodyType=bodyType;
    }
    @Override
    boolean passDiagnostics() {
        return this.isDiagnosticsPassed();
    }


    public static String divideIntoVariants(String value, String defaultValue){
        if (value==null || value.isBlank()){
            return defaultValue;
        }else {
            return value;}}

    public static int DivideIntoVariants(int value,int defaultValue){
        if (value<=0){
            return defaultValue;
        }else {
            return value;}}

    @Override
    public String toString() {
        return "TransportCar{" +
                "color='" + getColor() + '\'' +
                ", model='" + getModel() + '\'' +
                ", brend='" + getBrend() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", dateRelease=" + getDateRelease() +
                ", country='" + getCountry() + '\'' +
                "transmission='" + getTransmis() + '\''
                 + '\'' +
                "registrationNumber='" + getRegistrationNumber() + '\'' +
                "numberOfSeats='" + getNumberOfSeats() + '\'' +
                "typeOfRubber='" + getRubber() + '\'' +
                "Key='" +Key.getIsNotKeyAccess()+'\''+Key.getIsRemoteEngineStart()+'\''+
                "maxSpeed="+getMaxSpeed()+'\''+"engineCapacity="+getEngineCapasity()+bodyType+
                '}';
    }/*transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean typeOfRubber*/

    @Override
    public void PitStop() {
        System.out.println("Pit-Stop ");
    }
    @Override
    public void Stop() {
        System.out.println("Stopped ");
    }
    @Override
    public void Start() {
        System.out.println("Started ");

    }

}
