
package App;


public class CurrentSession {

    private static boolean isLoggedIn = false;
    private static boolean isAdmin = false;
    private static int ID = -1;
    private static String username = "";

    
    public static void setIsLoggedIn(boolean isLoggedIn) {
        CurrentSession.isLoggedIn = isLoggedIn;
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

    

}
