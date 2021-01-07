package App;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CoursesList {

    ArrayList<Course> listOfCourse = new ArrayList<Course>();
    ArrayList<Course> deleteList = new ArrayList<Course>();
    private int ID;
    final int max_course_can_take = 6;
    

    public CoursesList(){

    }

    public CoursesList(int ID) throws Exception{
        // Fetch the Courses list from the db to the arraylist
        try{
            conn c1 = new conn();
            setID(ID);
            String query = "SELECT * FROM student_courses WHERE `ID`='"+ID+"'";
            ResultSet r1 = c1.s.executeQuery(query);
            int number_of_columns = r1.getMetaData().getColumnCount();

            boolean hasFoundStudent = false;
            while(r1.next()){
                hasFoundStudent = true;
                // Column index starts with 2 because the first col is ID in 1 based indexing of the getObject
                // getObject works with 1 based indexing system
                for (int column = 2; column <= number_of_columns; column++) {
                    Object value = r1.getObject(column);
                    String current_column_course_name = r1.getMetaData().getColumnName(column);
                    boolean current_status = Boolean.parseBoolean(value.toString());
                    if(current_status){
                        listOfCourse.add(new Course(current_column_course_name));
                    }
                }
            }

            if(!hasFoundStudent){
                JOptionPane.showMessageDialog(null, "No student found with ID=" + ID);
            }
            c1.s.close();
            c1.c.close();
        }catch (Exception e){
            throw e;
        }
    }

    public void assignCourseToStudent(String identifier){
        if(listOfCourse.size() + 1 > this.max_course_can_take){
            JOptionPane.showMessageDialog(null, "Maximum number of Course Limit reached!");
        }else{
            
            Course c = new Course();
            boolean hasError = false;
            try{
                c = new Course(identifier);
            }catch(Exception e){
                hasError = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            if(!hasError){
                // Remove from the delete list if exists
                for (int i = 0; i < deleteList.size(); i++) {
                    String current_list_identifier = deleteList.get(i).getIdentifier();
                    if (current_list_identifier.equals(c.getIdentifier())) {
                        deleteList.remove(i);
                        break;
                    }
                }

                // Check if already added
                boolean previously_exists = false;
                for (int i = 0; i < listOfCourse.size(); i++ ) {
                    String current_list_identifier = listOfCourse.get(i).getIdentifier();
                    if (current_list_identifier.equals(c.getIdentifier())) {
                        previously_exists = true;
                        break;
                    }
                }

                // The course was not previously added, add it to the list
                if(!previously_exists){
                    listOfCourse.add(c);
                }
            }
            
        }
    }

    public void dropCourseOfStudent(String identifier){
        if(Course.isValidCourse(identifier)){
            Course c = new Course(identifier);
            // Remove from the course list arraylist
            for (int i = 0; i < listOfCourse.size(); i++ ) {
                String current_list_identifier = listOfCourse.get(i).getIdentifier();
                if (current_list_identifier.equals(c.getIdentifier())) {
                    listOfCourse.remove(i);
                    break;
                }
            }

            // Check if already in the delete list
            boolean previously_exists = false;
            for (int i = 0; i < deleteList.size(); i++ ) {
                String current_list_identifier = deleteList.get(i).getIdentifier();
                if (current_list_identifier.equals(c.getIdentifier())) {
                    previously_exists = true;
                    break;
                }
            }

            // If not in the delete list add
            if(!previously_exists){
                deleteList.add(c);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No Such Course Found In The Database System with Course Identifier as : "+identifier+"!");
        }
    }

    public void updateToDataBase(){
        try{
            conn c1 = new conn();
            String query = "";
            
            // Run 2 SQL

            // One for Adding the Courses
            if(listOfCourse.size() >= 1){
                query = "UPDATE student_courses " +
                        "SET ";
                for (int i = 0; i < listOfCourse.size(); i++) {
                    String current_course_in_index = listOfCourse.get(i).getIdentifier();
                    query = query + "`" + current_course_in_index + "`=true";
                    if(i != listOfCourse.size() - 1){
                        query = query + ", ";
                    }
                }

                query = query + " WHERE `ID`='" + getID() + "'";
                //System.out.println(query);
                c1.s.executeUpdate(query);
            }

            // One for Dropping the Courses
            if(deleteList.size() >= 1){
                query = "UPDATE student_courses " +
                        "SET ";
                for (int i = 0; i < deleteList.size(); i++) {
                    String current_course_in_index = deleteList.get(i).getIdentifier();
                    query = query + "`" + current_course_in_index + "`=false";
                    if(i != deleteList.size() - 1){
                        query = query + ", ";
                    }
                }
                query = query + " WHERE `ID`='" + getID() + "'";
                //System.out.println(query);
                c1.s.executeUpdate(query);
            }
               
            c1.s.close();
            c1.c.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
