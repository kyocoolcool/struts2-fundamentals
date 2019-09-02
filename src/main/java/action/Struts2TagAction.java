package action;

import com.opensymphony.xwork2.ActionSupport;


public class Struts2TagAction extends ActionSupport {

    public static final String MESSAGE = "Pratices Struts2Tag ...";

    public String execute() throws Exception {
        setMessage(MESSAGE);
        return SUCCESS;
    }

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String errorRequest() {
        return SUCCESS;
    }



}
