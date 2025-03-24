interface wheel{
    float getDiameter();
    float getWidth();
}


class CarWheel implements wheel{
    protected float diameter;
    protected float width;

    public CarWheel(float diameter,float width){
        this.diameter=diameter;
        this.width=width;

    }
    public float getWidth(){
        return width;
    }
    public float getDiameter(){
        return diameter;
    }
}

class WheelFactory{
    public static wheel makeWheel(float diameter,float width){
        return new CarWheel(diameter,width);
    }
}


class  FactoryMethod{
    public static void main (String[] args){
        wheel carWheel = WheelFactory.makeWheel(15, 215);
        System.out.println(carWheel.getDiameter());
        System.out.println(carWheel.getWidth());
    }
}