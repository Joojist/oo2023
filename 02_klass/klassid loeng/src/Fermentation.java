public class Fermentation {
    String rawMaterial;
    String alcoholType;
    float sugarQuantity;
    int amountOfL;

    public Fermentation(String rawMaterial, String alcoholType, float sugarQuantity, int amountOfL) {
        this.alcoholType = alcoholType;
        this.amountOfL = amountOfL;
        this.rawMaterial = rawMaterial;
        this.sugarQuantity = sugarQuantity;
    }

}
