package Instraments;
import Interfaces.iSell;

public abstract class Instrument implements iSell{

    private String material;
    private String colour;
    private InstrumentFamily family;
    private int buyprice;
    private int sellprice;

    public Instrument(String material, String colour, InstrumentFamily family, int buyprice, int sellprice){

        this.material = material;
        this.colour = colour;
        this.family = family;
        this.buyprice = buyprice;
        this.sellprice = sellprice;

    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public int getBuyprice() {
        return buyprice;
    }

    public int getSellprice() {
        return sellprice;
    }

    public void setBuyprice(int buyprice) {
        this.buyprice = buyprice;
    }

    public void setSellprice(int sellprice) {
        this.sellprice = sellprice;
    }

    public int calculateMarkup(){
        return (this.getSellprice() - this.getBuyprice());
    }
}
