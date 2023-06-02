package class26;

public class Entry {
    String key;
    Double price;

    public Entry(String key, Double price) {
        this.key = key;
        this.price = price;

    }

    public String getKey() {
        return key;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", price=" + price +
                '}';
    }
}
