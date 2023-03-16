public class Main {
    public static void main(String[] args) {
        AlkoPood alkopood = new AlkoPood(new VeiniOsakond("Sauvignon Blanc", 0.75, 65789462), 0.6, 13, 7);
        System.out.println(alkopood.kmVaba(1.2));
    }
}