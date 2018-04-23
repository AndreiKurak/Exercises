package Chapter13_HoldingYourObjects;

import java.util.*;

/**
 * Exercise 4:   (3) Create a generator class that produces character names (as String
 *                   objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
 *                   time you call next( ), and loops around to the beginning of the character list when it runs out
 *                   of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
 *                   LinkedHashSet, and a TreeSet, then print each container.
 */
public class Exercise4 {

    List<String> characters = Arrays.asList("Yoda", "Luke", "Anakin", "R2-D2", "Solo");

    public void next(List<String> list){
        int loop;
        loop = list.size()/characters.size();
        list.add(characters.get(list.size() - loop * characters.size()));
    }

    public void next(Set<String> set){
        int loop;
        loop = set.size()/characters.size();
        set.add(characters.get(set.size() - loop * characters.size()));
    }

    public static void main(String[] args){
        Exercise4 exercise4 = new Exercise4();
        List<String> characters1 = new ArrayList<String>();
        exercise4.next(characters1);
        exercise4.next(characters1);
        exercise4.next(characters1);
        exercise4.next(characters1);
        exercise4.next(characters1);
        exercise4.next(characters1);
        System.out.println(characters1);

        Set<String> characters2 = new LinkedHashSet<String>();
        exercise4.next(characters2);
        exercise4.next(characters2);
        System.out.println(characters2);
    }
}
