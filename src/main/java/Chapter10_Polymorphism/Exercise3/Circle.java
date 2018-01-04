package Chapter10_Polymorphism.Exercise3;

public class Circle extends Shape {
    public void draw() { System.out.println("Circle.draw()"); }
    public void erase() { System.out.println("Circle.erase()"); }
    public void name(){
        System.out.println("circle");
    }
}
