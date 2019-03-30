package Shop;
import Interfaces.iSell;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<iSell> stock;

    public Shop(String name){

        this.name = name;
        this.stock = new ArrayList<iSell>();
    }

    public void addToStock(iSell stuff){
        this.stock.add(stuff);
    }

    public void removeFromStock(iSell stuff){
        this.stock.remove(stuff);
    }

    public String getName() {
        return name;
    }

    public ArrayList<iSell> getStock() {
        return stock;
    }

    public int totalPotentialProfit(){
        int total = 0;
        for(iSell stuff : this.stock){
          total += stuff.calculateMarkup();
        }
        return total;
    }
}
