// create component interface
interface Pizza{
    String getDescription();
    double getCost();

}

// implement the concrete component
class PlainPizza implements Pizza{
    @Override
    public String getDescription(){
        return "Plain Pizza";
    }
    public double getCost(){
        return 5.0;
    }
}

// Develop the decorator
abstract class PizzaDecorator implements Pizza{
    protected  Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratedPizza=pizza;
    }

}

// concreate Decorator
class ChesseDecorator extends  PizzaDecorator{
    public ChesseDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + ", chesse";
    }
    @Override
    public double getCost(){
        return decoratedPizza.getCost()+1.5;
    }
}

class PannerPizza extends  PizzaDecorator{
    public PannerPizza(Pizza pizza){
        super(pizza);
    }
    
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+",Panner Pizza";
    }
    @Override
    public double getCost(){
        return decoratedPizza.getCost()+2.0;
    }
}

class Decorator{
    public static void main(String[] args){
        Pizza pizza= new PlainPizza();
        pizza=new ChesseDecorator(pizza);
        pizza= new PannerPizza(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());
    }
}