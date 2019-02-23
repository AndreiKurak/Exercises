package chapter15_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 2:   (1) Repair InfiniteRecursion.java. 
 */

public class Exercise2 {
    public String toString() {
        return " Exercise2 address: " + super.toString() + "\n"; //this -> super.toString()
    }
    
    public static void main(String[] args) {
        List<Exercise2> v =
                new ArrayList<Exercise2>();
        for(int i = 0; i < 10; i++)
            v.add(new Exercise2());
        System.out.println(v);
    }
}
