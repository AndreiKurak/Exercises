package Chapter14_ErrorHandlingWithExceptions.exercise25;

public class C extends B {

    public void throwEx() throws C {
        System.out.println("C thrown");
        throw new C();
    }
}
