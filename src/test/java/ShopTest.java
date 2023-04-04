import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {
    Shop shop;
    @BeforeEach
    public void setUp() {
        Flapjack f1 = new Flapjack("Delicious flapjack", "Plain", 1000, 70, false,1);
        Spongecake s1 = new Spongecake("Victoria Sponge", "Jam and icing", 4, "Lemon syrup", 5);
        s1.addTopping("Lemon Slices");
        Bread b1 = new Bread("Wholemeal Bread", "Whole wheat", true, "Loaf", true, 1);

       shop = new Shop();
       shop.addStock(f1);
       shop.addStock(s1, 5);
       shop.addStock(b1);

    }

    @Test
    public void calculateTotalTurnover() {
        assertThat(this.shop.calculateTotalTurnover()).isEqualTo(27);

    }
    @Test
    public void canCountSpongeCalories() {
        Spongecake s1 = new Spongecake("Victoria Sponge","Random",3,"Nothing",100);
        String result = s1.sponge(50);
        assertThat(result).isEqualTo("Victoria Sponge contains 50cal");
    }
    @Test
    public void canCountFlapCalories() {
        Flapjack f1 = new Flapjack("Delicious Flapjack", "Random",1,1,false,80);
        String result = f1.flap(100);
        assertThat(result).isEqualTo("Delicious Flapjack contains 100cal");
    }
    @Test
    public void canCountBreaCalories() {
        Bread b1 = new Bread("Wholemeal Bread","Random",true,"Random", true,10);
        String result = b1.brea(150);
        assertThat(result).isEqualTo("Wholemeal Bread contains 150cal");
    }

}