package Chapter14_ErrorHandlingWithExceptions.exercise25;

/**
 * Exercise 25:   (2) Create a three-level hierarchy of exceptions. Now create a base-class A
 *                    with a method that throws an exception at the base of your hierarchy. Inherit B from A and
 *                    override the method so it throws an exception at level two of your hierarchy. Repeat by
 *                    inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
 */

public class A extends Exception {

    public void throwEx() throws A{
        System.out.println("A thrown");
        throw new A();
    }

    public static void main(String[] args){
        try {
            A ex = new C();
            ex.throwEx();
        }
    /*    catch (C ex){
            System.out.println("1");
        }*/
        catch (B ex){
            System.out.println("2");
        }
        catch (A ex){
            System.out.println("3");
        }
    }
}
