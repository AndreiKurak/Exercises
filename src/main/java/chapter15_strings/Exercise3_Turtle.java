package chapter15_strings;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Exercise 3:   (1) Modify Turtle.java so that it sends all output to System.err.  
 */

public class Exercise3_Turtle {

    private String name;
    private Formatter f;
    public Exercise3_Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }
    public static void main(String[] args) {
        PrintStream outAlias = System.err;  //System.out -> System.err
        Exercise3_Turtle tommy = new Exercise3_Turtle("Tommy",
                new Formatter(System.err));
        Exercise3_Turtle terry = new Exercise3_Turtle("Terry",
                new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}
