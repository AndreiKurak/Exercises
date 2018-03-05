package Chapter12_InnerClasses.Exercise26;

public class Outer2 {

    class Inner2 extends Outer1.Inner1{
        Inner2(Outer1 outer1, String s){
            outer1.super(s);
        }
    }

    public static void main(String[] args){
        Outer1 outer1 = new Outer1();
        Outer2 outer2 = new Outer2();
        Inner2 inner2 = outer2.new Inner2(outer1, "print");
        inner2.method1();
    }
}
