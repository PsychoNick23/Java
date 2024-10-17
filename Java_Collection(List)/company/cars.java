package company;

public class cars {
    String name;
    int apm;
    String price;


    public cars(String name, int apm, String price) {
        this.name = name;
        this.apm = apm;
        this.price = price;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", apm=" + apm +
                ", price='" + price + '\'' ;
    }

}
