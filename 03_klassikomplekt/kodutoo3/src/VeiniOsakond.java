public class VeiniOsakond {
    AlkoPood Pood;
    String nimetus;
    double pudelisuurus;
    int triipkood;

    public VeiniOsakond(String nimetus, double suurus, int triipkood){
        this.nimetus = nimetus;
        this.pudelisuurus = suurus;
        this.triipkood = triipkood;
    }
    public int idmuudetus(int muudaid){
        return this.Pood.id = muudaid;
    }
    public double suurusekysimine(){
        return pudelisuurus;
    }
}
