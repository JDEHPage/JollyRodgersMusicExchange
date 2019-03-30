package Instraments;
import Interfaces.*;

public class Calrinet extends Instrument implements iPlay{

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

}
