package Driver;

import Transport.Car;
import Transport.Truck;

public class B<B extends Truck> extends Driver {
    private String typeDriversLicense;
    private final B Truck;

    public B(boolean DriversLicense, int expirience,
             String fullName,String typeDriversLicense,B truck) {
        super(DriversLicense, expirience, fullName);
        this.typeDriversLicense="B";
        Truck= truck;
    }
    public static String hey1(Truck truck) {
        return truck.getModel()+" "+truck.getBrend()+" управляется водителем "+fullName+"  и будет учавствоватьв гонках";
    }

    @Override
    public String toString() {
        return "B{" +
                "typeDriversLicense='" + typeDriversLicense + '\'' +
                ", DriversLicense=" + DriversLicense +
                ", expirience=" + expirience +
                ", fullName='" + fullName + '\'' + Truck+
                '}';
    }
}
