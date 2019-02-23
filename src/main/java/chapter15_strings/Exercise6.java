package chapter15_strings;

/**
 * Exercise 6:   (2) Create a class that contains int, long, float and double fields. Create a
 *                   toString( ) method for this class that uses String.format( ), and demonstrate that your
 *                   class works correctly.
 */

public class Exercise6 {

    private int intValue = 8;
    private long longValue = 100500;
    private float floatValue = 10.5f;
    private double doubleValue = 15.44;

    public String toString() {
        return String.format("int - %s, long - %s, float - %f, double - %s", intValue, longValue, floatValue, doubleValue);
    }

    public static void main(String[] args) {
        System.out.print(new Exercise6());
    }
}
