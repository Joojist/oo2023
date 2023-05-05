public class Vein {
    private String nimi;
    private String piirkond;
    private double hind;
    private double alkoholiprotsent;

    public Vein(String nimi, String piirkond, double hind, double alkoholiprotsent) {
        this.nimi = nimi;
        this.piirkond = piirkond;
        this.hind = hind;
        this.alkoholiprotsent = alkoholiprotsent;
    }

    public String getNimi() {
        return nimi;
    }

    public String getPiirkond() {
        return piirkond;
    }

    public double getHind() {
        return hind;
    }

    public double getAlkoholiprotsent() {
        return alkoholiprotsent;
    }

    public String toString() {
        return nimi + " " + piirkond + ", " + alkoholiprotsent + "%, " + hind + " eurot";
    }

    public void serveeri(String temperatuur) {
        System.out.println("Serveeri " + nimi + " " + piirkond + " " + temperatuur + " temperatuuril.");
    }

    public boolean sobibToitu(String toit) {
        if (piirkond.equals("Prantsusmaa") && (toit.equals("veis") || toit.equals("lammas"))) {
            return true;
        } else if (piirkond.equals("Itaalia") && (toit.equals("pasta") || toit.equals("liha"))) {
            return true;
        } else {
            return false;
        }
    }

    public double arvutaPromillid(double kogus) {
        return (alkoholiprotsent / 100) * (kogus * 0.8);
    }
}