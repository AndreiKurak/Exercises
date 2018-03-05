package Chapter12_InnerClasses.Exercise19;

/**
 * Exercise 19:   (2) Create a class containing an inner class that itself contains an inner
 *                    class. Repeat this using nested classes. Note the names of the .class files produced by the
 *                    compiler.
 */
public class Outer5 {

    static class Inner{

        public void printSomething(String s){
            System.out.println(s);
        }

        static class InnerForInner{

        }
    }

    public static Inner inner(){
        return new Inner();
    }

    public static void main(String[] args){
        Inner inner = inner();
        inner.printSomething("the result of method");
    }
}
