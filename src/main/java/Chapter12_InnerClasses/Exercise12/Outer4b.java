package Chapter12_InnerClasses.Exercise12;

/**
 * Exercise 12:   (1) Repeat Exercise 7 using an anonymous inner class.
 */
public class Outer4b {
    private int k;

    private void method1(){
        System.out.println("private method performed");
    }

    public Inner inner(){
        return new Inner(){

            public void modify(){
                System.out.println(++k);
                method1();
            }
        };
    }

    public void method2(){
        Inner inner = inner();
        inner.modify();
    }

    public static void main(String[] args){
        Outer4b outer4 = new Outer4b();
        outer4.method2();
    }
}
