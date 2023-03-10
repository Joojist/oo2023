//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//        Random rand = new Random();
//        Math.random();

        Scanner scanner = new Scanner(System.in);


        World world = new World(10, 5);

        player player = new player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        world.printMap(world.width, world.height, player.xCoordinaate, player.yCoordinaate, player.object, dragon.XCoordinaate, dragon.YCoordinaate, dragon.object, orc.XCoordinaate, orc.YCoordinaate, orc.object);
        String input = scanner.nextLine();

        while(!input.equals("end")){
            player.move(input, world);

            //if (input.equals("w") ) {
                //playerYCoordinaate = playerYCoordinaate - 1;
            //} else if (input.equals("s") ) {
                //playerYCoordinaate = playerYCoordinaate + 1;
            //} else if (input.equals("a") ) {
                //playerXCoordinaate = playerXCoordinaate - 1;
            //} else if (input.equals("d") ) {
                //playerXCoordinaate = playerXCoordinaate + 1;
            //}

            world.printMap(world.width, world.height, player.xCoordinaate, player.yCoordinaate, player.object, dragon.XCoordinaate, dragon.YCoordinaate, dragon.object, orc.XCoordinaate, orc.YCoordinaate, orc.object);
            System.out.println();
            input = scanner.nextLine();
        }


    }


}
