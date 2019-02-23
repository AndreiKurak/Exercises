package Chapter14_ErrorHandlingWithExceptions.exercise19;

/**
 * Exercise 19:   (2) Repair the problem in LostMessage.java by guarding the call in the
 *                    finally clause.
 */

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                }
                catch (Exception ex){
                    System.out.println(ex.getClass() + " caught");
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
