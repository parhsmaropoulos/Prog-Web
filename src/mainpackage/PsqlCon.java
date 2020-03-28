package mainpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PsqlCon {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/progatweb", "postgres","1233");
        System.out.println("Opened db suc");
        
        
        //Create statement for table/s creation if not already exists
        stmt = c.createStatement();
        String users = "CREATE TABLE IF NOT EXISTS USERS" +
        			"(ID serial primary key  not null,"+
        			"Username text not null,"+
//        			"Password text not null,"+
        			"Name text not null,"+
        			"Surname text not null,"+
        			"Type char(20) not null,"+
        			"Logged boolean)";
        String clients = "Create table if not exists clients"+
        				"(id int primary key not null,"+
        				"AFM int not null,"+
        				"Phone int not null)";
        stmt.executeUpdate(users);
        stmt.executeUpdate(clients);
        stmt.close();
        c.close();
        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.println(e.getClass().getName()+": "+ e.getMessage());
        	System.exit(0);
        }
        System.out.println("table created succ");
    }
    
	public void addUser(String insertQuery) {
    	 Connection conn = null;
         Statement stmt = null;
         try {
             Class.forName("org.postgresql.Driver");
             conn = DriverManager
                     .getConnection("jdbc:postgresql://localhost:5433/progatweb", "postgres","1233");
         System.out.println("Opened db suc");
    			stmt = conn.createStatement();
    			stmt.executeUpdate(insertQuery);
    			stmt.close();
    			conn.close();
    		} catch (Exception e) {
            	e.printStackTrace();
            	System.out.println(e.getClass().getName()+": "+ e.getMessage());
            	System.exit(0);
            }
    }

	public int getCounter() {
		 Connection conn = null;
		 Statement stmt = null;
         var size = 0;
         try {
             Class.forName("org.postgresql.Driver");
             conn = DriverManager
                     .getConnection("jdbc:postgresql://localhost:5433/progatweb", "postgres","1233");
         System.out.println("Opened db suc");
    			stmt = conn.createStatement();
    			String sql = "Select count(name) as total from users";
    			ResultSet rs = stmt.executeQuery(sql);
    			while (rs.next()) {
    				size = rs.getInt("total");    				
    			}
    			stmt.close();
    			conn.close();
		} catch (Exception e) {
        	e.printStackTrace();
        	System.out.println(e.getClass().getName()+": "+ e.getMessage());
        	System.exit(0);
        }
         return size;
	}
	}
