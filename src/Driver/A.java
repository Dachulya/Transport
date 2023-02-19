package Driver;

import Transport.Car;

public class A<A extends Car> extends Driver{

    private String typeDriversLicense;
    private final A Car;
    public A(boolean DriversLicense, int expirience,
             String fullName, String typeDriversLicense, A car) {
        super(DriversLicense, expirience, fullName);
        Car = car;
        this.typeDriversLicense="A";

    }


    public static String hey(Car car) {
        return car.getModel()+" "+car.getBrend()+" управляется водителем "+fullName+"  и будет учавствоватьв гонках";
    }


    @Override
    public String toString() {
        return "A{" +
                "typeDriversLicense='" + typeDriversLicense + '\'' +
                ", DriversLicense=" + DriversLicense +
                ", expirience=" + expirience +
                ", fullName='" + fullName + '\'' + Car+
                '}';
    }
}
