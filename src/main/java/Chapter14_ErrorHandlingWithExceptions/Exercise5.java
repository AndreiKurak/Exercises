package Chapter14_ErrorHandlingWithExceptions;

import java.util.Scanner;

/**
 * Exercise 5:   (3) Create your own resumption-like behavior using a while loop that
 *                   repeats until an exception is no longer thrown.
 */
public class Exercise5 {

    public static void main(String[] args){ //???
        int i = 1;
        while (i < 10){
            try {
                Scanner in = new Scanner(System.in);
                i = in.nextInt();
                if (i < 10) {
                    throw new Exception();
                }
            }
            catch (Exception ex){
                System.err.println("incorrect value - try again");
            }
        }
        System.out.println(i);
    }
}
