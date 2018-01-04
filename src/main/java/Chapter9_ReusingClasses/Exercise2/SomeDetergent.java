package Chapter9_ReusingClasses.Exercise2;

/**
 * Exercise 2:   (2) Inherit a new class from class Detergent. Override scrub( ) and add a
 *                   new method called sterilize( ).
 */

public class SomeDetergent extends Detergent {

    public void scrub(){
        append(" SomeDetergent.scrub()");
        super.scrub();
    }

    public void sterilize(){
        append(" SomeDetergent.sterilize()");
    }

    public static void main(String[] args){
        SomeDetergent someDetergent = new SomeDetergent();
        someDetergent.scrub();
        someDetergent.apply();
        someDetergent.dilute();
        someDetergent.foam();
        someDetergent.sterilize();
        System.out.println(someDetergent);
    }

}
