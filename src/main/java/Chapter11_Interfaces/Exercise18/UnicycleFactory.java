package Chapter11_Interfaces.Exercise18;

public class UnicycleFactory implements CycleFactory {

    public Cycle getCycle(){
        return new Unicycle();
    }
}
