package Transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGranda= new Car("","","",-1,
                0, "",true,"кузов",
                187,
                4,true, new Car.Key(true,true));
        Car AudiA8_50LTDI= new Car("Audi","A8  50 L TDI",
                "чёрного цвета",3f, 2020,
                "Германия",true,"кузов",187,
                4,true,new Car.Key(true,true));
        Car BMWZ8= new Car("BMW","Z8","чёрного цвета",3,
                2018,"Германия",true,"кузов",187,
                4,true,new Car.Key(true,true));
        Car KiaSportage= new Car("Kia","Sportage","оранжевого цвета"
                ,2.4f, 2018,
                "Южная Корея",true,"кузов",187,
                4,true,new Car.Key(true,true));
        Car HuindayAvante= new Car("красного цвета","Avante",
                "Huinday",1.6f, 2016,
                "Южная Корея",true,"кузов",187,
                4,true,new Car.Key(true,true));

        System.out.println(ladaGranda);
        System.out.println(AudiA8_50LTDI);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage);
        System.out.println(HuindayAvante);
    }
}