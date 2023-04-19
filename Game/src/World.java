import java.util.List;

public class World {

    int width;
    int height;

    public World(int width, int height){
        this.height = height;
        this.width = width;

    }
    char symbol; //luuakse uus muutuja
    public void printMap(int worldWidth, int worldHeigth, int playerXCoordinaate, int playerYCoordinaate, char playerobject, int dragonXCoordinaate, int dragonYCoordinaate, char dragonobject, int orcXCoordinaate, int orcYCoordinaate, char orcobject, List<Item> items) {
        for(int y = 0; y < worldHeigth; y++) {
            System.out.println();
            for(int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeigth -1) {
                    //System.out.print("-");
                    symbol = '-';
                }else if (x == 0 || x == worldWidth -1) {
                    //System.out.print("|");
                    symbol = '|';
                } else {
                    //parem kl]ps -> refactor -> extract

                    if (playerXCoordinaate == x && playerYCoordinaate == y) {
            //            System.out.print(playerobject);
                        symbol = playerobject;
                    } else if (dragonXCoordinaate == x && dragonYCoordinaate == y) {
            //            System.out.print(dragonobject);
                        symbol = dragonobject;
                    } else if (orcXCoordinaate == x && orcYCoordinaate == y) {
            //            System.out.print(orcobject);
                        symbol = orcobject;
                    }

//                    for (Character c: characters) {
//                        if (c.xCoordinaate == x && c.yCoordinaate == y) {
//                            symbol = c.object;
//                        }
//                    }
                }
                System.out.print(symbol);
                symbol = ' ';
            }
        }
    }


}