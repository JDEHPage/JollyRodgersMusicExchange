import Instraments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstramentTest {

    public Piano piano;
    public Violin violin;
    public ElectricGuitar electricGuitar;
    public Calrinet calrinet;
    public Trumpet trumpet;




    @Before
    public void setup(){
        this.piano = new Piano("wood","brown", InstrumentFamily.PERCUSSION,100,200,20);
        this.violin = new Violin("wood", "brown", InstrumentFamily.STRINGS, 80, 150,4, "mammoth ivory");
        this.electricGuitar = new ElectricGuitar("wood & metal", "red",InstrumentFamily.STRINGS,50,70,6);
        this.calrinet = new Calrinet("metal","black",InstrumentFamily.WIND,80,120,"ivory");
        this.trumpet = new Trumpet("metal","brass", InstrumentFamily.BRASS,95, 130,4);
    }



    @Test
    public void hasFamily() {
        assertEquals(InstrumentFamily.PERCUSSION, piano.getFamily());
        assertEquals(InstrumentFamily.STRINGS, violin.getFamily());
        assertEquals(InstrumentFamily.STRINGS, electricGuitar.getFamily());
        assertEquals(InstrumentFamily.WIND, calrinet.getFamily());
        assertEquals(InstrumentFamily.BRASS, trumpet.getFamily());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
        assertEquals("wood", violin.getMaterial());
        assertEquals("wood & metal", electricGuitar.getMaterial());
        assertEquals("metal", calrinet.getMaterial());
        assertEquals("metal", trumpet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("brown", piano.getColour());
        assertEquals("brown", violin.getColour());
        assertEquals("red", electricGuitar.getColour());
        assertEquals("black", calrinet.getColour());
        assertEquals("brass", trumpet.getColour());
    }

    @Test
    public void hasBuyprice() {
        assertEquals(100, piano.getBuyprice());
        assertEquals(80, violin.getBuyprice());
        assertEquals(50, electricGuitar.getBuyprice());
        assertEquals(80, calrinet.getBuyprice());
        assertEquals(95, trumpet.getBuyprice());
    }

    @Test
    public void hasSellprice() {
        assertEquals(200, piano.getSellprice());
        assertEquals(150, violin.getSellprice());
        assertEquals(70, electricGuitar.getSellprice());
        assertEquals(120, calrinet.getSellprice());
        assertEquals(130, trumpet.getSellprice());
    }

    @Test
    public void canSetBuyprice() {
        piano.setBuyprice(101);
        assertEquals(101, piano.getBuyprice());
        violin.setBuyprice(81);
        assertEquals(81, violin.getBuyprice());
        electricGuitar.setBuyprice(51);
        assertEquals(51, electricGuitar.getBuyprice());
        calrinet.setBuyprice(81);
        assertEquals(81, calrinet.getBuyprice());
        trumpet.setBuyprice(100);
        assertEquals(100, trumpet.getBuyprice());
    }

    @Test
    public void canSetSellprice() {
        piano.setSellprice(202);
        assertEquals(202, piano.getSellprice());
        violin.setSellprice(152);
        assertEquals(152, violin.getSellprice());
        electricGuitar.setSellprice(72);
        assertEquals(72, electricGuitar.getSellprice());
        calrinet.setSellprice(122);
        assertEquals(122, calrinet.getSellprice());
        trumpet.setSellprice(133);
        assertEquals(133, trumpet.getSellprice());
    }

    @Test
    public void hasUniqueAttribute () {
        assertEquals(20,piano.getNumberOfKeys());
        assertEquals(4, violin.getNumberOfStrings());
        assertEquals("mammoth ivory", violin.getBowTipPlateMaterial());
        assertEquals(6,electricGuitar.getNumberOfStrings());
        assertEquals("ivory", calrinet.getMouthpiece());
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("DING DING DING",piano.play());
        assertEquals("SQUEEE SQUEEE", violin.play());
        assertEquals("BRANN BRANN",electricGuitar.play());
        assertEquals("TWEE TWEE TWEE", calrinet.play());
        assertEquals("BRAAAAAAWWWW", trumpet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(100,piano.calculateMarkup());
        assertEquals(70, violin.calculateMarkup());
        assertEquals(20,electricGuitar.calculateMarkup());
        assertEquals(40, calrinet.calculateMarkup());
        assertEquals(35, trumpet.calculateMarkup());
    }

}
