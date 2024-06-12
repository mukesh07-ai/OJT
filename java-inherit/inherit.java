// package calc;
import calc.*;


public class inherit {

    public static void main(String[] args){
        addition obj = new addition();
        int ans = obj.add(1, 4);
        int a1 = obj.sub(3,4);
        int a2 = obj.div(5,2);
        
        System.out.println(ans);
        System.out.println(a1);
        System.out.println(a2);
    }

}
