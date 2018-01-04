package Chapter8_AccessControl.Exercise4.OneMorePac;

public class ClassWithProtected {

    String s = "someString";

    protected void printLine(){
        System.out.println(s);
    }

    public void printLine2(){
        System.out.println(s + "!");
    }
}
