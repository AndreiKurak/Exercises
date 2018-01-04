package Chapter9_ReusingClasses.Exercise3_4;

/**
 * Exercise 3:   (2) Prove the previous sentence.
 * Exercise 4:   (2) Prove that the base-class constructors are (a) always called and (b) called
 *                   before derived-class constructors.
 */

public class Cartoon extends Drawing {
    public Cartoon() { System.out.println("Cartoon constructor"); }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
