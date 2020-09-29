package dbUtils;

import java.sql.*;

public class CreateDB {
    public static void createTestDatabase(){
        String url = "jdbc:sqlite:web\\db\\test.db";
        
        try{
            Connection conn = DriverManager.getConnection(url);
            if(conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("Test database has been created");
                
            }
            else{
                System.out.println("Database not created");
            }
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
        
    }
    
}
