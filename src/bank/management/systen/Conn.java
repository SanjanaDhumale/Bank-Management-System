
package bank.management.systen;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Sanjana@4387");
            s = c.createStatement();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
