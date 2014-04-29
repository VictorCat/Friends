package panel;

import org.apache.struts.action.ActionForm;

/**
 * Created by Денис on 29.04.14.
 */
public class FormLogon extends ActionForm {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
