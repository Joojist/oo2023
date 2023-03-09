public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        printforfunction(5);
        printforfunction(10);


        String hinnang = temperaturereview(-2.5);
        String hinnang2 = temperaturereview(5.7);
        System.out.println(hinnang);
        System.out.println(hinnang2);

        double summa = arvutaTaksoMaksumus(3.5);
        System.out.println(summa);
        double summa2 = arvutaTaksoMaksumus(5);
        System.out.println(summa2);

    }

    private static double arvutaTaksoMaksumus(double tunnid) {
        return 3+0.8*tunnid;
    }

    private static String temperaturereview(double temp) {
        if (temp < 0) {
            return "On jääs";
        } else {
            return "on vesi";
        }
    }


    private static void printforfunction(int kordadeArv) {
        for (int i = 0; i < kordadeArv; i++) {
            System.out.print(i);

        }
    }
}