package Chapter14_ErrorHandlingWithExceptions;

/**
 * Exercise 1:   (2) Create a class with a main( ) that throws an object of class Exception
 *                   inside a try block. Give the constructor for Exception a String argument. Catch the
 *                   exception inside a catch clause and print the String argument. Add a finally clause and
 *                   print a message to prove you were there.
 */

public class Exercise1 {

    public static void main(String[] args){
        try{
            throw new Exception("string");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("was here");
        }
    }
}
