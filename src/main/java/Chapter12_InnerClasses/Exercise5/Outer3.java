package Chapter12_InnerClasses.Exercise5;

/**
 * Exercise 5:   (1) Create a class with an inner class. In a separate class, make an instance of
 *                   the inner class.
 */
public class Outer3 {

    class Inner{

        public Outer3 outer(){ //to get the object of outer class
            return Outer3.this;
        }
    }
}
