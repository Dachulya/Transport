public class Main {
    public static void main(String[] args) {
        Car ladaGranda= new Car("","",-1," ",
                0, "");
        Car AudiA8_50LTDI= new Car("Audi","A8  50 L TDI",
                3,"чёрного цвета", 2020,
                "Германия");
        Car BMWZ8= new Car("BMW","Z8",3,"чёрного цвета",
                2018,"Германия");
        Car KiaSportage= new Car("Kia","Sportage",
                2.4f,"оранжевого цвета", 2018,
                "Южная Корея");
        Car HuindayAvante= new Car("Huinday","Avante",
                1.6f,"красного цвета", 2016,
                "Южная Корея");

        System.out.println(ladaGranda);
        System.out.println(AudiA8_50LTDI);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage);
        System.out.println(HuindayAvante);
    }
}