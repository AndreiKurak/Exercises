package Chapter12_InnerClasses.Exercise5;

public class AnotherClass {

    public static void main(String[] args){
        Outer3 outer3 = new Outer3();
        Outer3.Inner inner = outer3.new Inner();
        System.out.println(inner);
    }
}
