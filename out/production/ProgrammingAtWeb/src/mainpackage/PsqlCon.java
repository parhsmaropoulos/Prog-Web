package mainpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PsqlCon {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/progatweb", "postgres","1234");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getClass().getName()+": "+ e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened db suc");
    }
}
