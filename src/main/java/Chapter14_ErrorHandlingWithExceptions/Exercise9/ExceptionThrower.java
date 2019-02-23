package Chapter14_ErrorHandlingWithExceptions.exercise9;

/**
 * Exercise 9:   (2) Create three new types of exceptions. Write a class with a method tha
 *                   throws all three. In main( ), call the method but only use a single catch clause that will
 *                   catch all three types of exceptions.
 */
public class ExceptionThrower {

    public void throwEx() throws ParserException, ValidationException, FilepathException{
        //some exception thrown...
    }

    public static void main(String[] args){
        ExceptionThrower thrower = new ExceptionThrower();
        try {
            thrower.throwEx();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
