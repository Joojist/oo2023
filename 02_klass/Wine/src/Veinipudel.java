import java.sql.SQLOutput;

public class Veinipudel {
    private String nimi;
    private String tüüp;
    private double hind;
    private int aasta;

    public Veinipudel(String nimi, String tüüp, double hind, int aasta) {
        this.nimi = nimi;
        this.tüüp = tüüp;
        this.hind = hind;
        this.aasta = aasta;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getTüüp() {
        return tüüp;
    }

    public void setTüüp(String tüüp) {
        this.tüüp = tüüp;
    }

    public double getHind() {
        return hind;
    }

    public void setHind(double hind) {
        this.hind = hind;
    }

    public int getAasta() {
        return aasta;
    }

    public void setAasta(int aasta) {
        this.aasta = aasta;
    }

    public void info() {
        System.out.println("Veinipudel " + this.nimi + " on " + this.tüüp + " tüüpi vein, hind " + this.hind + " eurot ning valmistamisaasta " + this.aasta + ".");
    }

    public double käibemaksugaHind() {
        System.out.println(this.hind * 1.20);
        return 0;
    }

    public String vanus() {
        int vanus = 2023 - this.aasta;
        System.out.println("Veinipudel " + this.nimi + " on " + vanus + " aastat vana.");
        return null;
    }

    public boolean onOdavamKui(Veinipudel võrreldavPudel) {
        if (this.hind < võrreldavPudel.getHind()) {
            System.out.println("On");
            return true;
        } else {
            System.out.println("Ei ole");
            return false;
        }
    }
}
