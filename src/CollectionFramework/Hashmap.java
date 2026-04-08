package CollectionFramework;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> Map = new HashMap<>();

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
 * stares the element in key and value pair
 * key must be unique
 * does not maintains  the order of insertion
 * use hash internally
 */
