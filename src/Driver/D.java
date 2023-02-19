package Driver;

import Transport.Bus;

public class D<D extends Bus> extends Driver{
    private String typeDriversLicense;
    private final Transport.Bus Bus;

    public D(boolean DriversLicense, int expirience,
             String fullName, String typeDriversLicense, Transport.Bus bus) {
        super(DriversLicense, expirience, fullName);
        this.typeDriversLicense="D";
        Bus = bus;
    }

    public static String hey2(Bus bus) {
        return bus.getModel()+" "+bus.getBrend()+" управляется водителем "+fullName+"  и будет учавствоватьв гонках";
    }

    @Override
    public String toString() {
        return "D{" +
                "typeDriversLicense='" + typeDriversLicense + '\'' +
                ", DriversLicense=" + DriversLicense +
                ", expirience=" + expirience +
                ", fullName='" + fullName + '\'' + Bus +
                '}';
    }
}
