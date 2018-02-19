package Chapter11_Interfaces.Exercise3;

/**
 * Exercise 3:   (2) Create a base class with an abstract print( ) method that is overridden
 *                   in a derived class. The overridden version of the method prints the value of an int variable
 *                   defined in the derived class. At the point of definition of this variable, give it a nonzero value.
 *                   In the base-class constructor, call this method. In main( ), create an object of the derived
 *                   type, and then call its print( ) method. Explain the results.
 */
public class DerivedClass extends BaseAbstractClass {

    int k = 7;

    void print(){
        System.out.println(k);
    }

    public static void main(String[] args){
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.print();
    }
}
