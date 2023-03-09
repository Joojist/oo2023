public class player {
    int xCoordinaate;
    int yCoordinaate;
    char object;

    public player(int worldWidth, int worldHeight) {
        this.xCoordinaate = (int) getRandomCoordinate(worldWidth);
        this.yCoordinaate = (int) getRandomCoordinate(worldHeight);
        this.object = 'P';

    }

    private static double getRandomCoordinate(int worldDimension) {
        return Math.random() * (worldDimension - 2) + 1;
    }

    public void move(String input){
        switch (input) {
            case "w" -> this.yCoordinaate = this.yCoordinaate - 1;
            case "s" -> this.yCoordinaate = this.yCoordinaate + 1;
            case "a" -> this.xCoordinaate = this.xCoordinaate - 1;
            case "d" -> this.xCoordinaate = this.xCoordinaate + 1;
        }
    }
}
