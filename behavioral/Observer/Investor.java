public interface StackObserver {
    void update(String stockSymbol,double stockPrice);
}

public class Investor implements  StackObserver{
    private String name;
}
