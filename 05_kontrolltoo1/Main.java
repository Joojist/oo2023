import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kiirus1 = 60.0; // esimene kiirus 60 km/h
        double kiirus2 = 50.0; // teine kiirus 50 km/h
        double kaugus  = 2.0;
        double keskmineKiirus = arvutaKeskmineKiirus(kiirus1, kiirus2, kaugus);
        System.out.println("Kahe kilomeetri keskmine kiirus on: " + keskmineKiirus + " km/h");

        double[] kiirused = {60.0, 50.0, 70.0, 65.0}; // antud kiiruste massiiv
        double keskmineKiiruslistist = arvutaKeskmineKiirusListist(kiirused);
        System.out.println("Kogu tee läbimise keskmine kiirus on: " + keskmineKiiruslistist + " km/h");

        File fail = new File("kiirused.txt");
        try {
            Scanner scanner = new Scanner(fail);
            double summa = 0;
            int loendur = 0;
            while (scanner.hasNextLine()) {
                String rida = scanner.nextLine();
                double kiirus = Double.parseDouble(rida);
                summa += kiirus;
                loendur++;
            }
            scanner.close();
            double keskmineKiirusFailis = summa / loendur;
            System.out.println("Kogu teekonna keskmine kiirus: " + keskmineKiirusFailis);
            salvestaKeskmineKiirusFaili(keskmineKiirusFailis);
        }
        catch (FileNotFoundException e) {
            System.out.println("Faili ei leitud!");
            e.printStackTrace();
        }
    }


    public static double arvutaKeskmineKiirus(double kiirus1, double kiirus2, double kaugus) {
        return (kiirus1 + kiirus2) / kaugus;
    }
    public static double arvutaKeskmineKiirusListist(double[] kiirused) {
        double summa = 0.0;
        for (int i = 0; i < kiirused.length; i++) {
            summa += kiirused[i];
        }
        return summa / kiirused.length;
    }
    public static void salvestaKeskmineKiirusFaili(double keskmineKiirusFailis) {
        File fail = new File("keskmine_kiirus.txt");
        try {
            PrintWriter writer = new PrintWriter(fail);
            writer.println(keskmineKiirusFailis);
            writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Viga faili kirjutamisel!");
            e.printStackTrace();
        }
    }
}