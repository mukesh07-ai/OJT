import java.sql.*;
public class MyDbconnect {
public static void main(String[] args) {
try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "localhost");System.out.println("Connected With the database successfully");
} catch (SQLException e) {System.out.println("Error while connecting to the database");
}
}
}
