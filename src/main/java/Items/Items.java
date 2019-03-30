package Items;
import Interfaces.iSell;

public class Items implements iSell {

    private String description;
    private int buy;
    private int sell;

    public Items(String description, int buy, int sell){
        this.description = description;
        this.buy = buy;
        this.sell = sell;
    }

    public String getDescription() {
        return description;
    }


    public int getBuy() {
        return buy;
    }


    public int getSell() {
        return sell;
    }


    public int calculateMarkup(){
        return (this.sell - this.buy);
    }
}
