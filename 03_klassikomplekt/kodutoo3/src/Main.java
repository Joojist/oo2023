

public class Main {
    public static void main(String[] args) {
        VeiniOsakond1 vein = new VeiniOsakond1("Sauvignon Blanc", 0.75, 65789462);
        AlkoPood alkopood = new AlkoPood(vein, 17F, 13, 7);

        vein.suurusemuutmine(0.25);

        System.out.println(alkopood.salvestus());
    }
}