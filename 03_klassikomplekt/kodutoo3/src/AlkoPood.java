import java.util.Date;
import java.util.Scanner;


public class AlkoPood {
    VeiniOsakond1 osakond;
    float hind;
    int kogus;
    int id;
    Date ostuhetk;

    static Scanner objekt = new Scanner(System.in);
    public AlkoPood(VeiniOsakond1 osakond, float hind, int kogus, int id) {
        this.osakond = osakond;
        this.hind = hind;
        this.kogus = kogus;
        this.id = id;
        this.ostuhetk = new Date();
    }
    public void salvestaosakond(VeiniOsakond1 osakond) {
        this.osakond = osakond;
    }
    public Date salvestus() {
        System.out.println("mitu pudelit tahate osta?");
        int kogus1 = Integer.parseInt(objekt.nextLine());
        int lopphind = (int) (ost(kogus1) + (kogus1*(kmsuurus())));
        System.out.println("Teie l]pphind on " + lopphind + " eurot");
        return this.ostuhetk;
    }
    private float kmsuurus() {
        return (float) (0.4F * this.hind);
    }
    public double ost(int kogus1) {
        return (int) (kogus1 * this.hind);

    }
}
