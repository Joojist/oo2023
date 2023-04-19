import java.util.ArrayList;

public class WineStore implements WineSelling {
    private ArrayList<Wine> wines;

    // Constructor
    public WineStore() {
        wines = new ArrayList<>();
    }

    // Method to add a wine to the store
    public void addWine(Wine wine) {
        wines.add(wine);
    }

    // Implementation of WineSelling interface method
    public void sellWine(Wine wine) {
        if (wines.contains(wine)) {
            wines.remove(wine);
            System.out.println("Sold: " + wine.toString());
        }
        else {
            System.out.println("Wine not found in store");
        }
    }

    // Print the list of wines
    public void printWines() {
        for (Wine wine : wines) {
            System.out.println(wine.toString());
        }
    }

    // Main method
    public static void main(String[] args) {
        WineStore store = new WineStore();

        // Create some red wines
        RedWine wine1 = new RedWine("Chateau Margaux", 2001, 500.0, "Cabernet Sauvignon");
        RedWine wine2 = new RedWine("Opus One", 2006, 400.0, "Cabernet Franc");

        // Add the wines to the store
        store.addWine(wine1);
        store.addWine(wine2);

        // Print the list of wines
        System.out.println("List of wines:");
        store.printWines();

        // Sell a wine
        System.out.println("\nSelling a wine...");
        store.sellWine(wine1);

        // Print the updated list of wines
        System.out.println("\nList of wines after selling:");
        store.printWines();
    }
}