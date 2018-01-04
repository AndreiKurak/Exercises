package Chapter7_Initialization_and_Cleanup;

/**
 * Exercise 8:   (1) Create a class with two methods. Within the first method, call the second
 *                   method twice: the first time without using this, and the second time using this—just to see it
 *                   working; you should not use this form in practice.
 */
public class Exercise8 {

    public void f(){
        System.out.println("Did something happen?");
    }

    public void g(){
        //f();
        this.f();
    }

    public static void main(String[] args){
        Exercise8 ex = new Exercise8();
        ex.g();
    }
}
