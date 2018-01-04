package Chapter6_ControllingExecution;

import java.util.Random;

/**
 * Exercise 2:   (2) Write a program that generates 25 random int values. For each value,
 *                   use an if-else statement to classify it as greater than, less than, or equal to a second
 *                   randomly generated value.
 */
public class Exercise2 {

    public static void comparison(int a, int b){
        if (a > b)
            System.out.println(a + " greater than " + b);
        else if (a < b)
            System.out.println(a + " less than " + b);
        else
            System.out.println(a + " equal " + b);
    }

    public static void main(String[] args){
        Random rand = new Random();
        int value = 0;
        int value1 = 0;
        int value2 = 0;
        for (int i = 0; i<25; i++){
            value = rand.nextInt(100);
            if (i == 1){
                value2 = rand.nextInt(100);
                Exercise2.comparison(value1, value2);
                value = value2;
            }
            value1 = value;
            if (i >= 1)
                Exercise2.comparison(value, value2);
            System.out.println(value);
        }
    }

}
