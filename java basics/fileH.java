import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class fileH {
    
    public static void main(String[] args) {

        // try{
        //     File a = new File("a.txt");
        //     Scanner b = new Scanner(a);
        //     while(b.hasNextLine()){
        //         String data = b.nextLine();
        //         System.out.println(data);
        //     }
        // }
        // catch(Exception e){
            
        // }

        try {
        FileWriter a = new FileWriter("a.txt");
        a.write("written using Java");
        a.close();
        System.out.println("file written sucessfully");
        } catch (Exception e) {
            System.out.println("file not written");
        }

        // File a = new File("C:\\Users\\HP\\Desktop\\m.txt");
        // if(a.exists());
        // // System.out.println("File already avilable");
        // System.out.println("file name is: "+a.getName());
        // System.out.println("File path is: "+a.getPath());
        // System.out.println("File absolute path is: "+a.getAbsolutePath());
        // System.out.println("File parent path is: "+a.getParent());
        // System.out.println("File length is: "+a.length());
        // System.out.println("File can read: "+a.canRead());
        // System.out.println("File can write: "+a.canWrite());
        // System.out.println("File is directory: "+a.isDirectory());
        // System.out.println("File is file: "+a.isFile());
        // System.out.println("File is hidden: "+a.isHidden());
        // System.out.println("File sixe: "+a.length()+"bytes");


        // File a = new File("C:\\Users\\HP\\Desktop\\m.txt");
        // try{
        //     if(a.createNewFile()){
            
        //     System.out.println("File Created");
        // }
        // else{
        //     System.out.println("File already avilable");
        // }
        // }catch(Exception e){
        //     System.out.println("File not created");
        // }
    }
}
