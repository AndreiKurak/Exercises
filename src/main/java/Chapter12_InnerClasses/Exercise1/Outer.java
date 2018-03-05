package Chapter12_InnerClasses.Exercise1;

/**
 * Exercise 1:   (1) Write a class named Outer that contains an inner class named Inner.
 *                   Add a method to Outer that returns an object of type Inner. In main( ), create and
 *                   initialize a reference to an Inner.
 */
public class Outer {

    class Inner{

    }

    public Inner method1(){
        return new Inner();
    }

    public static void main(String[] args){
        Outer.Inner inner = new Outer().method1();
    }
}
