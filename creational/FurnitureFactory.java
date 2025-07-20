// Abstract Factory

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    
}

// Abstract Product

public interface Chair {
    void sitOn();
    
}

public interface Table{
    void use();
}

// concrete Products
// concrete implementation of mordern chair
public class ModernChair implements Chair {
    @Override
    public void sitOn(){
        System.out.println("Sitting on a modern chair");
    }

}

public class  ModernTable implements Table {
    @Override
    public void use(){
        System.out.println("Using a modern table ");
    }
    
}

public class VictorianChair implements Chair{
    @Override
    public void sitOn(){
        System.out.println("Sitting on Victorian chair!");
    }



}

public class  VictorianTable implements Table {
    @Override
    public void use(){
        System.out.println("Using a modern table ");
    }
    
}

// concrete Factories
// Factory for creating mordern furniture

public class MordernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(){
        return new ModernChair();
    }
    
    @Override
    public Table createTable(){
        return new ModernTable();
    }
    
}
    
public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}





class AbstractFactory {
    public static void main(String[] args){
        FurnitureFactory modernFactory = new MordernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        modernChair.sitOn();
        modernTable.use();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        // Use the Victorian furniture
        victorianChair.sitOn();
        victorianTable.use();
    
    
    }    
}
