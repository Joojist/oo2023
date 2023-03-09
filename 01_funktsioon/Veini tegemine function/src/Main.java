public class Main {
    public static void main(String[] args) {


        Double viinamarjadekogus = veiniPudelid(3);
        Double viinamarjadekogus2 = veiniPudelid(5);
        System.out.println("Nendes pudelites on kokku "+ viinamarjadekogus + " viinamarja marja");
        System.out.println("Nendes pudelites on kokku "+ viinamarjadekogus2 + " viinamarja marja");

        Double alkoholikogus = suhkrukogusveinis(300);
        Double alkoholikogus2 = suhkrukogusveinis(700);

        System.out.println("Selles veinis on " + alkoholikogus + " grammi alkoholi");
        System.out.println("Selles veinis on " + alkoholikogus2 + " grammi alkoholi");

        String kasOnVein = veinialkoholiprotsent(17.3);
        String kasOnVein2 = veinialkoholiprotsent(13.5);
        String kasOnVein3 = veinialkoholiprotsent(7.8);
        System.out.println(kasOnVein);
        System.out.println(kasOnVein2);
        System.out.println(kasOnVein3);

        veinipudelitekogusfor((float) 50.72);
        veinipudelitekogusfor((float) 500.7);



    }

    private static float veinipudelitekogusfor(float liitrit) {
        int pudelid = 0;
        while (liitrit >= 0.75){
            liitrit = (float) (liitrit - 0.75);
            pudelid++;

        }
        System.out.println(pudelid);
        return liitrit;
    }

    private static String veinialkoholiprotsent(double protsent) {
        if (protsent > 5 && protsent < 16){
            return "Vein";
        }   else {
            return "Muu alkohoolne jook";
        }
    }

    private static Double suhkrukogusveinis(double grammid) {
        return (0.51111111 * grammid);
    }

    private static Double veiniPudelid(double pudelitekogus) {
        return (100 * 7)*pudelitekogus;
    }
}