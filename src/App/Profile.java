package App;
import java.sql.*;
import java.util.*;

public abstract class Profile {
    private String name;
    private String fathers_name;
    private String mothers_name;
    private String phone;
    private String address;
    private String email;
    private String dob;
    private String gender;
    private String citizenship;
    private String marital_status;
    private String password;
    
    public static Conn c1 = new Conn();

    Profile(){

    }

    void ProfileInit(Map<String,String> fields) {
        for(Map.Entry<String,String> entry : fields.entrySet()){
            String field_name = entry.getKey();
            String field_value = entry.getValue();
            if(field_name.equals("Name"))            this.name = field_value;
            if(field_name.equals("Fathers name"))    this.fathers_name = field_value;
            if(field_name.equals("Mothers name"))    this.mothers_name = field_value;
            if(field_name.equals("Phone"))           this.phone = field_value;
            if(field_name.equals("Address"))         this.address = field_value;
            if(field_name.equals("Email"))           this.email = field_value;
            if(field_name.equals("Date of Birth"))   this.dob = field_value;
            if(field_name.equals("Gender"))          this.gender = field_value;
            if(field_name.equals("Citizenship"))     this.citizenship = field_value;
            if(field_name.equals("Marital Status"))  this.marital_status = field_value;
        }
    }

    void ProfileInit(int ID) throws Exception {
        try{
            //conn c1 = new Conn();

            String query = "SELECT * FROM student_profile WHERE id = '" + ID + "'";
            ResultSet rs = c1.s.executeQuery(query);

            if(rs.next()){
                // Update All data fields in the object with information of id=ID from the database
                setName(                rs.getString("Name")            );
                setFathers_name(        rs.getString("Fathers name")    );
                setMothers_name(        rs.getString("Mothers name")    );
                setPhone(               rs.getString("Phone")           );
                setAddress(             rs.getString("Address")         );
                setEmail(               rs.getString("Email")           );
                setDob(                 rs.getString("Date of Birth")   );
                setGender(              rs.getString("Gender")          );
                setCitizenship(         rs.getString("Citizenship")     );
                setMarital_status(      rs.getString("Marital Status")  );
            }else{
                throw new Exception("No such student found with id=" + ID + "!");
            }
        }catch(Exception e){
            throw e;
        }
    }

    // Three abstract methods that will be implemented in the classes that will inherit this super class
    public abstract void addToDatabase() throws Exception;
    public abstract void updateToDatabase() throws Exception;
    public abstract void updatePassToDatabase() throws Exception;


    public static int totalStudents(){
        int total = 0;
        try{
            //conn c1 = new Conn();

            String query = "SELECT * FROM student_profile";
            ResultSet rs = c1.s.executeQuery(query);
            while(rs.next()){
                total++;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathers_name() {
        return fathers_name;
    }

    public void setFathers_name(String fathers_name) {
        this.fathers_name = fathers_name;
    }

    public String getMothers_name() {
        return mothers_name;
    }

    public void setMothers_name(String mothers_name) {
        this.mothers_name = mothers_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
