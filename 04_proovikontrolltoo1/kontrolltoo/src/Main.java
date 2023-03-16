import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(arithmethicMid(1.54F, 6.32F, 92.43F));
        double[] medians = {3,4,5,6,7,8,8,8,8};
        System.out.println("Medians " + Arrays.toString(slidingMid(medians)));

        Libisevkeskmine libisev = new Libisevkeskmine(2,3,4);
        libisev.lisaArv(4);
        System.out.println(libisev.arvudKeskmisega);
        libisev.lisaArv(5);
        libisev.lisaArv(5);
        System.out.println(libisev.arvudKeskmisega);
    }


    private static float arithmethicMid(float number1, float number2, float number3){
        return (number1 + number2 + number3) / 3;
    }

    private static double[] slidingMid(double[] entry){
        int length = entry.length;
        if (length < 3) {
            return new double[0];
        }
        double[] output = new double[length - 2];
        for(int i = 0; i < length - 2; i++) {
            output[i] = (entry[i] + entry[i+1]+entry[i+2]) / 3.0;
        }
        return output;
    }
}