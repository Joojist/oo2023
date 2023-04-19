public class Item implements worldobject{
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

    public int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
