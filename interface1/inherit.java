class A{
    String name = "Mukesh";
    public void show(){
        System.out.println(name);
    }
}

class B extends A{
    
    public void display(){
        System.out.println("This is class B");
    }
}

class C extends B{

    public void display1(){
        System.out.println("This is class C");
    }
}



public class inherit {

    public static void main(String[] args) {

        // A a = new A();
        // a.display();

        
        // B b = new B();
        // b.display();

        C c = new C();
        c.display1();
        c.display();
        c.show();
    }

}
