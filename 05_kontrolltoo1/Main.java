import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

        String sisseFail = "kiirused.txt"; // sisendfaili nimi
        String valjaFail = "keskmine_kiirus.txt"; // väljundfaili nimi

        try {
            // Avame sisendfaili
            BufferedReader lugeja = new BufferedReader(new FileReader(sisseFail));

            // Loeme kiirused massiivi
            String rida;
            double[] kiirusedFailis = new double[0];
            while ((rida = lugeja.readLine()) != null) {
                kiirusedFailis = lisamine(kiirused, Double.parseDouble(rida));
            }

            // Arvutame kogu tee keskmise kiiruse
            double[] keskmineKiirusFailist = arvutaKeskmineKiirusFailist(kiirusedFailis);

            // Salvestame kogu tee keskmise kiiruse väljundfaili
            FileWriter kirjutaja = new FileWriter(valjaFail);
            kirjutaja.write("Kogu tee keskmine kiirus: " + keskmineKiirusFailist + " km/h\n");
            kirjutaja.close();

            // Sulgeme lugeja
            lugeja.close();

            System.out.println("Kogu tee keskmine kiirus on salvestatud faili " + valjaFail);
        } catch (IOException e) {
            System.out.println("Viga failide töötlemisel: " + e.getMessage());
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
    public static double[] arvutaKeskmineKiirusFailist(double[] kiirusedFailist) {
        double summa = 0.0;
        for (int i = 0; i < kiirusedFailist.length; i++) {
            summa += kiirusedFailist[i];
        }
        return new double[]{summa / kiirusedFailist.length};

    public static double[] lisamine(double[] massiiv, double element) {
        double[] uusMassiiv = new double[massiiv.length + 1];
        for (int i = 0; i < massiiv.length; i++) {
            uusMassiiv[i] = massiiv[i];
        }
        uusMassiiv[massiiv.length] = element;
        return uusMassiiv;
    }
}