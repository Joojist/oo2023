import java.util.ArrayList;

public class WineStore implements WineSelling {
    private ArrayList<Wine> wines;

    // Constructor
    public WineStore() {
        wines = new ArrayList<>();
    }

    // veini lisamine poodi
    public void addWine(Wine wine) {
        wines.add(wine);
    }

    // müümine
    public void sellWine(Wine wine) {
        if (wines.contains(wine)) {
            wines.remove(wine);
            System.out.println("Sold: " + wine.toString());
        }
        else {
            System.out.println("Wine not found in store");
        }
    }

    // veini printimine
    public void printWines() {
        for (Wine wine : wines) {
            System.out.println(wine.toString());
        }
    }

    public static void main(String[] args) {
        WineStore store = new WineStore();

        RedWine wine1 = new RedWine("Chateau Margaux", 2001, 500.0, "Cabernet Sauvignon");
        RedWine wine2 = new RedWine("Opus One", 2006, 400.0, "Cabernet Franc");

        store.addWine(wine1);
        store.addWine(wine2);

        System.out.println("List of wines:");
        store.printWines();

        System.out.println("\nSelling a wine...");
        store.sellWine(wine1);

        System.out.println("\nList of wines after selling:");
        store.printWines();
    }
}