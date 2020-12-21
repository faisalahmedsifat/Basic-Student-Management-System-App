/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author ari13
 */
public class CurrentSession {

    private static boolean isLoggedIn = false;
    private static boolean isAdmin = false;
    private static int ID = -1;
    private static String username = "";

    public static boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public static void setIsLoggedIn(boolean isLoggedIn) {
        CurrentSession.isLoggedIn = isLoggedIn;
    }

    public static boolean isIsAdmin() {
        return isAdmin;
    }

    public static void setIsAdmin(boolean isAdmin) {
        CurrentSession.isAdmin = isAdmin;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        CurrentSession.ID = ID;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        CurrentSession.username = username;
    }

    static boolean setIsLoggedIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
