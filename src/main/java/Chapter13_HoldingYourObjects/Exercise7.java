package Chapter13_HoldingYourObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 7:   (3) Create a class, then make an initialized array of objects of your class. Fill
 *                   a List from your array. Create a subset of your List by using subList( ), then remove this
 *                   subset from your List.
 */
public class Exercise7 {

    public static void main(String[] args){
        Exercise7[] array = {new Exercise7(), new Exercise7(), new Exercise7()};
        List<Exercise7> list = new ArrayList<Exercise7>();
        for (int i = 0; i<array.length; i++){
            list.add(array[i]);
        }
        System.out.println(list);
        List sub = list.subList(0, 2);
        list.removeAll(sub);
        System.out.println(list);
    }
}
