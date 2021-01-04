/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author faisa
 */
public class InvalidCredentials extends Exception{
    InvalidCredentials(){
        super();
    }
    InvalidCredentials(String message){
        super(message);
    }
}
