abstract class Computer{
    public void buit_in_property(){

        System.out.println("This is computer");
        
    }

    protected abstract void display();
}

class Computer2 extends Computer{

    public void display(){

        System.out.println("This is 2nd computer");
    }
}

class Laptop extends Computer{

    public void display(){
        System.out.println("This is Laptop computer");
    }
}

public class abc {

    public static void main(String[] args) {

        Computer c = new Computer2();
        Computer c1 = new Laptop();
        c.display();
        c.buit_in_property();
        c1.display();

        // // String name = "Mukesh";
        // // name = "Mukesh1";
        // // name = "Mukesh2";

        // final String name = "Mukesh";
        // // name = "Mukesh1";
        // // name = "Mukesh2";
        // System.out.println(name);
    }

}
