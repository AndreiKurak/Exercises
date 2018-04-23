package Chapter13_HoldingYourObjects;

import java.util.*;

/**
 * Exercise 11:   (2) Write a method that uses an Iterator to step through a Collection and
 *                    print the toString( ) of each object in the container. Fill all the different types of
 *                    Collections with objects and apply your method to each container.
 */
public class Exercise11 {

    private int number;

    Exercise11(int number){
        this.number = number;
    }

    public String toString(){
        return "Exercise " + Integer.toString(number);
    }

    public static void useIterator(Iterator<Exercise11> collectionIterator){
        while (collectionIterator.hasNext()){
            System.out.println(collectionIterator.next().toString());
        }
    }

    public static void main(String[] args){
        List<Exercise11> list = Arrays.asList(new Exercise11(1), new Exercise11(2), new Exercise11(3));
        LinkedList<Exercise11> linkedList = new LinkedList<Exercise11>(list);
        HashSet<Exercise11> hashSet = new HashSet<Exercise11>(list);

        useIterator(list.iterator());
        useIterator(linkedList.iterator());
        useIterator(hashSet.iterator());
    }
}
