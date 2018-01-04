package Chapter7_Initialization_and_Cleanup;

/**
 * Exercise 10:   (2) Create a class with a finalize( ) method that prints a message. In
 *                    main( ), create an object of your class. Explain the behavior of your program.
 * Exercise 11:   (4) Modify the previous exercise so that your finalize( ) will always be
 *                    called.
 */
public class Exercise10_11 {

    protected void finalize(){
        System.out.println("Method called");
    }

    public static void main(String[] args){
        Exercise10_11 ex = new Exercise10_11();
        System.gc();
    }
}
