class patna extends student{
    public void display(){
        System.out.println(" name : "+ name+ " city : "+ city + " Salary : "+ Salary);}
}


public class adit {
    public static void main(String[] args) {
        final student s = new student();
        // s.display();
        // System.out.println("id : "+s.id);
        System.out.println("name : "+s.name);
        System.out.println("city : "+s.city);
        System.out.println("Salary : "+s.Salary);
    
        
    }

}

