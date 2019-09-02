package util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MyUrlEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String strTest = "jFyzrPkT+HWqIJLyTDF1WeRlzj2Cl0KV";
        String strTest2 = "jFyzrPkT+HWqIJLyTDF1WeRlzj2Cl0KV";
        strTest = URLEncoder.encode(strTest, "UTF-8");
        System.out.println(strTest);
        strTest = URLDecoder.decode(strTest2,"UTF-8");
        System.out.println(strTest);
    }


}
