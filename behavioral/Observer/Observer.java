interface StockObserver {
    void update(String stockSymbol,double stockPrice);
}

 class Investor implements StockObserver{
    private String name;
    public Investor(String name){
        this.name=name;
    }
    @Override
     public void update(String stockSymbol,double stockPrice){
        System.out.println(name+"received updated for"+stockSymbol);
    }
}

public interface  StockMarket{
    void registerObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers(String stockSymbol, double stockPrice);
}


public class Stoc








public class Observer{
    public static void main(String[] args){

    }
}