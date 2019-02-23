package Chapter14_ErrorHandlingWithExceptions.exercise14_and_15;


public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f()
            throws Main.OnOffException1,Main.OnOffException2 { throw new RuntimeException(); }

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
            sw.off();
        } catch(Main.OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(Main.OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
