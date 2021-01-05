package App;

public class InvalidInput extends Exception{
    InvalidInput(){
        super();
    }

    InvalidInput(String message){
        super(message);
    }
}
