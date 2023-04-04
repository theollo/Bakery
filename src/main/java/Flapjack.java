public class Flapjack extends Bakery {
    int oats;
    double weight;
    boolean syrup;

    public Flapjack(String name, String flavour, int oats, double weight, boolean syrup, double price) {
        super(name, flavour, price);
        this.oats = oats;
        this.weight = weight;
        this.syrup = syrup;
    }
    public String flap(int calories){
        return this.name + " contains " + calories + "cal";
    }

 //   public double calculatePrice() {
   //     double price = 5;
  //      return price;
  //  }


    //getters and setters
    public int getOats() {
        return oats;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isSyrup() {
        return syrup;
    }

    public void setOats(int oats) {
        this.oats = oats;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSyrup(boolean syrup) {
        this.syrup = syrup;
    }
}


