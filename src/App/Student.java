package App;
import java.util.*;

public class Student extends Profile {
    private int ID;
    public boolean all_fields_fetched_or_entered = true; // Check if all fields are either fetched or entered manually
    private String passwordIsGivenByAdmin;

    Student(){
        // Call the no-argument constructor to create the empty fields student so that later it can be set manually as needed
        super();
    }

    Student(Map<String,String> fields){
        super();
        boolean hasError = false;
        try{
            super.ProfileInit(fields); // Pass the fields to the superclass to store them in the object
        }catch (Exception e){
            this.all_fields_fetched_or_entered = false;
            throw e; // If any error throw the error
        }
        setID(Integer.parseInt(fields.get("ID")));
        passwordIsGivenByAdmin = fields.get("password");
    }

    Student(int ID) throws Exception {
        super();
        try{
            super.ProfileInit(ID); // Pass the fields to the superclass to store them in the object
        }catch (Exception e){
            this.all_fields_fetched_or_entered = false;
            throw e;
        }
        setID(ID);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void addToDatabase() throws Exception{
        try{
            conn c1 = new conn();

            String sql1 = "INSERT INTO student_login " +
                    "VALUES (" + getID() + ", '" + getPasswordIsGivenByAdmin() + "')";

            String sql2 = "INSERT INTO student_profile " +
                    "VALUES (" + getID() + ", '" + getName() + "', '" + getFathers_name() + "', '" + getMothers_name() + "', '" +
                    getPhone() + "', '" + getAddress() + "', '" + getEmail() + "', '" + getDob() + "', '" + getGender() +
                    "', '" + getCitizenship() + "', '" + getMarital_status() + "')";

            c1.s.executeUpdate(sql1);
            c1.s.executeUpdate(sql2);

        }catch(Exception e){
            throw e;
        }
    }

    @Override
    public void updateToDatabase() throws Exception{
        try{
            conn c1 = new conn();

            String query = "UPDATE student_profile " +
                    "SET `Name`='" +getName()+ "', `Fathers Name`='" +getFathers_name()+ "', `Mothers Name`='" +getMothers_name()+ "',"+
                    " `Phone`='" +getPhone()+ "', `Address`='" +getAddress()+ "', `Email`='" +getEmail()+ "',"+
                    " `Date of Birth`='" +getDob()+ "', `Gender`='" +getGender()+ "',"+
                    " `Citizenship`='" +getCitizenship()+ "', `Marital Status`='" +getMarital_status()+ "'"+
                    " WHERE `id`="+getID()+"";

            c1.s.executeUpdate(query);

        }catch(Exception e){
            throw e;
        }
    }

    // REMEMBER: This needs to be private to protect the password from getting exposed outside the class.
    private String getPasswordIsGivenByAdmin(){
        return passwordIsGivenByAdmin;
    }

}
