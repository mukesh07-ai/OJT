

class Students{
    int marks;
    String addr;
    // marks = 76;

    public String student(String mail, int phone){
        return("Name: " + mail + "\n" + "Phone: " + phone);
        // System.out.println("Name: " + mail + "\n" + "Phone: " + phone);
    }
}

public class objH {

    public static void main(String[] args) {

        Students obj = new Students();
        String r1 = obj.student("mail@gg.c", 874552);
        String r2 = obj.student("abc", 78);
        String r3 = obj.student("iu", 5678);
        String name = "Nashit";
        int age = 20;
        // int age = 42;
        // System.out.println();

    }

}
