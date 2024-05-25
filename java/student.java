class student {
    String name;
    String email;
    long phone;
    int marks;

    student(String name, String email, long phone, int marks) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.marks = marks;
    }

    int percentage(){
        return (marks * 100) / 500;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Phone: "+phone);
        System.out.println("Marks: "+marks);
        System.out.println("Percentage: "+percentage()+"%");
    }

    
        public static void main(String[] args) {
            student s = new student("Mukesh", "mukesh@123", 1234567890, 400);
            s.display();
        }
    
    
}
