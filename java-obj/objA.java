class Students{
    String name;
    int age;
    static String mail;

    

    // public void show(){
    //     System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Mail: " + mail);
    // }

    // public static void show2(Students obj){
    //     System.out.println(obj.age + ""+obj.mail);
    // }

    // public Students(){
    //     System.out.println("Hello from instance block/Constructor");
    // }

    // public Students(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }



    static {
        mail = "hel";
        System.out.println("Hello from static block");
    }
    // public static void show1(Students obj){
    //     System.out.println("Name: " + obj.name + "\n" + "Age: " + obj.age + "\n" + "Mail: " + obj.mail);
    // }
}


public class objA {

    public static void main(String[] args) {
    Students adit = new Students();
    // adit.name = "Nashit";
    // adit.age = 20;
    // adit.mail = "nashit@gg.c";

    // Students cits = new Students();
    // cits.name = "Shrey";
    // cits.age = 20;
    // cits.mail = "shrey@sh.c";

    // Students obj = new Students();

    // Students obj = new Students();
    
    // obj.show2(cits);
    // // obj.show1(adit);
    // adit.show();
    }

}
