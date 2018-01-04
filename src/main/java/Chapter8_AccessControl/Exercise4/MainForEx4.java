package Chapter8_AccessControl.Exercise4;

/**
 * Exercise 4:   (2) Show that protected methods have package access but are not public.
 */

import Chapter8_AccessControl.Exercise4.OneMorePac.*;

public class MainForEx4 {

    public static void main(String[] args){
        ClassWithProtected withProtected = new ClassWithProtected();
        //withProtected.printLine();
        withProtected.printLine2();
    }
}
