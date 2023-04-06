package Transport;

import Driver.A;
import Driver.B;
import Driver.D;
import Transport.Enim.BodyType;
import mechanic.Mechanic;

import static Transport.Enim.CarriageCapacity.N1;
import static Transport.Enim.CarriageCapacity.N3;
import static Transport.Enim.PassengerCapacityBus.L;

public class Main {
    public static void main(String[] args) {

        Mechanic mechanic1=new Mechanic("Аркадий1","remontServis");
        Mechanic mechanic2=new Mechanic("Анатолий","remontServis");
        Mechanic mechanic3=new Mechanic("Андре","remontServis");


        Car ladaGranda= new Car("","","",-1,
                0, "",true ,187,
                4,true, new Car.Key(true,true),
                67,6.7f, BodyType.MINIVAN, mechanic1 );
        Car AudiA8_50LTDI= new Car("Audi","A8  50 L TDI",
                "чёрного цвета",3f, 2020,
                "Германия",true,187,
                4,true,new Car.Key(true,true),
                80,7.0f,BodyType.PICKUP,mechanic1);
        Car BMWZ8= new Car("BMW","Z8","чёрного цвета",3,
                2018,"Германия",true,187,
                4,true,new Car.Key(true,true),
                160,9.8f,BodyType.SEDAN, mechanic2);
        Car KiaSportage= new Car("Kia","Sportage","оранжевого цвета"
                ,2.4f, 2018,
                "Южная Корея",true,187,
                4,true,new Car.Key(true,true),
                180,9.7f,BodyType.VAN,mechanic2);
        Car HuindayAvante= new Car("красного цвета","Avante",
                "Huinday",1.6f, 2016,
                "Южная Корея",true,187,
                4,true,new Car.Key(true,true),
                170,2.4f,BodyType.HATCBACK, mechanic2);



        HuindayAvante.setMaxSpeed(180);


        Bus bus1= new Bus("red","tera","bmv",70,2000,
                "Chiny",6.8f,L,mechanic3);

        Truck truck1=new Truck("blue","truck","lada",60,
                1990,"Rossia",10.2f,N1,mechanic3);
        Truck truck2=new Truck("black","truck","Mercedes",80,
                2010,"Germaniay",20.3f, N3,mechanic2);



        //bus1.Stop();
        A driver1=new A(true,34,"Пётр Сергеевич","", HuindayAvante);
        B driver2=new B<>(true,34,"Анатолий Павлович","",truck1);
        B driver3=new B<>(true,25,"Павел Вениаминович","",truck2);
        D driver4=new D<>(true,7,"Ангелина Анатольевна","",bus1);

        carryOutTransport(bus1,HuindayAvante,truck1,truck2);

    }

    public static void carryOutTransport(Transport...transports){
        ServiceStation serviceStation=new ServiceStation();
        for (Transport transport:transports){
            serviceStation.addTransport(transport);
        }
        serviceStation.carryOutATechnicalInspection();
    }
    public static void checkTransport(Transport...transports){
        int count=0;
        for (Transport transport:transports){
            if (!transport.passDiagnostics()){
                try{
                    throw new RuntimeException(transport.getBrend()+" "+
                            transport.getModel()+" не прошёл диагностику");
                }catch (RuntimeException e){
                e.printStackTrace();
            }}else {
                count++;
            }
        }
        System.out.println("диагностику прошли"+ count
                +" из "+transports.length+" автомобилей ");
    }
}