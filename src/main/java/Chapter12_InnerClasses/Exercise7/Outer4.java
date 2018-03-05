package Chapter12_InnerClasses.Exercise7;

/**
 * Exercise 7:   (2) Create a class with a private field and a private method. Create an
 *                   inner class with a method that modifies the outer-class field and calls the outer-class method.
 *                   In a second outer-class method, create an object of the inner class and call its method, then
 *                   show the effect on the outer-class object.
 */
public class Outer4 {

    private int k;

    private void method1(){
        System.out.println("private method performed");
    }

    class Inner{

        public void modify(){
            System.out.println(++k);
            method1();
        }
    }

    public void method2(){
        Inner inner = new Inner();
        inner.modify();
    }

    public static void main(String[] args){
        Outer4 outer4 = new Outer4();
        outer4.method2();
    }
}
