package Chapter11_Interfaces.Exercise18;

/**
 * Exercise 18:   (2) Create a Cycle interface, with implementations Unicycle, Bicycle
 *                    and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
 */
public class Factories {
    public static void CycleUser(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.draw();
        cycle.erase();
    }

    public static void main(String[] args){
        CycleUser(new UnicycleFactory());
        CycleUser(new BicycleFactory());
    }
}
