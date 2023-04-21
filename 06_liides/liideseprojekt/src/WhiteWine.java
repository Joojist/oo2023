public class WhiteWine extends Wine {
    private String grapeType;

    public WhiteWine(String name, int year, double price, String grapeType) {
        super(name, year, price);
        this.grapeType = grapeType;
    }

    public String getGrapeType() {
        return grapeType;
    }

    public void setGrapeType(String grapeType) {
        this.grapeType = grapeType;
    }

    @Override
    public String toString() {
        return super.toString() + " " + grapeType;
    }
}
