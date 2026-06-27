import java.util.*;
interface FileOperationSystem{
    void showDetails();
}

class File implements FileOperationSystem{
    public String name;
    public int size;
    public File(int size, String name){
        this.name=name;
        this.size=size;
    }

    @Override
    public void showDetails(){
        System.out.println("File name:"+name+"File Size:"+size+"KB");
    }


}

class Folder implements FileOperationSystem{
    public String name;
    public List<FileOperationSystem> components;
    public Folder(String name){
        this.name=name;
        components= new ArrayList<>();
    }

    public void add(FileOperationSystem fileOperationSystem){
        components.add(fileOperationSystem);
    }
    
    public void remove(FileOperationSystem fileOperationSystem){
        components.remove(fileOperationSystem);
    }

    @Override
    public void showDetails(){
        System.out.println("Directory"+name);
        for(FileOperationSystem file :components){

            file.showDetails();
        }
    }
}



public class SecondComposition {
    public static void main(String[] main){
        FileOperationSystem audioFile = new File(300,"audio.mp4");
        FileOperationSystem videoFile = new File(400,"video.MP4");
        FileOperationSystem resumeFile = new File(500,"Resume.txt");
        Folder subFolder1 = new Folder("Downloads");
        Folder subFolder2 = new Folder("Documents");

        subFolder1.add(audioFile);
        subFolder2.add(videoFile);

        Folder rootFolder = new Folder("Root Folder");
        rootFolder.add(resumeFile);
        rootFolder.add(subFolder1);
        rootFolder.add(subFolder2);
        rootFolder.showDetails();
    }
}
