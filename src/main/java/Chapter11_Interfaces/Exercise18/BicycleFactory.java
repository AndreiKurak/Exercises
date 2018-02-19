package Chapter11_Interfaces.Exercise18;

public class BicycleFactory implements CycleFactory {

    public Cycle getCycle(){
        return new Bicycle();
    }
}
