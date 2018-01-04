package Chapter6_ControllingExecution;

/**
 * Exercise 7:   (1) Modify Exercise 1 so that the program exits by using the break keyword
 *                   at value 99. Try using return instead.
 */
public class Exercise7 {

    public static void main(String[] args){
        for (int i = 1; i<=100; i++){
            if (i == 99)
                //break;
                return;
            System.out.print(i + " ");
        }
    }
}
