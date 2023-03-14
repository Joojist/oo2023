public class Item {
    int xCoordinate;
    int yCoordinate;
    int strength;
    int durability;
    String name;

    public Item(int worldWidth, int worldHeight, int strength, int durability, String name) {
        this.xCoordinate = (int) getRandomCoordinate(worldWidth);
        this.yCoordinate = (int) getRandomCoordinate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }

    private static double getRandomCoordinate(int worldDimension) {
        return Math.random() * (worldDimension - 2) + 1;
    }
}
