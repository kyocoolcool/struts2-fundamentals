package action;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;


public class JsonAction extends ActionSupport {
    private ArrayList<String> list;
    private ArrayList<User> users;
    private User user;
    private String firstName;
    private String lastName;

//    private HttpServletRequest request;
//
//    public void setServletRequest(HttpServletRequest arg0) {
//        this.request = arg0;
//    }
//
//    public HttpServletRequest getRequest() {
//        return request;
//    }
//
//    public void setRequest(HttpServletRequest request) {
//        this.request = request;
//    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String sendJson() {
        list = new ArrayList<String>();
        users = new ArrayList<User>();
        list.add("red");
        list.add("green");
        list.add("yellow");
        User user = new User();
        user.setFirstName("Riven");
        user.setLastName("Chen");
        users.add(user);
        user = new User();
        user.setLastName("Wang");
        user.setFirstName("Hen");
        users.add(user);
        return SUCCESS;
    }

    public String getJson() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String name = request.getParameter("name");
        System.out.println("看我有沒有執行2");
//        System.out.println(name);
        System.out.println(name);
        System.out.println("firstName");
        System.out.println(firstName);
        System.out.println("lastName");
        System.out.println(lastName);
        System.out.println("user");
        System.out.println(user);
        System.out.println("list");
        System.out.println(list);
        System.out.println("users");
        System.out.println(users);
        return SUCCESS;
    }

    public String jsonDemo() {
        System.out.println("i do");
        return SUCCESS;
    }
}
