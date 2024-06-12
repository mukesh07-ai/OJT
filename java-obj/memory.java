class newH{
    int marks = 87;
    public int add(int x, int y){
        // int x=7;
        // int y=7;

        return x+y;
    }
}

public class memory {

    public static void main(String[] args) {

        int age = 34;
        String name = "Nashit";
        newH obj = new newH();
        int res = obj.add(6,8);
        System.out.println(res);
        int res1 = obj.add(9,7);


    }
}
