package App;
import java.util.*;
import java.util.regex.*;

public class Validator {

    boolean all_valid_field = true;

    private ArrayList<String> errors_list = new ArrayList<>();

    Validator(Map<String,String> fields) throws InvalidInput{
        for (Map.Entry<String,String> entry : fields.entrySet()){
            String field_name = entry.getKey();
            String field_value = entry.getValue();
            if(    field_name.equals("ID")
                || field_name.equals("password")
                || field_name.equals("Name")
                || field_name.equals("Fathers name")
                || field_name.equals("Mothers name")
                || field_name.equals("Address")
                || field_name.equals("Citizenship")
                || field_name.equals("Marital Status")){
                runValidatorNonEmptyNameString(field_value,field_name);
            }
            if(field_name.equals("Phone")) {
                runValidatorPhone(field_value,field_name);
            }
            if(field_name.equals("Email")) {
                runValidatorEmail(field_value,field_name);
            }
            if(field_name.equals("Date of Birth")){
                runValidatorDATE(field_value,field_name);
            }
            if(field_name.equals("Gender")) {
                runValidatorGender(field_value,field_name);
            }
        }

        if(!all_valid_field){
            String errorMessage = "";
            for (String s:errors_list) {
                errorMessage = errorMessage + s + ",";
            }
            errorMessage = errorMessage.substring(0, errorMessage.length() - 1);

            throw new InvalidInput("Invalid Input! Correctly fill the following fields: " + errorMessage);
        }


    }
    void runValidatorNonEmptyNameString(String name, String field_name){
        if(!(name.length() > 0)){
            all_valid_field = false;
            errors_list.add(field_name);
        }else{
            boolean all_blank_spaces = true;
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i) != ' '){
                    all_blank_spaces = false;
                    break;
                }
            }
            if(all_blank_spaces){
                all_valid_field = false;
                errors_list.add(field_name);
            }
        }
    }

    void runValidatorPhone(String phone, String field_name){
        if(!(phone.length() == 11)){
            all_valid_field = false;
            errors_list.add(field_name);
        }else{
            for (int i = 0; i < phone.length(); i++) {
                if(!(phone.charAt(i) >= '0' && phone.charAt(i) <= '9')){
                    all_valid_field = false;
                    errors_list.add(field_name);
                    break;
                }
            }
        }
    }

    void runValidatorEmail(String email, String field_name){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        if(!((Pattern.compile(emailRegex).matcher(email).matches()) && (email.length() > 0))){
            all_valid_field = false;
            errors_list.add(field_name);
        }
    }

    void runValidatorDATE(String dob, String field_name){
        if(dob.length() == 0){
            all_valid_field = false;
            errors_list.add(field_name);
            return;
        }
        for (int i = 0; i < dob.length(); i++) {
            if(!((dob.charAt(i) >= '0' && dob.charAt(i) <= '9') || dob.charAt(i) == '-' || dob.charAt(i) == '/')  ) {
                all_valid_field = false;
                errors_list.add(field_name);
                break;
            }
        }
    }

    void runValidatorGender(String gender, String field_name){
        if(!((gender.toUpperCase().equals("MALE") || gender.toUpperCase().equals("FEMALE")))){
            all_valid_field = false;
            errors_list.add(field_name);
        }
    }
}
