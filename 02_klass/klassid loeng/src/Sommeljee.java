import java.util.Scanner;
public class Sommeljee {
    static Scanner scanner = new Scanner(System.in);
    String wineName;
    String wineType;
    int wineAge;
    float wineAlcoholPercentage;

    public Sommeljee(String wineName, String wineType, int wineAge, float wineAlcoholPercentage) {
        this.wineAge = wineAge;
        this.wineName = wineName;
        this.wineType= wineType;
        this.wineAlcoholPercentage = wineAlcoholPercentage;
    }


    public String wineInfo() {
        System.out.println("Name: " + this.wineName + ", type: " + this.wineType + ", Age: " + this.wineAge + ", Alcohol percentage: " + this.wineAlcoholPercentage);
        System.out.println("Kuidas tundub?");
        String input = scanner.nextLine();
        wineReview(input);
        return "done";
    }
    private void wineReview(String input) {
        if (input.equals("Hea")) {
            wineSummary();
            System.out.println("Tahate osta?");
            input = Sommeljee.scanner.nextLine();
            if (input.equals("Jah")) {
                System.out.println(winePrice() + " eurot");
            } else {
                System.out.println("Väga kahju, kohe toon uue pudeli");
            }
        } else {
        System.out.println("Kohe toon uue pudeli");
    }

    }
    private float winePrice() {
        return (float) ((5.65 * this.wineAge) + (1.67 * this.wineAlcoholPercentage));
    }

    private void wineSummary(){
        if (this.wineType.equals("red")){
            System.out.println("Kui te nuusutate seda veini, siis te tunnete mõnusat tammest šokolaadi lõhna, see vein on juba 10 aastat pudelis istunud, kuid selle lõhn ja maitse on muutunud nii palju elegantsemaks selle ajaga!");
        } else if (this.wineType.equals("white")) {
            System.out.println("Sellel veinil, on kerge ja magus aroom, kui te proovite seda, siis tunnete kuidas see nõrk ja kerge vein muutub lilleliseks teie suus!");
        } else {
            System.out.println("Vabandust kohe tulen tagasi!");
        }

    }
}
