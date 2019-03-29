import Items.Items;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    public Items sheetMusic;
    public Items guitarStrings;

    @Before
    public void setUp(){
       this.sheetMusic = new Items("Sheet Music", 10, 20);
       this.guitarStrings = new Items("Guitar Strings",2,20);
    }

    @Test
    public void hasDescription() {
        assertEquals("Sheet Music", sheetMusic.getDescription());
        assertEquals("Guitar Strings", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10, sheetMusic.getBuy());
        assertEquals(2, guitarStrings.getBuy());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(20, sheetMusic.getSell());
        assertEquals(20, guitarStrings.getSell());
    }
}
