package Instraments;
import Interfaces.*;

public class Trumpet extends Instrument implements iPlay, iSell {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentFamily family, int buyprice, int sellprice, int numberOfValves){

        super(material, colour, family, buyprice, sellprice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "BRAAAAAAWWWW";
    }

    public int calculateMarkup(){
        return (this.getSellprice() - this.getBuyprice());
    }
}

