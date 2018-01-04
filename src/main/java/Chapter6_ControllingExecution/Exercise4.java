package Chapter6_ControllingExecution;

/**
 *   Exercise 4:   (3) Write a program that uses two nested for loops and the modulus
 *                     operator (%) to detect and print prime numbers (integral numbers that are not evenly
 *                     divisible by any other numbers except for themselves and 1).
 */

public class Exercise4 {

    public static void main(String[] args){
        int n = 100;
        boolean k = true;
        for (int i = 2; i<=n; i++){
            k = true;
            for (int j = 2; j<9; j++){
                if ((i % j == 0) && (i != j))
                    k = false;
            }
            if (k)
                System.out.print(i + " ");
        }
    }

}
