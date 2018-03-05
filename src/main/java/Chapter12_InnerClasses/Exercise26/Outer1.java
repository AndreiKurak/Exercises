package Chapter12_InnerClasses.Exercise26;

/**
 * Exercise 26:   (2) Create a class with an inner class that has a non-default constructor
 *                    (one that takes arguments). Create a second class with an inner class that inherits from the
 *                    first inner class.
 */
public class Outer1 {

    class Inner1{
        Inner1(String s){
            System.out.println(s);
        }

        public void method1(){
            System.out.println("method1");
        }
    }
}
