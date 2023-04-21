import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class WineStoreTest {

    @Test
    public void testWineStore() {
        WineStore store = new WineStore();

        RedWine redWine1 = new RedWine("Chateau Margaux", 2001, 500.0, "Cabernet Sauvignon");
        RedWine redWine2 = new RedWine("Opus One", 2006, 400.0, "Cabernet Franc");
        WhiteWine whiteWine1 = new WhiteWine("Chardonnay", 2018, 50.0, "Chardonnay");
        WhiteWine whiteWine2 = new WhiteWine("Sauvignon Blanc", 2020, 40.0, "Sauvignon Blanc");


        store.addWine(redWine1);
        store.addWine(redWine2);
        store.addWine(whiteWine1);
        store.addWine(whiteWine2);

        ArrayList<Wine> wines = store.getWines();
        assertEquals(4, wines.size());
        assertEquals("Chateau Margaux", wines.get(0).getName());
        assertEquals("Opus One", wines.get(1).getName());
        assertEquals("Chardonnay", wines.get(2).getName());
        assertEquals("Sauvignon Blanc", wines.get(3).getName());

        store.sellWine(redWine2);
        wines = store.getWines();
        assertEquals(3, wines.size());
        assertEquals("Chateau Margaux", wines.get(0).getName());
        assertEquals("Chardonnay", wines.get(1).getName());
        assertEquals("Sauvignon Blanc", wines.get(2).getName());
    }
}