package Chapter7_Initialization_and_Cleanup;

/**
 * Exercise 2:   (2) Create a class with a String field that is initialized at the point of
 *                   definition, and another one that is initialized by the constructor. What is the difference
 *                   between the two approaches?
 */
public class Exercise2 {

    String string1 = "newString";

    Exercise2(){
        String string2 = "newString2";
    }
}
