//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int worldWidth = 10;
        int worldHeigth = 5;

        player player = new player(worldWidth, worldHeigth);
        int dragonXCoordinaate = (int) getRandomCoordinate(worldWidth);
        int dragonYCoordinaate = (int) getRandomCoordinate(worldHeigth);
        char dragonobject = 'D';
        int orcXCoordinaate = (int) getRandomCoordinate(worldWidth);
        int orcYCoordinaate = (int) getRandomCoordinate(worldHeigth);
        char orcobject = 'O';

        while(!input.equals("end")){
            player.move(input);

            //if (input.equals("w") ) {
                //playerYCoordinaate = playerYCoordinaate - 1;
            //} else if (input.equals("s") ) {
                //playerYCoordinaate = playerYCoordinaate + 1;
            //} else if (input.equals("a") ) {
                //playerXCoordinaate = playerXCoordinaate - 1;
            //} else if (input.equals("d") ) {
                //playerXCoordinaate = playerXCoordinaate + 1;
            //}

            printMap(worldWidth, worldHeigth, player.xCoordinaate, player.yCoordinaate, player.object, dragonXCoordinaate, dragonYCoordinaate, dragonobject, orcXCoordinaate, orcYCoordinaate, orcobject);
            System.out.println();
            input = scanner.nextLine();
        }


    }

    private static void printMap(int worldWidth, int worldHeigth, int playerXCoordinaate, int playerYCoordinaate, char playerobject, int dragonXCoordinaate, int dragonYCoordinaate, char dragonobject, int orcXCoordinaate, int orcYCoordinaate, char orcobject) {
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
