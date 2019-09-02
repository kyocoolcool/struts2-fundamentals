package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegEx {
    public static String stringFilter (String str){
        String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll(" ").trim();
    }

    public static void main(String[] args) {
        String a="    qwedv!你好@#d哈囉fg    ";
        System.out.println(stringFilter(a));
    }
}
