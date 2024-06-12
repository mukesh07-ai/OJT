import java.io.File;
import java.util.Scanner;

public class read {
     public static void main(String[] args) {

        try{
            File a = new File("a.txt");
            // -a.delete();
            Scanner b = new Scanner(a);
            while(b.hasNextLine()){
                String data = b.nextLine();
                System.out.println(data);
            }
        }
        catch(Exception e){
            
        }

    }   
}
