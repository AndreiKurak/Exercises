package Chapter10_Polymorphism.Exercise1;

/**
 * Exercise 1:   (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 *                   Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 */

public class Cycle {

    public static void ride(Cycle cycle){
        System.out.println(cycle);
    }

    public String toString(){
        return "Cycle";
    }

    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        ride(bicycle);
        ride(unicycle);
    }
}
