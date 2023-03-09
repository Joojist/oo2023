//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        int worldWidth = 10;
        int worldHeigth = 5;
        int playerXCoordinaate = (int) getRandomCoordinate(worldWidth);
        //int playerXCoordinaate = 3;
        int playerYCoordinaate = (int) getRandomCoordinate(worldHeigth);
        char playerobject = 'P';
        int dragonXCoordinaate = (int) getRandomCoordinate(worldWidth);
        int dragonYCoordinaate = (int) getRandomCoordinate(worldHeigth);
        char dragonobject = 'D';
        int orcXCoordinaate = (int) getRandomCoordinate(worldWidth);
        int orcYCoordinaate = (int) getRandomCoordinate(worldHeigth);
        char orcobject = 'O';

        for(int y = 0; y < worldHeigth; ++y) {
            System.out.println();
            for(int x = 0; x < worldWidth; ++x) {
                if (y == 0 || y == worldHeigth-1) {
                    System.out.print("-");
                }else if (x == 0 || x == worldWidth-1) {
                    System.out.print("|");
                } else {
                    //parem kl]ps -> refactor -> extract
                    printcharacters(playerXCoordinaate, playerYCoordinaate, playerobject, dragonXCoordinaate, dragonYCoordinaate, dragonobject, orcXCoordinaate, orcYCoordinaate, orcobject, y, x);
                }
            }
        }
    }

    private static double getRandomCoordinate(int worldDimension) {
        return Math.random() * (worldDimension - 2) + 1;
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
