import java.util.ArrayList;
import java.util.List;

public class Spongecake extends Bakery {
    int tiers;
    String topping;
    List<String> additionalToppings;



    public Spongecake(String name, String flavour, int tiers, String topping, double price) {
        super(name, flavour, price);
        this.tiers = tiers;
        this.topping = topping;
        this.additionalToppings = new ArrayList<String>();
    }


    public void addTopping(String topping) {
        additionalToppings.add(topping);
    }
    public String sponge(int calories) {
        return this.name + " contains " + calories + "cal";
    }

  //  public double calculatePrice() {
  //      double price = 0;
  //      return price;
   // }


    //getters and setters
    public int getTiers() {
        return tiers;
    }

    public String getTopping() {
        return topping;
    }

    public List<String> getAdditionalToppings() {
        return additionalToppings;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setAdditionalToppings(List<String> additionalToppings) {
        this.additionalToppings = additionalToppings;
    }
}
