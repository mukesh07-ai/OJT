interface Computer{

    void display();
} //abstract class

interface Desktop{

    void display(); //concreet class
}

class Laptop implements Computer, Desktop{

    public void display(){
        System.out.println("This is Laptop computer");
    }
}

public class interF {

    public static void main(String[] args) {
        // Computer c = new Desktop();
        Computer l = new Laptop();
        // c.display();
        l.display();

    }

}
