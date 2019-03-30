package Instraments;
import Interfaces.*;

public class ElectricGuitar extends Instrument implements iPlay{

    private int numberOfStrings;

    public ElectricGuitar(String material, String colour, InstrumentFamily family, int buyprice, int sellprice, int numberOfStrings){

        super(material, colour, family, buyprice, sellprice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "BRANN BRANN";
    }

}
