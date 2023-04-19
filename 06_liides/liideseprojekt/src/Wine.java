public class Wine {
    private String name;
    private int year;
    private double price;

    // Constructor
    public Wine(String name, int year, double price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return name + " " + year + " " + price;
    }
}