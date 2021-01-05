
package App;

//Invalid Credential custom exception class
public class InvalidCredentials extends Exception{
    InvalidCredentials(){
        super();
    }
    InvalidCredentials(String message){
        super(message);
    }
}
