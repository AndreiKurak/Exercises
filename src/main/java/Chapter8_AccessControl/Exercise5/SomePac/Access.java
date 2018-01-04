package Chapter8_AccessControl.Exercise5.SomePac;

public class Access {

    String line = "default";
    public String publicLine = "public";
    private String privateLine = "private";
    protected String protectedLine = "protected";

    public void printLines(){
        System.out.println(line);
        System.out.println(publicLine);
        System.out.println(privateLine);
        System.out.println(protectedLine);
    }

    private void printLines2(){
        System.out.println(publicLine);
        System.out.println(privateLine);
        System.out.println(protectedLine);
    }
}
