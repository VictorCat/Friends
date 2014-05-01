package panel;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Денис on 30.04.14.
 */
public class LogonUser {

    public static boolean logon(HttpServletRequest request){
        User user =  (User) request.getSession().getAttribute("Admin");
        if (user != null){
            if (user.getName().equals("admin") && user.getPassword().equals("admin")){
                return true;
            }
        }
        return false;
    }
}
