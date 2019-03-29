package Instraments;
import Interfaces.*;

public class Calrinet extends Instrument implements iPlay, iSell {

    private String mouthpiece;

    public Calrinet(String material, String colour, InstrumentFamily family, int buyprice, int sellprice, String mouthpiece){

        super(material, colour, family, buyprice, sellprice);
        this.mouthpiece = mouthpiece;
    }

    public String getMouthpiece() {
        return mouthpiece;
    }

    public String play(){
        return "TWEE TWEE TWEE";
    }

    public int calculateMarkup(){
        return (this.getSellprice() - this.getBuyprice());
    }
}
