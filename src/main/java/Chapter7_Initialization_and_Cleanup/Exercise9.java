package Chapter7_Initialization_and_Cleanup;

/**
 * Exercise 9:   (1) Create a class with two (overloaded) constructors. Using this, call the
 *                   second constructor inside the first one.
 */

public class Exercise9 {

    Exercise9(int i){
        System.out.println("int i = " + i);
    }

    Exercise9(){
        this(56);
    }

    public static void main(String[] args){
        Exercise9 ex = new Exercise9();
    }
}
