public class buffer {
    
    public static void main(String[] args) {

        // StringBuffer a = new StringBuffer("Mukesh");
        // System.out.println(a.capacity());

        StringBuffer a = new StringBuffer("Mukesh");
        a.append(" Vishwas");
        a.insert(6, " Kumar");
        System.out.println(a);

        // StringBuffer a = new StringBuffer("INDIA");
        // System.out.println(a.capacity());
        // a.append(" is great.");
        // System.out.println(a);
        // a.append(" Long live India");
        // System.out.println(a);
    }
}
