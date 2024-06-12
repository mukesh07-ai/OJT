class Students{
    String name;
    int age;
    static String mail;
    

    // public Students(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    //     // age = 20;
    //     // name = "";
    //     System.out.println("Hello from instance block/Constructor");
    //     System.out.println(age+""+name);
    // }
    
    public Students(Students adit) {
        adit.name = name;
        adit.age = age;
        System.out.println("Hello from instance block/Constructor");
    }

    public void stu(){}
    // public Students(String name, int age){
    //     this.name = name;
    //     this.age = age;
    //     System.out.println("Hello from instance block/Constructor");
    //     System.out.println(age+""+name);
    // }

}


public class conS {

    public static void main(String[] args) throws ClassNotFoundException {

        Class a;
        a = Class.forName("Students");
    // Students adit = new Students();
    // Students cits = new Students("Rajesh", 33);
    // adit.name = "Nashit";
    // adit.age = 20;
    }

}
