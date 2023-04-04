import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Bakery> stock;
    double totalTurnover;

    public Shop() {
        stock = new ArrayList<Bakery>();
        totalTurnover = 0;
    }

    public void addStock(Bakery item) {
        stock.add(item);
        totalTurnover = totalTurnover + item.calculatePrice();
    }
    public void addStock(Bakery item, int quantity) {
        for (int i = 0; i < quantity; i++){
            stock.add(item);
            totalTurnover = totalTurnover + item.calculatePrice();
        }
    }

    public void removeStock(Bakery item) {
        stock.remove(item);
        totalTurnover -= item.calculatePrice();
    }
    public double calculateTotalTurnover(){
        return totalTurnover;
    }

    }

        //getters and setters