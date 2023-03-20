package mechanic;

import Transport.Car;
import Transport.Transport;
import Transport.Truck;

public class Mechanic {
    private String nameMechanic;
    private String company;

    public Mechanic(String nameMechanic, String company) {
        this.nameMechanic = nameMechanic;
        this.company = company;
    }
    public void performMaintenance(Car car){
       System.out.println("Техническое обслуживание произведено"+car);
    }
    public void performMaintenance(Truck truck){
        System.out.println("Техническое обслуживание произведено"+truck);
    }
    public void repairTransport(Transport transport){
        System.out.println("Транспорт отремонтирован"+transport);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "nameMechanic='" + nameMechanic + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
