import java.util.*;


private class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("helloworld is singleton");
    }
    private static  Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }

        return  instance;
    }

}




class SingleToneMethods{
    public static void main(String[] args){

    }
}