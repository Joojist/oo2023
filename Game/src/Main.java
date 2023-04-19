//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.SQLOutput;
import java.util.*;

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
        List<Character> characters = new ArrayList<>(Arrays.asList(player, dragon, orc)) ;

        Item Sword = new Item(world.width, world.height, 10, 1, "M66k");
        Item Hammer = new Item(world.width, world.height, 10, 1, "Haamer");
        Item Boots = new Item(world.width, world.height, 10, 1, "Yeezyd");

        List<Item> items = new ArrayList<>(Arrays.asList(Sword, Hammer, Boots));

        world.printMap(world.width, world.height, player.xCoordinaate, player.yCoordinaate, player.object, dragon.xCoordinaate, dragon.yCoordinaate, dragon.object, orc.xCoordinaate, orc.yCoordinaate, orc.object, items);
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

            world.printMap(world.width, world.height, player.xCoordinaate, player.yCoordinaate, player.object, dragon.xCoordinaate, dragon.yCoordinaate, dragon.object, orc.xCoordinaate, orc.yCoordinaate, orc.object, items);
            System.out.println();
            for (Item i : items) {
                if (i.xCoordinate == player.xCoordinaate && i.yCoordinate == player.yCoordinaate) {
                    player.item = i;
                    System.out.println("Korjasid eseme: " + player.item.name);
                    break;
                }
            }
            input = scanner.nextLine();
        }


    }


}
