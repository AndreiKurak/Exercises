package Chapter13_HoldingYourObjects;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/** Exercise 12:   (3) Create and populate a List<Integer>. Create a second List<Integer>
 *                     of the same size as the first, and use ListIterators to read elements from the first List and
 *                     insert them into the second in reverse order. (You may want to explore a number of different
 *                     ways to solve this problem.)
 */
public class Exercise12 {

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(0,1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(10,11,12,13,14,15,16);
        ListIterator<Integer> iterator1 = list1.listIterator();
        ListIterator<Integer> iterator2 = list2.listIterator(list2.size());

        while (iterator1.hasNext()){
            iterator1.next();
            iterator1.set(iterator2.previous());
        }
        System.out.println(list1);
    }
}
