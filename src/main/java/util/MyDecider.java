package util;

import org.apache.struts2.util.SubsetIteratorFilter;

public class MyDecider implements SubsetIteratorFilter.Decider {
    @Override
    public boolean decide(Object o) throws Exception {
        String str=(String)o;
        return str.indexOf("文")>-1;
    }
}
