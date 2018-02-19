package Chapter11_Interfaces.Exercise12;

/**
 * Exercise 12:   (2) In Adventure.java, add an interface called CanClimb, following the
 *                    form of the other interfaces.
 */
public class Advanture {

    public static void f(CanFight x){
        x.fight();
    }

    public static void s(CanSwim x){
        x.swim();
    }

    public static void c(CanClimb x){
        x.climb();
    }

    public static void a(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args){
        Hero hero = new Hero();
        f(hero);
        s(hero);
        c(hero);
        a(hero);
    }
}
