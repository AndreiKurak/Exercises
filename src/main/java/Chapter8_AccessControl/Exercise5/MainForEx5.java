package Chapter8_AccessControl.Exercise5;

import Chapter8_AccessControl.Exercise5.SomePac.Access;

public class MainForEx5 {

    public static void main(String[] args){
        Access access = new Access();
        access.printLines();
        //access.printLines2();
        System.out.println(access.publicLine + "!?");
        //System.out.println(access.privateLine + "!?");
    }
}
