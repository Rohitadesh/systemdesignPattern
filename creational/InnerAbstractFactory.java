interface CarFactory{
    Car createCar();
    CarSpecification createSpecification();
}

class NorthAmericaCarFactory implements CarFactory{
    public Car createCar(){
        return new Sedan();
    }
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}
interface Car{
    void assemble();
}

interface CarSpecification{
    void display();
    
}
class NorthAmericaSpecification implements CarSpecification{
    
}

class AbstractFactory {
    public static void main(String[] args){

    }    
}
