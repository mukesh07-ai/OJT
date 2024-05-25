class india {
    public String byPC(int cost){
        // System.out.println("Buy a new PC");
       //  return "Buy a new PC";
       if(cost>=50000){
           return "Buy a new PC";
       }else{
           return "less money";
       }
    }
    
}

public class d{

    public static void main(String[] args) {

        india x = new india();
        System.out.println(x.byPC(5000));
    }
}