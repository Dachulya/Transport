public class Car {
    private String color;
    private String model;
    private String brend;
    private float engineVolume;
    private int dateRelease;
    private String country;

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

    public void setColor(String color) {
        if (color==null || color.isBlank()){
        this.color = "default";}
        else {
            this.color=color;
        }
    }

    public Car(String brend, String model,  float engineVolume,String color, int dateRelease, String country) {
        this.color = divideIntoVariants(color,"white");
        this.model = divideIntoVariants(model,"default");
        this.brend = divideIntoVariants(brend,"default");
        if (engineVolume<=0){
            engineVolume=1.5f;
        }else {
            this.engineVolume=engineVolume;
        }
        this.engineVolume = engineVolume;
        this.dateRelease = DivideIntoVariants(dateRelease,2000);
        this.country = divideIntoVariants(country,"default");
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
                '}';
    }
}
