package Instraments;
import Interfaces.*;

public class Violin extends Instrument implements iPlay{

    private int numberOfStrings;
    private String bowTipPlateMaterial;

    public Violin(String material, String colour, InstrumentFamily family, int buyprice, int sellprice, int numberOfStrings, String bowTipPlateMaterial){

        super(material, colour, family, buyprice, sellprice);
        this.numberOfStrings = numberOfStrings;
        this.bowTipPlateMaterial = bowTipPlateMaterial;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getBowTipPlateMaterial() {
        return bowTipPlateMaterial;
    }

    public String play(){
        return "SQUEEE SQUEEE";
    }

}
