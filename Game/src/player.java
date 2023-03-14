public class player {
    int xCoordinaate;
    int yCoordinaate;
    char object;

    Direction direction;

    public player(int worldWidth, int worldHeight) {
        this.xCoordinaate = (int) getRandomCoordinate(worldWidth);
        this.yCoordinaate = (int) getRandomCoordinate(worldHeight);
        this.object = 'P';
        this.direction = Direction.UP;

    }

    private static double getRandomCoordinate(int worldDimension) {
        return Math.random() * (worldDimension - 2) + 1;
    }

    public void move(String input, World world){
//        switch (input) {
//            case "w" -> this.yCoordinaate = this.yCoordinaate - 1;
//            case "s" -> this.yCoordinaate = this.yCoordinaate + 1;
//            case "a" -> this.xCoordinaate = this.xCoordinaate - 1;
//            case "d" -> this.xCoordinaate = this.xCoordinaate + 1;
//        }
        if (input.equals("w") ) {
            this.direction = Direction.UP;
            } else if (input.equals("s") ) {
            this.direction = Direction.DOWN;
            } else if (input.equals("a") ) {
            this.direction = Direction.LEFT;
            } else if (input.equals("d") ) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.yCoordinaate > 1) {
            this.yCoordinaate = this.yCoordinaate - 1;
        } else if (direction.equals(Direction.DOWN) && this.yCoordinaate < world.height-2) {
            this.yCoordinaate = this.yCoordinaate + 1;
        } else if (direction.equals(Direction.LEFT) && this.xCoordinaate > 1) {
            this.xCoordinaate = this.xCoordinaate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.xCoordinaate < world.width-2) {
            this.xCoordinaate = this.xCoordinaate + 1;
        }
    }
}
