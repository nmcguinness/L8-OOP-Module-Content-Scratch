package topic03;

import java.util.Comparator;

public class PriceAsc implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        // lower price should come first
        return Double.compare(a.get_price(), b.get_price());
    }
}