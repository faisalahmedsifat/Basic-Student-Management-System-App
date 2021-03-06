package App;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Course {
    private String name;
    private String identifier;

    
    
    public Course(){
        
    }

    // For constructing using database and a identifier
    public Course(String identifier){
        try{
            Conn c1 = new Conn();
            String query = "SELECT * FROM course_details WHERE `Identifier`='"+identifier+"'";
            ResultSet r1 = c1.s.executeQuery(query);
            if(r1.next()){
                this.name = r1.getString("Name");
                this.identifier = identifier;
            }else{
                JOptionPane.showMessageDialog(null, "No Such Course Found In The Database System with Course Identifier as : "+identifier+"!");
            }
            c1.s.close();
            c1.c.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static ArrayList<String> getAllValidCourseList(){
        ArrayList<String> lists = new ArrayList<String>();
        try{
            Conn c1 = new Conn();
            String query = "SELECT * FROM course_details";
            ResultSet r1 = c1.s.executeQuery(query);
            
            while(r1.next()){
                String identifier = r1.getString("Identifier");
                lists.add(identifier);
            }
            c1.s.close();
            c1.c.close();
            return lists;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lists;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public static boolean isValidCourse(String identifier){
        try{
            Conn c1 = new Conn();
            String query = "SELECT * FROM course_details WHERE `Identifier`='"+identifier+"'";
            ResultSet r1 = c1.s.executeQuery(query);
            return r1.next(); // return a true if course exists or false
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }
}
