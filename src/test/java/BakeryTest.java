import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BakeryTest {
    Shop shop;

    @BeforeEach
    public static void main(String[] args) {

        Flapjack f1 = new Flapjack("Delicious flapjack", "Plain", 1000, 70, false, 5);
        Spongecake s1 = new Spongecake("Victoria Sponge", "Jam and icing", 4, "Lemon syrup", 10);
        s1.addTopping("Lemon Slices");
        Bread b1 = new Bread("Wholemeal Bread", "Whole wheat", true, "Loaf", true, 1);


        Shop shop = new Shop();
        shop.addStock(f1);
        shop.addStock(s1);
        shop.addStock(b1);





    }
}
