package JAVA_UTIL;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> a;
        a = new ArrayList<>();
        a.add("Alice");
        a.add("Bob");
        a.add("Charlie");
        // Using a for loop
        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.println(name);
        }
    }
}