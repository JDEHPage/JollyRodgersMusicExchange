package Instraments;
import Interfaces.*;

public class Piano extends Instrument implements iPlay{

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentFamily family, int buyprice, int sellprice, int numberOfKeys){

        super(material, colour, family, buyprice, sellprice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "DING DING DING";
    }

}
