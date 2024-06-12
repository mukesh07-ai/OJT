import java.io.File;

public class dirH {

    public static void main(String[] args) {
        File a = new File("./dirH");
        if(!a.exists()){
            a.mkdir();
            System.out.println("directory created");
        }
        else{
            System.out.println("directory already exists");
            
            // System.out.println(a.getAbsolutePath());
            // System.out.println(a.getPath());
            // System.out.println(a.getParent());
            // System.out.println(a.getName());
            // System.out.println(a.list());
            // System.out.println(a.exists());
            // System.out.println(a.canRead());
            // System.out.println(a.canWrite());
            // System.out.println(a.isHidden());
            // System.out.println(a.lastModified());
            // System.out.println(a.length());
            // System.out.println(a.isFile());
            // System.out.println(a.isDirectory());

            // a.delete();
            // System.out.println("directory deleted");

            // a.deleteOnExit();
            // System.out.println("directory deleted on exit");
            // a.setReadOnly();
            // System.out.println("directory read only");

            // a.setWritable();
            // System.out.println("directory writable");
            // a.setExecutable();
            // System.out.println("directory executable");
            // a.setWritable();
            // System.out.println("directory writable");
            // a.setReadable();
            // System.out.println("directory readable");
            // a.setExecutable();

        }


    }
    
}
