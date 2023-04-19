// RedWine class (subclass)
public class RedWine extends Wine {
    private String grapeType;

    // Constructor
    public RedWine(String name, int year, double price, String grapeType) {
        super(name, year, price);
        this.grapeType = grapeType;
    }

    // Getter and setter
    public String getGrapeType() {
        return grapeType;
    }

    public void setGrapeType(String grapeType) {
        this.grapeType = grapeType;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + " " + grapeType;
    }
}