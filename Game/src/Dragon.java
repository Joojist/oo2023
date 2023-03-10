public class Dragon {
    int XCoordinaate;
    int YCoordinaate;
    char object;

    public Dragon(int worldWidth, int worldHeigth){
        this.XCoordinaate = (int) getRandomCoordinate(worldWidth);
        this.YCoordinaate = (int) getRandomCoordinate(worldHeigth);
        this.object = 'D';
    }

    private static double getRandomCoordinate(int worldDimension) {
        return Math.random() * (worldDimension - 2) + 1;
    }
}
