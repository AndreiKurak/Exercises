package Chapter7_Initialization_and_Cleanup;

/**
 * Exercise 17:   (2) Create a class with a constructor that takes a String argument. During
 *                    construction, print the argument. Create an array of object references to this class, but don’t
 *                    actually create objects to assign into the array. When you run the program, notice whether
 *                    the initialization messages from the constructor calls are printed.
 * Exercise 18:   (1) Complete the previous exercise by creating objects to attach to the array
 *                    of references.
 */
public class Exercise17_18 {

    static String sign = "!";

    Exercise17_18(String s){
        System.out.print(s + sign +" ");
        sign = sign + "!";
    }

    public static void main(String[] args){
        Exercise17_18[] ex = new Exercise17_18[10];
        for (int i = 0; i<10; i++)
            ex[i] = new Exercise17_18("hi");
    }
}
