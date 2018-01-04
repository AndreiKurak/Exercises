package Chapter8_AccessControl.Exercise1;

/**
 * Exercise 1:   (1) Create a class in a package. Create an instance of your class outside of that
 *                   package.
 */

import Chapter8_AccessControl.Exercise1.SomePackage.SomeClass;

public class MainForEx1 {

    static SomeClass someClass = new SomeClass();

    public static void main(String[] args){
        System.out.println(someClass);
    }
}
