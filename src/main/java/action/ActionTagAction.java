package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ActionTagAction extends ActionSupport {
    private String author;
    private String job;
    private Integer age;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String demo(){
        return "done";
    }
    public  String excute(){
        return SUCCESS;
    }

    public  String login(){
        ActionContext.getContext().put("author",author);
        ActionContext.getContext().put("job",job);
        return "done";
    }

    public  String tag3(){
        return "done";
    }


}
