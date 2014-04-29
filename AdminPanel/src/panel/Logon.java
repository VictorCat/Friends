package panel;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.BaseAction;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Денис on 29.04.14.
 */
public class Logon extends BaseAction {

    private static final String  FORWARD = "successful";
    private static final String  name = "admin";
    private static final String  password = "admin";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        FormLogon logonData = (FormLogon) form;
        HttpSession httpSession = request.getSession();
        if (logonData.getName().equals(name)  && logonData.getPassword().equals(password) ){
            logonData.setStatus("Успех");
            response.addCookie(new Cookie("Logon", "Yes"));
            return mapping.findForward(FORWARD);
        }
        logonData.setStatus("Ошибка");
        return mapping.findForward("error");
    }
}
