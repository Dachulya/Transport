package Driver;

import Transport.Transport;

public abstract class Driver<T extends Transport> {
    protected boolean DriversLicense;
    protected int expirience;
    protected static String fullName;


    public Driver(boolean DriversLicense, int expirience, String fullName) {
        this.DriversLicense = DriversLicense;
        this.expirience = expirience;
        this.fullName = fullName;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public boolean isDriversLicense() {
        return DriversLicense;
    }

    public int getExpirience() {
        return expirience;
    }

    public String getFullName() {
        return fullName;
    }



    @Override
    public String toString() {
        return "Driver{" +
                "typeDriversLicense=" + isDriversLicense() +
                ", expirience=" + getExpirience() +
                ", fullName='" + getFullName() + '\'' +
                '}';
    }
    public void Start(Driver driver){
        System.out.println(driver.getFullName()+" srarted");
    }
    public void Stop(Driver driver){
        System.out.println(driver.getFullName()+" stopped");

    }
    public void RefuelCar(Driver driver){
        System.out.println(driver.getFullName()+" refuel the Car");

    }
}
