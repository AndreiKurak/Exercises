package Chapter9_ReusingClasses.Exercise1;

/**
 * Exercise 1:   (2) Create a simple class. Inside a second class, define a reference to an object
 *                   of the first class. Use lazy initialization to instantiate this object.
 */
public class SimpleMain {

    SimpleClass simpleClass;

    public SimpleClass getObject(){
        this.simpleClass = new SimpleClass();
        return simpleClass;
    }

    public static void main(String[] args){
        SimpleMain main = new SimpleMain();
        System.out.println(main.getObject());
    }
}
