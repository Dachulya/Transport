package Transport;

public class Car {
    private String color;
    private String model;
    private String brend;
    private float engineVolume;
    private int dateRelease;
    private String country;

    private boolean transmission;
    private String transmis;
    private String bodyType;
    private int registrationNumber;
    private int numberOfSeats;
    private boolean typeOfRubber;
    private String rubber;


    public String getModel() {
        return model;
    }

    public String getBrend() {
        return brend;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getTransmis() {
        return transmis;
    }

    public String getBodyType() {
        return bodyType;
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

    public void setColor(String color) {
        if (color==null || color.isBlank()){
        this.color = "default";}
        else {
            this.color=color;
        }
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
               Boolean transmission, String bodyType, int registrationNumber, int numberOfSeats,
               boolean typeOfRubber,Key key) {
        this.color = divideIntoVariants(color,"white");
        this.model = divideIntoVariants(model,"default");
        this.brend = divideIntoVariants(brend,"default");
        if (engineVolume<=0){
            engineVolume=1.5f;
        }else {
            this.engineVolume=engineVolume;
        }
        this.dateRelease = DivideIntoVariants(dateRelease,2000);
        this.country = divideIntoVariants(country,"default");
        if (this.transmission=true){
            this.transmis="avtomat";}
        else{
            this.transmis="mex";
            }
        this.bodyType = divideIntoVariants(bodyType,"default");
        this.registrationNumber = DivideIntoVariants(registrationNumber,0000);
        this.numberOfSeats = DivideIntoVariants(numberOfSeats,4);;
        if (this.typeOfRubber=true){
            this.rubber="summer";}
        else{
            this.rubber="winter";
        }
    }



    public static String divideIntoVariants(String value,String defaultValue){
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
                "transmission='" + getTransmis() + '\'' +
                "bodyType='" + getBodyType() + '\'' +
                "registrationNumber='" + getRegistrationNumber() + '\'' +
                "numberOfSeats='" + getNumberOfSeats() + '\'' +
                "typeOfRubber='" + getRubber() + '\'' +
                "Key='" +Key.getIsNotKeyAccess()+'\''+Key.getIsRemoteEngineStart()+
                '}';
    }/*transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean typeOfRubber*/
}
