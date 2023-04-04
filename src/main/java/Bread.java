public class Bread extends Bakery {
    boolean isFresh;
    String type;
    boolean hasSeeds;

    public Bread(String name, String flavour, boolean isFresh, String type, boolean hasSeeds, double price) {
        super(name, flavour, price);
        this.isFresh = isFresh;
        this.type = type;
        this.hasSeeds = hasSeeds;
    }

    public String brea(int calories) {
        return this.name + " contains " + calories + "cal";
    }

    // public double calculatePrice() {
    //    double price = 0;
    //      return price;
    // }
    //getters and setters


    public boolean isFresh() {
        return isFresh;
    }

    public String getType() {
        return type;
    }

    public boolean isHasSeeds() {
        return hasSeeds;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHasSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }

}

