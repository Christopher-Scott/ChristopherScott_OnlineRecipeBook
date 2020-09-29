
package dbUtils;

public class TestConnect {
    public static void main(String[] args){
        CreateDB.createTestDatabase();
        if(DbConn.testConnect("jdbc:sqlite:web\\db\\test.db")){
            System.out.println("Connection Succesful");            
        }
        else{
            System.out.println("Connection Unsuccesful");
        }
    }
    
}
