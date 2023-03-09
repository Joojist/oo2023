//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int playerXCoordinaate = 3;
        int playerYCoordinaate = 3;
        int dragonXCoordinaate = 6;
        int dragonYCoordinaate = 2;
        int orcXCoordinaate = 5;
        int orcYCoordinaate = 1;

        for(int y = 0; y < 10; ++y) {
            System.out.println();

            for(int x = 0; x < 30; ++x) {
                if (y != 0 && y != 9) {
                    if (x != 0 && x != 29) {
                        if (playerXCoordinaate == x && playerYCoordinaate == y) {
                            System.out.print("P");
                        } else if (dragonXCoordinaate == x && dragonYCoordinaate == y) {
                            System.out.print("D");
                        } else if (orcXCoordinaate == x && orcYCoordinaate == y) {
                            System.out.print("O");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print("|");
                    }
                } else {
                    System.out.print("-");
                }
            }
        }

    }
}
