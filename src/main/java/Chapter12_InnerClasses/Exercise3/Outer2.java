package Chapter12_InnerClasses.Exercise3;

/**
 * Exercise 3:   (1) Modify Exercise 1 so that Outer has a private String field (initialized
 *                   by the constructor), and Inner has a toString( ) that displays this field. Create an object of
 *                   type Inner and display it.
 */
public class Outer2 {

    private String line;

    Outer2(){
        line = "some value";
    }

    class Inner{

        public String toString(){
            return line;
        }
    }

    public Inner method1(){
        return new Inner();
    }

    public static void main(String[] args){
        Outer2.Inner inner = new Outer2().method1();
        System.out.println(inner);
    }
}
