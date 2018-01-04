package Chapter7_Initialization_and_Cleanup.Exercise3_4;

/**
 * Exercise 3:   (1) Create a class with a default constructor (one that takes no arguments)
 *                   that prints a message. Create an object of this class.
 * Exercise 4:   (1) Add an overloaded constructor to the previous exercise that takes a
 *                   String argument and prints it along with your message.
 */
public class Exercise3_4 {

    Exercise3_4(){
        System.out.println("some Message");
    }
    Exercise3_4(String s){
        System.out.println("some Message: " + s);
    }
}
