import Instraments.InstrumentFamily;
import Instraments.Piano;
import Items.Items;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    public Shop shop;
    public Piano piano;
    public Items sheetMusic;

    @Before
    public void setUp(){
       this.shop = new Shop("Jolly Rodger's");
        this.piano = new Piano("wood","brown", InstrumentFamily.PERCUSSION,100,200,20);
        this.sheetMusic = new Items("Sheet Music", 10, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Jolly Rodger's",shop.getName());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(piano);
        shop.addToStock(sheetMusic);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(piano);
        shop.addToStock(sheetMusic);
        assertEquals(2, shop.getStock().size());
        shop.removeFromStock(piano);
        assertEquals(1,shop.getStock().size());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.addToStock(piano);
        shop.addToStock(sheetMusic);
        assertEquals(110, shop.totalPotentialProfit());
    }
}
