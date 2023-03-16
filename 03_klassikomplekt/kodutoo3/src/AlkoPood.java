public class AlkoPood {
    VeiniOsakond osakond;
    double km;
    int kogus;
    int id;

    public AlkoPood(VeiniOsakond osakond, double km, int kogus, int id) {
        this.osakond = osakond;
        this.km = km;
        this.kogus = kogus;
        this.id = id;
    }
    public void salvestus(VeiniOsakond osakond) {
        this.osakond = osakond;
    }
    public void kmsuurus(double protsent) {
        this.km = this.km * kmVaba(protsent);
    }
    public double kmVaba(double protsent) {
        return this.km = this.km * protsent;
    }
}
