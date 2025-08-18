package composition;



public class Compositions {
     public static  void main(String[] args){
         Component file1=new Leaf("file.txt",100);
         Component file2= new Leaf("file2.txt",200);

         Composite subDirectory = new Composite("Subdirectory");
         Component file3 = new Leaf("file3.txt", 75);
         subDirectory.addComponent(file3);

         // Create root directory
         Composite rootDirectory = new Composite("Root");
         rootDirectory.addComponent(file1);
         rootDirectory.addComponent(file2);
         rootDirectory.addComponent(subDirectory);

         // Display file system information
         rootDirectory.displayInfo();

         // Calculate total size
         int totalSize = rootDirectory.getSize();
         System.out.println("Total size: " + totalSize + " bytes");

     }
}
