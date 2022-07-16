package college.management;
import java.sql.*;


public class Connections {
    Connection c;
    Statement s;
    public Connections() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3308/collegemanagement","root","");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
