

public class Main {
    public static void main(String[] args) {

        Veinipudel veinipudel = new Veinipudel("Chateau Margaux", "punane", 100.00, 2015);


        veinipudel.info();


        double hindKäibemaksuga = veinipudel.käibemaksugaHind();


        String vanus = veinipudel.vanus();


        Veinipudel veinipudel2 = new Veinipudel("Sancerre", "valge", 25.00, 2020);


        boolean odavam = veinipudel.onOdavamKui(veinipudel2);

        Vein vein1 = new Vein("Chateau Margaux", "Prantsusmaa", 150.0, 13.5);


        System.out.println(vein1.toString());

        vein1.serveeri("16");

        boolean sobib = vein1.sobibToitu("veis");
        if (sobib) {
            System.out.println("This wine pairs well with beef.");
        } else {
            System.out.println("This wine does not pair well with beef.");
        }

        double promillid = vein1.arvutaPromillid(0.5);
        System.out.println("This amount of wine contains " + promillid + " promilles of alcohol.");
    }
}