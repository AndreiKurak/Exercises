package Chapter11_Interfaces.Exercise5_6.Pac_for_Implementation;

import Chapter11_Interfaces.Exercise5_6.Pac_for_Interface.Car;

/**
 * Exercise 5:   (2) Create an interface containing three methods, in its own package.
 *                   Implement the interface in a different package.
 */

/**
 * Exercise 6:   (2) Prove that all the methods in an interface are automatically public.
 */

public class Toyota implements Car {

    public void start(){
        System.out.println("to start press the button");
    }

    public void ride(){
        //
    }

    public void stop(){
        //
    }
}
