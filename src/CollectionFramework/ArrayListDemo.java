package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println("Arraylist is :" + list);

        //get
        System.out.println("Element at index 1 is: " + list.get(1));

        //size
        System.out.println("size: " + list.size());

        //contains
        System.out.println("contain 30? : " +list.contains(30));

        //remove
        list.remove(2);
        System.out.println("after removing index 2:" + list);
    }
}
/**
 * Maintains the insertion order
 * allows duplicates
 * Dynamic in size
 * index based access
 * readind elements is faster
 */
