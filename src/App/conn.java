package App;

import java.sql.*;

public class conn {
    public Connection c;
    public Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12379786", "sql12379786", "212d6wjMn2");
            s = c.createStatement();
            //Debugging
            System.out.println("Connection Established");
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}