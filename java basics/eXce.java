public class eXce {

    public static void main(String[] args) {

        
        // compiled time error
        // int a = 0;
        // String a = "Mukesh";
        // int b = 0;
        // int c = 56;
        // System.out.println(c/b);

        // // logical error
        // int a = 56;
        // int b = 0;
        // int d[] = {5,6,7,9,2};
        

        // try{

        //     // int c = a/b;
        //     // System.out.println(c);
        //     System.out.println(d[3]);
            
        // }
        // catch(Exception e){
        //     System.out.println(e);
            // System.out.println("hellow");
           
        // }


        
        int a = 78;
        int b = 0;

        int d = a+b;
        
        System.out.println(d + " Hellow");
        try{
            System.out.println(" Hellow");
            System.out.println(" Hellow1");
            // int c = a/b;
            // System.out.println(c);
        }
       
        catch(ArithmeticException f){
            System.out.println("division by zero error");
            // System.out.println("hellow");
        }
        catch(ArrayStoreException g){
            System.out.println("array store error");
        }
        catch(Exception e){
            System.out.println("new error");
        }


        // int a = 78;
        // int b = 0;

        // int d = a+b;
        // System.out.println(d + " Hellow");
        // try{
        //     int c = a/b;
        //     System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println("error");
        //     System.out.println("hellow");
        // }
        
    }
    
}
