interface DrawingApi {
    void drawCircle(int x,int y,int radius);
}

class DrawingApi1 implements DrawingApi{
    @Override
    public void drawCircle(int x,int y,int radius){
        System.out.printf("drawingApi with %d %d result:%d",x,y,radius);
    }
}

abstract class Shape{
    protected DrawingApi drawingApi; 
    public Shape(DrawingApi drawingApi){
        this.drawingApi=drawingApi;
    }
    abstract public void draw();

}

class Circle extends Shape {
    protected int x,y,radius;
    public Circle(int x,int y,int radius,DrawingApi drawingApi){
        super(drawingApi);
         this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw(){
        drawingApi.drawCircle(x, y, radius);
    }

    
}
public class Bridge {

    public static void main(String[] args) {
        DrawingApi drawingApi1= new DrawingApi1();

        Shape circle = new Circle(3,4,5,drawingApi1);
        circle.draw();
    }
}