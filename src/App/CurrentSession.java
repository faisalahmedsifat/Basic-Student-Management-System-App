
package App;

import javax.swing.JOptionPane;

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
