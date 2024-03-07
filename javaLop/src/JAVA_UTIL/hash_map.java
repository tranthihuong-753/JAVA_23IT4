package JAVA_UTIL;

import java.util.HashMap;

public class hash_map {
        public static void main(String[] args) {
            // Create a new HashMap
            HashMap<String, Integer> a= new HashMap<>();
            // Add key-value pairs to the HashMap
            a.put("A", 18);
            a.put("B", 28);
            a.put("C", 38);
            a.put("D", 48);
            // a.get("I") là Integer trong a tương ứng với tên I . Output null 
            System.out.println("I age: " + a.get("I"));
            // Kiểm tra xem trong a có ký tự "a" hay không 
            if (a.containsKey("a"))
            System.out.println("a age: " + a.get("a"));
            else
            System.out.println("Sophia's age not found.");
        }
}


