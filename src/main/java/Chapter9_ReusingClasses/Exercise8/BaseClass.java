package Chapter9_ReusingClasses.Exercise8;

/**
 * Exercise 8:   (1) Create a base class with only a non-default constructor, and a derived
 *                   class with both a default (no-arg) and non-default constructor. In the derived-class
 *                   constructors, call the base-class constructor.
 */

public class BaseClass {
    BaseClass(){
        System.out.println("BaseClass");
    }
}
