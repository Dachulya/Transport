package Transport.Enim;

public enum CarriageCapacity {
    N1(null,3.5f),
    N2(3.5f,12f),
    N3(12f,null);
    private Float capacityFrom;
    private Float capacityTo;


    CarriageCapacity(Float capacityFrom, Float capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }
    @Override
    public String toString() {
        String capacityFromString= capacityFrom !=null
                ? "от"+ capacityFrom:"";
        String capacityToString= capacityTo !=null
                ?"до"+capacityTo+"тонн":"";
        return "Грузоподъёмность"+capacityFromString+" "+capacityToString;
    }
}
