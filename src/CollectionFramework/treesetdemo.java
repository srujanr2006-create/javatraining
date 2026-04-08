package CollectionFramework;

import java.util.TreeSet;

public class treesetdemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        //add
        set.add(30);
        set.add(29);
        set.add(39);
        System.out.println(set);

        //first()
        System.out.println(set.first());

        //last()
        System.out.println(set.last());

        //remove()
        set.remove(30);
        System.out.println(set);
    }
}
/**
 * no duplicates are allowed
 * automatically sorts the element
 * uses tree structure internally
 * slower than hashset
 * usefull when sorted data needed
 */