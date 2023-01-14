public class Milk extends Product {
    private String taste;

    public Milk(String name, double cost, String taste) {
        super(name, cost);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return getName()+ ": " + getCost()+ " " + taste;
    }

    public String getTaste() {
        return taste;
    }
}