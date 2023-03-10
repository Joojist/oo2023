public class World {

    int width;
    int height;

    public World(int width, int height){
        this.height = height;
        this.width = width;

    }


    public void printMap(int worldWidth, int worldHeigth, int playerXCoordinaate, int playerYCoordinaate, char playerobject, int dragonXCoordinaate, int dragonYCoordinaate, char dragonobject, int orcXCoordinaate, int orcYCoordinaate, char orcobject) {
        for(int y = 0; y < worldHeigth; y++) {
            System.out.println();
            for(int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeigth -1) {
                    System.out.print("-");
                }else if (x == 0 || x == worldWidth -1) {
                    System.out.print("|");
                } else {
                    //parem kl]ps -> refactor -> extract
                    printcharacters(playerXCoordinaate, playerYCoordinaate, playerobject, dragonXCoordinaate, dragonYCoordinaate, dragonobject, orcXCoordinaate, orcYCoordinaate, orcobject, y, x);
                }
            }
        }
    }




    private static void printcharacters(int playerXCoordinaate, int playerYCoordinaate, char playerobject, int dragonXCoordinaate, int dragonYCoordinaate, char dragonobject, int orcXCoordinaate, int orcYCoordinaate, char orcobject, int mapY, int mapX) {
        if (playerXCoordinaate == mapX && playerYCoordinaate == mapY) {
            System.out.print(playerobject);
        } else if (dragonXCoordinaate == mapX && dragonYCoordinaate == mapY) {
            System.out.print(dragonobject);
        } else if (orcXCoordinaate == mapX && orcYCoordinaate == mapY) {
            System.out.print(orcobject);
        } else {
            System.out.print(" ");
        }
    }


}