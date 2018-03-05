package Chapter12_InnerClasses.Exercise9_10;

/**
 * Exercise 9:   (1) Create an interface with at least one method, and implement that
 *                   interface by defining an inner class within a method, which returns a reference to your
 *                   interface.
 * Exercise 10:   (1) Repeat the previous exercise but define the inner class within a scope
 *                    within a method.
 */
public class Outer5 {

    public void inner(boolean b){
        if (b){
        class Inner implements SomeInterface{

            public void method1(){ }
        }
        Inner inner = new Inner();
        }
    }

    public static void main(String[] args){
        Outer5 outer = new Outer5();
        outer.inner(true);
    }
}
