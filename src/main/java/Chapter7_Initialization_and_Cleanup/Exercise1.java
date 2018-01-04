package Chapter7_Initialization_and_Cleanup;

/**
 * Exercise 1:   (1) Create a class containing an uninitialized String reference. Demonstrate
 *                   that this reference is initialized by Java to null.
 */
public class Exercise1 {

    public static void main(String[] args){
        String newString = new String();
        System.out.println(newString);
    }
}
