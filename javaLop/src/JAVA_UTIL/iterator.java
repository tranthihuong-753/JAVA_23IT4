package JAVA_UTIL;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> a;
        a= new ArrayList<>();
        a.add(1);
        a.add(10);
        a.add(12);
        // iterator cho phép duyệt qua mảng mà không cần biết rõ cấu trúc mảng 
        Iterator<Integer> b = a.iterator();
        while (b.hasNext()) {
            Integer name = b.next();
            System.out.println(name);
        }
    }
}

