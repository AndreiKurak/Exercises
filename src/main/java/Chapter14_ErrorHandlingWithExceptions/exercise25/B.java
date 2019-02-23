package Chapter14_ErrorHandlingWithExceptions.exercise25;

public class B extends A {

    public void throwEx() throws B{
        System.out.println("B thrown");
        throw new B();
    }
}
