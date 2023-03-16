public class VeiniOsakond1 {
    AlkoPood osakond;
    String nimetus;
    double pudelisuurus;
    int triipkood;

    public VeiniOsakond1(String nimetus, double suurus, int triipkood){
        this.nimetus = nimetus;
        this.pudelisuurus = suurus;
        this.triipkood = triipkood;
    }
    public void suurusemuutmine(double lisasuurus){
        this.pudelisuurus = this.pudelisuurus + lisasuurus;
    }
}
