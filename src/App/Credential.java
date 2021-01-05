
package App;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Credential {
    //Creates new connection
    private conn c1 = new conn();
    boolean isCorrectCredentials(int id,String password) throws InvalidCredentials, SQLException{
        
        String query = "SELECT * FROM student_login WHERE ID = " + id + " and password = '" + password + "'";
        ResultSet rs;
        rs = c1.s.executeQuery(query); 
        boolean isLoggedIn = false;
        if(rs.next()){
            isLoggedIn = true;
        }else{
            throw new InvalidCredentials("Entered Wrong Credentials");
        }
        return isLoggedIn;
    }
    
    //Overloaded method
    boolean isCorrectCredentials(String username,String password) throws InvalidCredentials, SQLException{
        
        String query = "SELECT * FROM admin_login WHERE username = '" + username + "' and password = '" + password + "'";
        ResultSet rs;
        rs = c1.s.executeQuery(query); 
        boolean isLoggedIn = false;
        if(rs.next()){
            isLoggedIn = true;
        }else{
            throw new InvalidCredentials("Entered Wrong Credentials");
        }
        return isLoggedIn;
    }
}
