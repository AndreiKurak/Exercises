package Chapter14_ErrorHandlingWithExceptions.exercise14_and_15;

/**
 * Exercise 14:   (2) Show that OnOffSwitch.java can fail by throwing a
 *                    RuntimeException inside the try block.
 * Exercise 15:   (2) Show that WithFinally.java doesn’t fail by throwing a
 *                    RuntimeException inside the try block.
 *
 */
public class Main {

    public class OnOffException1 extends Exception {}

    public class OnOffException2 extends Exception {}


    public static void main(String[] args) {
        Switch sw = new Switch();
        try {
            sw.on();
            // Code that can throw exceptions...
            OnOffSwitch.f();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
