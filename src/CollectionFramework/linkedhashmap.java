package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> Map = new LinkedHashMap<>();

        //put()
        Map.put(1,"apple");
        Map.put(2,"banana");
        Map.put(3,"orange");
        System.out.println(Map);

        //get()
        System.out.println(Map.get(3));

        //containkey()
        System.out.println(Map.containsKey(3));

        // remove()
        Map.remove(1);
        System.out.println(Map);
    }
}
/**
 * stores the elements in the key and value pair
 * key must be unique
 * maintains the order of insertion
 * uses hash internally
 * uses node structure
 */

