import java.util.Scanner;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Teie toiduga sobib see vein!");
        Sommeljee red = new Sommeljee("Cabernet Sauvignon", "red", 12, 13.7F);
        String info = red.wineInfo();
        Sommeljee white = new Sommeljee("Chardonnay", "white", 7, 14.7F);
        String info2 = white.wineInfo();


    }
}