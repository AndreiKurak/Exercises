package Chapter8_AccessControl.Exercise8;

public class MainForEx8 {

    public static void main(String[] args){
        System.out.println(ConnectionManager.getConnection(5));
        System.out.println(ConnectionManager.getConnection(3));
    }
}
