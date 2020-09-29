
package dbUtils;

import java.sql.*;


public class DbConn {
    public static boolean testConnect(String url){
        Connection conn = null;
        try{            
            
            conn = DriverManager.getConnection(url);            
            if(conn != null){
                conn.close();
            }
            return true;
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
    }
}
