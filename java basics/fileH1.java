import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class fileH1 {

    public static void main(String[] args) {

        try{
        Path filePath = Paths.get("./mukesh/nashit.txt");
        Files.write(filePath, "...Nashit...Mukesh...Shrey \n Hellow".getBytes(),
        StandardOpenOption.APPEND);
        System.out.println("append");
    }
    catch(Exception e){
        System.out.println("error");
    }
        

        //  try {
        // FileWriter a = new FileWriter("./mukesh/nashit.txt");
        // a.write("written using Java.\nNashit humam Mukesh Vishwas");
        // a.close();
        // System.out.println("file written sucessfully");
        // } catch (Exception e) {
        //     System.out.println("file not written");
        // }

        // File a = new File("./mukesh");
        // a.mkdir();

        // File a = new File("./mukesh/nashit/shrey");
        // a.mkdirs();
        // System.out.println("file created");

        // File a = new File("./mukesh/nashit.txt");
        // try{
        //         if(a.createNewFile()){
                
        //         System.out.println("File Created");
        //     }
        //     else{
        //         System.out.println("File already avilable");
        //     }
        //     }catch(Exception e){
        //         System.out.println("File not created");
        //     }
    }
    
}
