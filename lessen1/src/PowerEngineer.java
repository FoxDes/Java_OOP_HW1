public class PowerEngineer extends Product {
    private String manufacturer;

    public PowerEngineer(String name, double cost, String manufacturer) {
        super(name, cost);
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return getName() + ": " + getCost() + " " + manufacturer;
    }

    public String getTaste() {
        return manufacturer;
    }
}