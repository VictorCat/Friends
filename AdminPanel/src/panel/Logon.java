package panel;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.*;

/**
 * Created by Денис on 29.04.14.
 */
public class Logon extends DispatchAction {
    private static final String  FORWARD = "successful";
    private static final String  name = "admin";
    private static final String  password = "admin";

    @Override
    protected String getMethodName(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, String parameter) throws Exception {
        return "logon";
    }

    public ActionForward logon(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        FormLogon logonData = (FormLogon) form;
        HttpSession httpSession = request.getSession();
        response.addCookie(new Cookie("Logon", "Yes"));
        return mapping.findForward(FORWARD);
    }
}
