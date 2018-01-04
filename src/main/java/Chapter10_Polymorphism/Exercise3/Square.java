package Chapter10_Polymorphism.Exercise3;

public class Square extends Shape {
    public void draw() { System.out.println("Square.draw()"); }
    public void erase() { System.out.println("Square.erase()"); }
    public void name(){
        System.out.println("square");
    }
}
