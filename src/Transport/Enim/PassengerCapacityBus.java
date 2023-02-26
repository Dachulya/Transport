package Transport.Enim;

public enum PassengerCapacityBus {
    XS(0,10),
    S(0,25),
    M(40,50),
    L(60,80),
    XL(100,120);


    private final int capacityFrom;
    private final int capacityTo;

    PassengerCapacityBus(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }
    @Override
    public String toString() {
        String capacityFromString= capacityFrom !=0
                ? "от"+ capacityFrom:"";
        String capacityToString= capacityTo !=0
                ?"до"+capacityTo+"тонн":"";
        return "Грузоподъёмность"+capacityFromString+" "+capacityToString;
    }
}
