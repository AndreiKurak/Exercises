package Chapter10_Polymorphism.Exercise10;

/**
 * Exercise 10:   (3) Create a base class with two methods. In the first method, call the
 *                    second method. Inherit a class and override the second method. Create an object of the
 *                    derived class, upcast it to the base type, and call the first method. Explain what happens.
 */
public class BaseClass {

    public void first(){
        System.out.println("first");
        second();
    }

    public void second(){
        System.out.println("second");
    }

    public static void main(String[] args){
        BaseClass baseClass = new DerivedClass();
        baseClass.first();
    }
}
