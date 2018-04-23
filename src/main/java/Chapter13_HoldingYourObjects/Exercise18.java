package Chapter13_HoldingYourObjects;

import java.util.*;

/**
 * Exercise 18:   (3) Fill a HashMap with key-value pairs. Print the results to show
 *                    ordering by hash code. Extract the pairs, sort by key, and place the result into a
 *                    LinkedHashMap. Show that the insertion order is maintained.
 */
public class Exercise18 {

    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(26, "1");
        map.put(143, "2");
        map.put(27, "3");
        map.put(34, "4");
        System.out.println(map + " - HashMap");
        //sortedMap
        Set<Integer> set = map.keySet();
        TreeSet<Integer> treeSet = new TreeSet<Integer>(set);
        System.out.println(treeSet + " - set");

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer i : treeSet){
            linkedHashMap.put(i, map.get(i));
        }
        System.out.println(linkedHashMap + " - linkedHashMap");
    }
}
