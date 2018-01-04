package Chapter9_ReusingClasses.Exercise8;

public class DerivedClass extends BaseClass {

    DerivedClass(){
        System.out.println("DerivedClass");
    }

    DerivedClass(int i){
        System.out.println("DerivedClass with arg");
    }

    public static void main(String[] args){
        DerivedClass derivedClass = new DerivedClass();
        System.out.println("--------");
        DerivedClass derivedClass1 = new DerivedClass(10);
    }
}
