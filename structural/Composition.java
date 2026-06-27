import java.util.ArrayList;

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

class Compostiton implements Component{
    String name;
    ArrayList<String> comp
}


class Composition {
    public static  void main(String[] args){
        
    }    
}
