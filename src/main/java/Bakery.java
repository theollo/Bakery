public class Bakery {
    String name;
    String flavour;
    Double price;

    public Bakery(String name, String flavour, double price) {
        this.name = name;
        this.flavour = flavour;
        this.price = price;
    }

    public double calculatePrice() {
        return price;
    }
}
