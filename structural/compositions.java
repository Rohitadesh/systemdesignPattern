import java.util.*;
interface Component{
    public void showPrice();
}

class Leaf implements Component{
    String name;
    Double price;
    public Leaf(String name,double price){
        this.name=name;
        this.price=price;
    }
    @Override
    public void showPrice(){
        System.out.println(this.price);
    }
}

class Composition implements Component{
    public String name;
    ArrayList<Component> components;
    public Composition(String name){
        this.name=name;
        components = new ArrayList<>();
    }

    @Override
    public void showPrice(){
        for (Component c : components)
        {
            c.showPrice();
        }
    }
    public void add(Component subComponent)
    {
        components.add(subComponent);
    }
}

public class compositions {
    public static void main(String[] args){

    }
}