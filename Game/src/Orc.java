public class Orc {
    int XCoordinaate;
    int YCoordinaate;
    char object;

    public Orc(int worldWidth, int worldHeigth){
        this.object = 'O';
        this.XCoordinaate = (int) getRandomCoordinate(worldWidth);;
        this.YCoordinaate = (int) getRandomCoordinate(worldHeigth);;
    }

    private static double getRandomCoordinate(int worldDimension) {
        return Math.random() * (worldDimension - 2) + 1;
    }
}
