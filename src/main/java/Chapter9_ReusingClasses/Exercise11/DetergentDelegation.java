package Chapter9_ReusingClasses.Exercise11;

import Chapter9_ReusingClasses.Exercise2.Cleanser;

public class DetergentDelegation {

    Cleanser cleanser = new Cleanser();

    public void scrub(){
        cleanser.append(" Detergent.scrub()");
        cleanser.scrub();
    }

    public void dilute(){
        cleanser.dilute();
    }

    public void apply(){
        cleanser.apply();
    }

    public void foam(){
        cleanser.append(" Detergent.foam()");
    }

    public String toString(){
        return cleanser.toString();
    }

    public static void main(String[] args){
        DetergentDelegation detergent = new DetergentDelegation();
        detergent.scrub();
        detergent.apply();
        detergent.dilute();
        detergent.foam();
        System.out.println(detergent);
    }
}
