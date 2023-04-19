public class Character {
    int xCoordinaate;
    int yCoordinaate;
    char object;

    public Character(int worldWidth, int worldHeigth, char object){

        this.xCoordinaate = (int) getRandomCoordinate(worldWidth);
        this.yCoordinaate = (int) getRandomCoordinate(worldHeigth);
        this.object = object;
    }

    private static double getRandomCoordinate(int worldDimension) {
        return Math.random() * (worldDimension - 2) + 1;
    }
}
