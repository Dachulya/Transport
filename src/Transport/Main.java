package Transport;

import Driver.A;
import Driver.B;
import Driver.D;

import static Driver.A.hey;
import static Driver.B.hey1;
import static Driver.D.hey2;



public class Main {
    public static void main(String[] args) {
        Car ladaGranda= new Car("","","",-1,
                0, "",true,"кузов",
                187,
                4,true, new Car.Key(true,true),67,6.7f);
        Car AudiA8_50LTDI= new Car("Audi","A8  50 L TDI",
                "чёрного цвета",3f, 2020,
                "Германия",true,"кузов",187,
                4,true,new Car.Key(true,true),80,7.0f);
        Car BMWZ8= new Car("BMW","Z8","чёрного цвета",3,
                2018,"Германия",true,"кузов",187,
                4,true,new Car.Key(true,true),160,9.8f);
        Car KiaSportage= new Car("Kia","Sportage","оранжевого цвета"
                ,2.4f, 2018,
                "Южная Корея",true,"кузов",187,
                4,true,new Car.Key(true,true),180,9.7f);
        Car HuindayAvante= new Car("красного цвета","Avante",
                "Huinday",1.6f, 2016,
                "Южная Корея",true,"кузов",187,
                4,true,new Car.Key(true,true),170,2.4f);

        /*System.out.println(ladaGranda);
        System.out.println(AudiA8_50LTDI);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage);
        System.out.println(HuindayAvante);*/

        HuindayAvante.setMaxSpeed(180);
        /*System.out.println(HuindayAvante.getMaxSpeed());*/

        Bus bus1= new Bus("red","tera","bmv",70,2000,"Chiny",6.8f);
        /*System.out.println(bus1);*/
        Truck truck1=new Truck("blue","truck","lada",60,1990,"Rossia",10.2f);
        Truck truck2=new Truck("black","truck","Mercedes",80,2010,"Germaniay",20.3f);

        //bus1.Stop();
        A driver1=new A(true,34,"Пётр Сергеевич","", HuindayAvante);
        B driver2=new B<>(true,34,"Анатолий Павлович","",truck1);
        B driver3=new B<>(true,25,"Павел Вениаминович","",truck2);
        D driver4=new D<>(true,7,"Ангелина Анатольевна","",bus1);

        /*System.out.println(driver1);
        driver1.Start(driver1);
        driver1.Stop(driver1);
        driver1.RefuelCar(driver1);*/
        //System.out.println(driver1);
        System.out.println(hey(HuindayAvante));
        System.out.println(hey1(truck1));
        System.out.println(hey2(bus1));

    }
}