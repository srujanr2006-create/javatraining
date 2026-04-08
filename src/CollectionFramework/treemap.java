package CollectionFramework;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> Map= new TreeMap<>();

        Map.put(3,"c");
        Map.put(2,"d");
        Map.put(1,"a");
        Map.put(4,"b");
        System.out.println(Map);
        System.out.println(Map.get(2));
        System.out.println((Map.firstKey()));
        System.out.println(Map.lastKey());
        Map.remove(2);
        System.out.println(Map);
    }
}
/**
 * store elements in key and value pair
 * key must be unique
 * automatically sets the keys
 * uses hash internally
 * uses tree structure
 * slower than hashmap
 */