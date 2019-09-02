package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChainDemoAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String excute(){
        return SUCCESS;
    }
    public  String chain2(){
        return "chain2";
    }
    public  String chain3(){
        return "chain3";
    }


}
