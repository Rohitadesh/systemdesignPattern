interface Sheep{
    Sheep clone();
    String getName();
    void setName(String name);
}

class BlackSheep implements Sheep{
    private String name;
    public BlackSheep(String name){
        this.name=name;
    }

    public Sheep clone(){
        return  new BlackSheep(this.name);
    }
   
    public String getName(){
        return name;
    }
   
    public void setName(String name){
        this.name= name;
    }
}


class WhiteSheep implements Sheep{
    private String name;
    public WhiteSheep(String name){
        this.name=name;
    }

    public Sheep clone(){
        return new WhiteSheep(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

}




class prototype{
    public static void main(String[] args){
        // create prototype sheep
        Sheep blackPrototype = new BlackSheep("roy black sheep");
        Sheep whitePrototype = new WhiteSheep("James White Sheep");

        // clone sheep as needed
        Sheep clonedBlackSheep = blackPrototype.clone();
        Sheep clonedWhiteSheep = whitePrototype.clone();

        System.out.println("Black sheep: " + clonedBlackSheep.getName());
        System.out.println("White sheep: " + clonedWhiteSheep.getName());
        
        clonedBlackSheep.setName("Midnight");
        clonedWhiteSheep.setName("Snowball");

        System.out.println("Black sheep: " + clonedBlackSheep.getName());
        System.out.println("White sheep: " + clonedWhiteSheep.getName());


    }
}