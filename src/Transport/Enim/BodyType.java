package Transport.Enim;

public enum BodyType {
    SEDAN("СЕДАН"),
    HATCBACK("ХЭТЧБЭК"),
    COUPE("КУПЕ"),
    UNIVERSAL("УНИВЕРСАЛ"),
    ALLROAD("ВНЕДОРОЖНИК"),
    CROSSOVER("КРОССОВЕР"),
    PICKUP("ПИКАП"),
    VAN("ФУРГОН"),
    MINIVAN("МИНИВЭН");


    private final String name;
    BodyType(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return "BodyType{" +
                "name='" + name + '\'' +
                '}';
    }

}
