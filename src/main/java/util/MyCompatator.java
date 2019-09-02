package util;

import java.util.Comparator;

public class MyCompatator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().length()-o2.toString().length();
    }
}
