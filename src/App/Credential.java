/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author faisa
 */
public class Credential {
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
