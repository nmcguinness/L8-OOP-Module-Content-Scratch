package topic03;

//Immutable (no setters on fields) and we cannot extend it e.g. MyProduct extends Product
public final class Product {
    private final String name;
    private final double price;
    private final double rating;

    public Product(String name, double price, double rating) {
        this.name = name; this.price = price; this.rating = rating;
    }

    public String get_name() { return name; }
    public double get_price() { return price; }
    public double get_rating() { return rating; }

    @Override
    public String toString() {
        return name + " (EUR " + price + ", " + rating + " stars)";
    }

    //TODO - equals, hashCode
}